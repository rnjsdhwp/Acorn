package com.jin.Board;

import java.sql.Date;

//�Խ��� 
public class Board {

	 // �۹�ȣ 
	 private int no;
	
	 // ���̵� 
	 private String id;
	
	 // ���� 
	 private String title;
	
	 // �ۼ��� 
	 private Date writedate;
	
	 // ���� 
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
	
	// Board �� ����
	public void CopyData(Board param)
	{
	    this.no = param.getNo();
	    this.id = param.getId();
	    this.title = param.getTitle();
	    this.writedate = param.getWritedate();
	    this.content = param.getContent();
	}
}
