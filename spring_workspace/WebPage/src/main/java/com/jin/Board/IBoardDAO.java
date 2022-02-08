package com.jin.Board;

import java.util.List;
import java.util.Map;

public interface IBoardDAO {
	void writeProc(Board board);
	void AttachFile(Map<String, String> fileMap);
	List<Board> ReadBoard(Map<String, Object> boardMap);
	Board DetailRead(String writeNo);
	Map<String, String> DetailReadAttach(String writeNo);
	void Hits(Map<String, Integer> hitsMap);
	void InsertReply(Map<String, Integer> replyMap);
	void Modify(Board board);
	void Delete(String no);
	int BoardCount(Map<String, Object> boardMap);
}
