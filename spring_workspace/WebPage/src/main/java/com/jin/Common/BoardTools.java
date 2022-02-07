package com.jin.Common;

import java.util.List;

public class BoardTools {
	public static String getNavi(int currentPage, int pageBlock, int totalPage, String url) {
		/*
		 * totalPage => 전체 글 : 22 
		 * pageBlock => 한 페이지 글 수 : 5
		 * blockCnt => 총 페이지 수
		 * currentPage => 현재 페이지
		 */ 
		int blockCnt = totalPage/pageBlock;
		if(totalPage % pageBlock > 0) blockCnt++;
		String result = "";
//		현재 페이지가 1페이지가 아니면 [이전] 추가
		if(currentPage != 1)	result+="<a href='"+url+(currentPage-1)+"'> [이전] </a>";
//		네비게이션의 1 2 3 4 형식으로 코드를 만들며 현재 페이지만 b태그 적용
		for(int i=1; i<=blockCnt; i++) {
			if(currentPage == i)	result += "<b>";
			result += "<a href='" + url + i + "'> " + i + " </a>";
			if(currentPage == i)	result += "</b>";
		}
//		현재 페이지가 마지막 페이지가 아니면 [다음] 추가
		if(currentPage != blockCnt) 	result += "<a href='" + url + (currentPage+1) + "'> [다음] </a>";
		return result;
	}
	public static String getSearhWord(List<String> lst, String scriptFuncName) {
		String tag = "<select name='searchSelect'>";
		
		for(String opt:lst)
			tag += "<option>"+opt+"</option>";
		
		tag += "</select>";
		tag += "<input type=text name='search'/>";
		tag += "<input type=button onclick="+scriptFuncName+" name='searchBtn' value='검색' style='width: 80px; '/>";
		return tag;
	}
}
