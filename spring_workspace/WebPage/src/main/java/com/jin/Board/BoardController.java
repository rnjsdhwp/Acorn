package com.jin.Board;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jin.Common.BoardTools;

@Controller
@RequestMapping("board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired private IBoardService iBoardServ;
	
	@RequestMapping(value="write")
	public String write(Model model/*,
			@RequestParam(required = false) boolean modify,
			Board board*/) {
//		if(modify)	model.addAttribute("btnName", "수정");
//		else		model.addAttribute("btnName", "글쓰기");
		
		model.addAttribute("btnName", "글쓰기");
		model.addAttribute("proc", "writeProc");
		return "forward:/index?formPath=write";
	}
	
	@RequestMapping(value="modify")
	public String modify(Model model,
			Board board) {
		model.addAttribute("btnName", "수정");
		model.addAttribute("proc", "modifyProc");
		return "forward:/index?formPath=write";
	}
	@RequestMapping(value="writeProc")
	public String writeProc(Board board, HttpServletRequest req) {
		iBoardServ.writeProc(board, req);
		return "forward:/board/boardProc";
	}
	@RequestMapping(value="modifyProc")
	public String modifyProc(Board board) {
		iBoardServ.Modify(board);
		return "forward:/board/boardProc";
	}
	
	@RequestMapping(value="boardProc")
	public String boardProc(Model model, HttpServletRequest req) {
//		int currentPage = 1;
//		int pageBlock = 5;
//		int totalPage = 30;
//		String url = req.getContextPath() + "/board/pageProc?currentPage=";
		
		List<Board> boardLst = iBoardServ.ReadBoard(req);
		model.addAttribute("boardLst", boardLst);
		model.addAttribute("navi", iBoardServ.getNavi(req));
		return "forward:/index?formPath=board";
	}
//	@RequestMapping(value="pageProc")
//	public String pageProc(Model model, @RequestParam int currentPage, HttpServletRequest req) {
//		List<Board> boardLst = iBoardServ.ReadBoard(currentPage);
//		model.addAttribute("boardLst", boardLst);
//		model.addAttribute("navi", iBoardServ.getNavi(req));
//		return "forward:/index?formPath=board";
//	}
	@RequestMapping(value="detailRead")
	public String detailRead(Model model,
			@RequestParam("writeNo") String writeNo) {
		Map<String, Object> returnMap = iBoardServ.DetailRead(writeNo);
		model.addAttribute("board", returnMap.get("board"));
		model.addAttribute("attachFileMap", returnMap.get("attachFileMap"));
		return "forward:/index?formPath=view";
	}
	@RequestMapping(value="reply")
	public String reply(Model model,
			@RequestParam("pno") String pno) {
		logger.warn("pno"+pno);
		model.addAttribute("pno", pno);
		return "forward:/index?formPath=write";
	}
	@RequestMapping(value="delete")
	public String delete(@RequestParam String no) {
		iBoardServ.Delete(no);
		return "forward:/board/boardProc";
	}
	@RequestMapping(value="deletes")
	public String deletes(HttpServletRequest req) {
		String [] chkboxes = req.getParameterValues("chkbox");
//		logger.warn(chkboxes.length + " : " + chkboxes[0]);
		iBoardServ.Deletes(chkboxes);
		return "forward:/board/boardProc";
	}
}
