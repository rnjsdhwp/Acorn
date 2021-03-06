<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("div.title").css("cursor", "pointer").click(function(){
			let no = $(this).attr("id");
			$("#writeNo").val(no);
			$("#frm").attr("action", "${urlHome }board/detailRead");
			$("#frm").submit();
		})
		
		$("#allSelect").click(function(){
			/* .(클래스가) chkbox인 prop(속성) 중 checked에 this.checked를 저장 */
			$(".chkbox").prop("checked", this.checked);
			console.log($(".chkbox").length);
			/* checked가 true인 checkbox의 개수 출력 */
			console.log($(".chkbox:checked").length);
		})
		
		$(".chkbox").click(function(){
			/* if($(".chkbox").length == $(".chkbox:checked").length)
				$("#allSelect").prop("checked", true);
			else
				$("#allSelect").prop("checked", false); */
			
			let checked = $(".chkbox").length == $(".chkbox:checked").length;
			$("#allSelect").prop("checked", checked);
		})
	})
</script>

<center>
	<form id="frm" action="${urlHome }board/write" method="post">
		<input type="hidden" id="writeNo" name="writeNo"/>
		<table style="width: 650px;">
			<thead>
				<tr>
					<th style="width: 40px; height: 20px;" align="center">선택</th>
					<th style="width: 330px; height: 20px;" align="center">제 목</th>
					<th style="width: 80px; height: 20px;" align="center">작성자</th>
					<th style="width: 120px; height: 20px;" align="center">작성일</th>
					<th style="width: 80px; height: 20px;" align="center">조회수</th>
				</tr>
			</thead>
			<tr>
				<td style="width: 40px; height: 20px;" align="center"><hr /></td>
				<td style="width: 330px; height: 20px;" align="center"><hr /></td>
				<td style="width: 80px; height: 20px;" align="center"><hr /></td>
				<td style="width: 120px; height: 20px;" align="center"><hr /></td>
				<td style="width: 80px; height: 20px;" align="center"><hr /></td>
			</tr>
			<c:forEach var="board" items="${boardLst}">
			<tr>
				<td style="width: 40px; height: 40px;" align="center"><input class="chkbox" type="checkbox" name="chkbox" value="${board.no }"/></td>
				<td style="width: 330px; height: 40px;" align="left"><div class="title" id="${board.no }"><pre>${board.title }</pre></div></td>
				<td style="width: 80px; height: 40px;" align="center">${board.id }</td>
				<td style="width: 120px; height: 40px;" align="center">${board.writedate }</td>
				<td style="width: 80px; height: 40px;" align="center">${board.no }</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan=5><hr /></td>
			</tr>
			<tr>
				<td colspan=2><input id="allSelect" type="checkbox" />전체선택</td>
				<td colspan=3 align="right">
					<button formaction="${urlHome }board/deletes" style="width:100px;">삭제</button>
					<button style="width:100px;">글쓰기</button>
				</td>
			</tr>
			<tr>
				<td colspan=5><hr /></td>
			</tr>
		</table>
	</form>
	<!-- 이전 1 2 3 4 다음 -->
	${navi}
	<table>
		<tr>
			<td>
				<form action="${urlHome }board/boardProc">
					<select name="searchName">
						<option value="all">전체</option>
						<option value="title">제목</option>
						<option value="id">작성자</option>
					</select> 
					<input type=text name='searchWord' /> 
					<input type=submit name='searchBtn' value='검색' style="width: 80px;" />
				</form>
			</td>
		</tr>
	</table>
</center>