package com.jin.Board;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.jin.Common.BoardTools;

@Service
public class BoardServiceImpl implements IBoardService{
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	@Autowired private IBoardDAO iBoardDAO;
	private final String UPLOADPATH = "/resources/upload/";
	private final int PAGEBLOCK = 4;
	
	@Override
	public void writeProc(Board board ,HttpServletRequest req) {
		Date writeDate = new Date(System.currentTimeMillis());
		board.setWritedate(writeDate);
//		logger.warn(board.getWritedate().toString());
		iBoardDAO.writeProc(board);
		
//		systemFile, originFile 획득
		Map<String, String> fileMap = Upload(req);
//		fno
		if(fileMap.get("systemFile") != null) {
//			logger.warn("systemFile : "+fileMap.get("systemFile"));
//			logger.warn("글쓰기 : "+board.getNo());
			fileMap.put("fno", String.valueOf(board.getNo()));
			iBoardDAO.AttachFile(fileMap);
		}
		
		String pno = req.getParameter("pno");
		if(!"".equals(pno)) {
			Map<String, Integer> replyMap = new HashMap<String, Integer>();
			replyMap.put("no", board.getNo());
			replyMap.put("pno", Integer.parseInt(pno));
			
			iBoardDAO.InsertReply(replyMap);
		}
	}

	private Map<String, String> Upload(HttpServletRequest req) {
		logger.warn("Upload");
		MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)req;
//		업로드한 모든 파일을 iterator에 저장
		Iterator<String> iterator = multiRequest.getFileNames();
		MultipartFile multipartFile = null;
		Map<String, String> fileMap = new HashMap<String, String>();
		
//		iterator.hasNext() 현재 파일 정보를 가지고 있으면 동작
		while(iterator.hasNext()){
//			jsp에서 전달된 name명 (uploadFile)
			String fieldName = iterator.next();
			multipartFile = multiRequest.getFile(fieldName);
			logger.warn("fieldName : "+fieldName);
	        
//			파일이 존재한다면
			if(multipartFile.isEmpty() == false){
				String originFile = multipartFile.getOriginalFilename();
				String filePath = multiRequest.getSession().getServletContext().getRealPath("/");
				InputStream stream = getStream(multipartFile);
				String systemFile = DownloadFile(stream, filePath, originFile);
				
				fileMap.put("originFile", originFile);
				fileMap.put("systemFile", systemFile);
				
//				설명
				logger.warn("------------- file start -------------");
//				jsp에서  전달된 name명 (uploadFile) 
				logger.warn("name : "+multipartFile.getName());
				try {
//					업로드한 파일 정보 (한글이 안깨지게 둘 중 하나 선택)
					logger.warn("filename : "+originFile);
					logger.warn("filename : "+new String(originFile.getBytes("8859_1"), "UTF-8"));
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
//				업로드한 파일의 크기
				logger.warn("size : "+multipartFile.getSize()+"byte");
				logger.warn("-------------- file end --------------\n");;
				logger.warn("filePath : "+filePath);
			}
		}
		return fileMap;
	}
	

	private InputStream getStream(MultipartFile multipartFile) {
		InputStream stream = null;
		try {
			stream = multipartFile.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stream;
	}

//	stream은 데이터의 흐름 정도로 이해
//	주로 음원, 동영상 등을 실시간으로 전송할 경우 stream이라고 표현
	private String DownloadFile(InputStream stream, String filePath, String fileName) {
//		서버에 저장될 파일명
		String systemFile = fileName+System.currentTimeMillis();
		File file = new File(filePath+UPLOADPATH+systemFile);
		try {
			Files.copy(stream, file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return systemFile;
	}

	@Override
	public List<Board> ReadBoard(HttpServletRequest req) {
//		Map<String, Object> boardMap = new HashMap<String, Object>();
		Map<String, Object> boardMap = getBoardMap(req);
		int currentPage = getCurrentPage(req);
		
		boardMap.put("start", 1+(PAGEBLOCK*(currentPage-1)));
		boardMap.put("end", PAGEBLOCK*currentPage);
		
//		String searchName = req.getParameter("searchName");
//		if(searchName != null) {
//			boardMap.put("searchName", searchName);
//			boardMap.put("searchWord", req.getParameter("searchWord"));
//		}
		return iBoardDAO.ReadBoard(boardMap);
	}

	private Map<String, Object> getBoardMap(HttpServletRequest req) {
		Map<String, Object> boardMap = new HashMap<String, Object>();
		String searchName = req.getParameter("searchName");
		
		if(searchName != null) {
			boardMap.put("searchName", searchName);
			boardMap.put("searchWord", req.getParameter("searchWord"));
		}
		
		return boardMap;
	}

	private int getCurrentPage(HttpServletRequest req) {
//		String currentPageStr = req.getParameter("currentPage");
//		int currentPage = 1;
//		
//		if(currentPageStr != null)
//			currentPage = Integer.parseInt(currentPageStr);
		
		String currentPageStr = req.getParameter("currentPage");
		
		if(currentPageStr != null)
			return Integer.parseInt(currentPageStr);
		
		return 1;
	}

	@Override
	public Map<String, Object> DetailRead(String writeNo) {
//		attachFileMap과 board를 저장하여 controller에 전달
//		하지만 두 객체의 자료형이 달라 모든 객체의 최상위 루트(조상)인 object 형으로 사용
		Map<String, Object> returnMap = new HashMap<String, Object>();
		Map<String, String> attachFileMap = iBoardDAO.DetailReadAttach(writeNo);
		Board board = iBoardDAO.DetailRead(writeNo);
		
		returnMap.put("attachFileMap", attachFileMap);
		returnMap.put("board", board);
		
//		writeNo를 정수로 변환하여 no에 저장
		Map<String, Integer> hitsMap = new HashMap<String, Integer>();
		int no = Integer.parseInt(writeNo);
		hitsMap.put("no", no);
		iBoardDAO.Hits(hitsMap);
		
//		attachFileMap에 있는 모든 키를 key에 하나씩 저장
//		현재는 systemFile, originFile 두 key를 얻어냄
//		for(String key : attachFileMap.keySet()) {
//			logger.warn(key + " : " + attachFileMap.get(key));
//		}
		return returnMap;
	}

	@Override
	public void Modify(Board board) {
		iBoardDAO.Modify(board);
	}

	@Override
	public void Delete(String no) {
		iBoardDAO.Delete(no);
	}

	@Override
	public void Deletes(String[] chkboxes) {
		for(String no : chkboxes) {
			iBoardDAO.Delete(no);
		}
	}

	@Override
	public String getNavi(HttpServletRequest req) {
//		String currentPageStr = req.getParameter("currentPage");
//		int currentPage = 1;
		int currentPage = getCurrentPage(req);
		Map<String, Object> boardMap = getBoardMap(req);
		int totalPage = iBoardDAO.BoardCount(boardMap);
		String url = req.getContextPath() + "/board/boardProc?";
		
		if(boardMap.get("searchName") != null) {
			url += "searchName=" + boardMap.get("searchName") + "&";
			url += "searchWord=" + boardMap.get("searchWord") + "&";
		}
		url += "currentPage=";
		
//		if(currentPageStr != null)
//			currentPage = Integer.parseInt(currentPageStr);
		
		return BoardTools.getNavi(currentPage, PAGEBLOCK, totalPage, url);
	}
}
