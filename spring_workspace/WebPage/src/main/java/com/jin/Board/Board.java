package com.jin.Board;

import java.sql.Date;

//게시판 
public class Board {

	 // 글번호 
	 private int no;
	
	 // 아이디 
	 private String id;
	
	 // 제목 
	 private String title;
	
	 // 작성일 
	 private Date writedate;
	
	 // 내용 
	 private String content;
	 
	 private int hit;
		
	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	 public int getNo() {
	     return no;
	 }
	
	 public void setNo(int no) {
	     this.no = no;
	 }
	
	 public String getId() {
	     return id;
	 }
	
	 public void setId(String id) {
	     this.id = id;
	 }
	
	 public String getTitle() {
	     return title;
	 }
	 
	 public void setTitle(String title) {
	    this.title = title;
	}
	
	public Date getWritedate() {
	    return writedate;
	}
	
	public void setWritedate(Date writedate) {
	    this.writedate = writedate;
	}
	
	public String getContent() {
	    return content;
	}
	
	public void setContent(String content) {
	    this.content = content;
	}
	
	// Board 모델 복사
	public void CopyData(Board param)
	{
	    this.no = param.getNo();
	    this.id = param.getId();
	    this.title = param.getTitle();
	    this.writedate = param.getWritedate();
	    this.content = param.getContent();
	}
}
