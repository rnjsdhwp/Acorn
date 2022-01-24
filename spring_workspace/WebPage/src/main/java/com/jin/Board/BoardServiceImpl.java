package com.jin.Board;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.sql.Date;
import java.util.Iterator;

import javax.print.attribute.standard.Fidelity;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class BoardServiceImpl implements IBoardService{
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	@Autowired private IBoardDAO iBoardDAO;
	private final String UPLOADPATH = "/resources/upload/";
	
	@Override
	public void writeProc(Board board ,HttpServletRequest req) {
		Date writeDate = new Date(System.currentTimeMillis());
		board.setWritedate(writeDate);
//		logger.warn(board.getWritedate().toString());
		
		iBoardDAO.writeProc(board);
		Upload(req);
	}

	private void Upload(HttpServletRequest req) {
		MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)req;
//		업로드한 모든 파일을 iterator에 저장
		Iterator<String> iterator = multiRequest.getFileNames();
		MultipartFile multipartFile = null;
		logger.warn("Upload");
//		iterator.hasNext() 현재 파일 정보를 가지고 있으면 동작
		while(iterator.hasNext()){
//			jsp에서 전달된 name명 (uploadFile)
			String fieldName = iterator.next();
			logger.warn("fieldName : "+fieldName);
			multipartFile = multiRequest.getFile(fieldName);
	        
//			파일이 존재한다면
			if(multipartFile.isEmpty() == false){
				logger.warn("------------- file start -------------");
//				jsp에서  전달된 name명 (uploadFile) 
				logger.warn("name : "+multipartFile.getName());
				try {
//					업로드한 파일 정보 (한글이 안깨지게 둘 중 하나 선택)
					logger.warn("filename : "+multipartFile.getOriginalFilename());
					logger.warn("filename : "+new String(multipartFile.getOriginalFilename().getBytes("8859_1"), "UTF-8"));
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
//				업로드한 파일의 크기
				logger.warn("size : "+multipartFile.getSize()+"byte");
				logger.warn("-------------- file end --------------\n");;
				
				try {
					String filePath = multiRequest.getSession().getServletContext().getRealPath("/");
					logger.warn(filePath);
					DownloadFile(multipartFile.getInputStream(), 
							filePath, 
							multipartFile.getOriginalFilename());
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

//	stream은 데이터의 흐름 정도로 이해
//	주로 음원, 동영상 등을 실시간으로 전송할 경우 stream이라고 표현
	private void DownloadFile(InputStream stream, String filePath, String fileName) {
		File file = new File(filePath+UPLOADPATH+fileName+System.currentTimeMillis());
		try {
			Files.copy(stream, file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
