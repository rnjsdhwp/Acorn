package com.jin.Board;

import javax.servlet.http.HttpServletRequest;

public interface IBoardService {

	void writeProc(Board board, HttpServletRequest req);

}
