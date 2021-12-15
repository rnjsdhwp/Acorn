<%@ page pageEncoding="utf-8" %>

<%!
	//서블릿 코드로 변환될 때 클래스 안으로 코드 삽입됨
	//변수선언하면 멤버변수
	private String name;
	private String address;
	
	//메서드 선언 가능
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
%>