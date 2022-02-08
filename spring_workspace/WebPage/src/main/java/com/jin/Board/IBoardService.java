package com.jin.Board;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface IBoardService {
	void writeProc(Board board, HttpServletRequest req);
	List<Board> ReadBoard(HttpServletRequest req);
	Map<String, Object> DetailRead(String writeNo);
	void Modify(Board board);
	void Delete(String no);
	void Deletes(String[] chkboxes);
	String getNavi(HttpServletRequest req);
}
