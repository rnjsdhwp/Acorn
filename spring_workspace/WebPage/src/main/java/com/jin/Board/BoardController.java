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

@Controller
@RequestMapping("board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired private IBoardService iBoardServ;
	
	@RequestMapping(value="write")
	public String write(Model model) {
		return "forward:/index?formPath=write";
	}
	@RequestMapping(value="writeProc")
	public String writeProc(Board board, HttpServletRequest req) {
		iBoardServ.writeProc(board, req);
		return "forward:/board/boardProc";
	}
	@RequestMapping(value="boardProc")
	public String boardProc(Model model) {
		List<Board> boardLst = iBoardServ.ReadBoard();
		model.addAttribute("boardLst", boardLst);
		return "forward:/index?formPath=board";
	}
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
}
