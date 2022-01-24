package com.jin.Board;

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
	public String board(Board board,
			HttpServletRequest req) {
		iBoardServ.writeProc(board, req);
		return "forward:/index?formPath=write";
	}
}
