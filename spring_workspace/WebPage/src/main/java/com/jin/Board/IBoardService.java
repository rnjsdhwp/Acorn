package com.jin.Board;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface IBoardService {
	void writeProc(Board board, HttpServletRequest req);
	List<Board> ReadBoard();
	Map<String, Object> DetailRead(String writeNo);
}
