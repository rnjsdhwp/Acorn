<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/" />
<script type="text/javascript">
	function popupWindow(){
		/*
		//window.open(접근 URL, 제목, 크기)
		let myWindow = window.open("http://www.google.com", "googlePopup", "width=200, height=100");
		//window에 새로운 내용을 작성할 경우 사용
		myWindow.document.write("test page");
		*/
		window.name="우편번호 검색";
		window.open("${urlHome }membership/postSearch", "_blank", "top=220, left=570, width=400, height=400");
	}
</script>

<center>
<h3><font color="red">${msg }</font></h3>
	<form action="${urlHome }membership/memberProc" method="post">
		<table>
			<tr>
				<td colspan="4" align="center"><hr />필수사항
					<hr /></td>
			</tr>
			<tr>
				<td align='right' height=40>아이디</td>
				<td><input type=text name='id' placeholder='id 입력' /></td>
				<td colspan="2"><button formaction="${urlHome }membership/isExistID">중복 확인</button></td>
			</tr>
			<tr>
				<td align='right' height=40>패스워드</td>
				<td><input type=text name='pw' placeholder='pw 입력' /></td>
				<td align='right'>패스워드 확인</td>
				<td><input type=text name='pwOk' placeholder='pw 입력' /></td>
			</tr>
			<tr>
				<td align='right' height=40>E-Mail</td>
				<td><input type=text name='email' placeholder='E-Mail 입력' /></td>
				<td colspan="2"><button formaction="${urlHome }membership/sendAuth">인증번호 전송</button></td>
			</tr>
			<tr>
				<td align='right'>인증번호</td>
				<td><input type=text name='authNum' placeholder='인증번호 입력' /></td>
				<td colspan="2"><button formaction="${urlHome }membership/authConfirm">인증번호 확인</button></td>
			</tr>
			<tr>
				<td colspan="4" align="center"><hr />선택사항<hr /></td>
			</tr>
			<tr>
				<td align='right'>우편번호</td>
				<td><input type=text id='zipcode' name='zipcode' readonly="readonly" /></td>
				<td colspan="2"><input type="button" onclick="popupWindow()" value="우편번호 검색"/></td>
			</tr>
			<tr>
				<td align='right'>주소</td>
				<td colspan="3">
					<input type=text id='addr1' name='addr1' readonly="readonly" style="width: 475px;" />
				</td>
			</tr>
			<tr>
				<td align='right'>상세주소</td>
				<td colspan="3"><input type=text name='addr2'
					style="width: 475px;" /></td>
			</tr>
			<tr>
				<td align='right' width=120>성 별</td>
				<td colspan="3">
					<input type=radio name='gender' value='n' checked="checked" />선택안함 
					<input type=radio name='gender' value='m' />남자
					<input type=radio name='gender' value='w' />여자
				</td>
			</tr>
			<tr>
				<td align='center' height=40 colspan=4>
					<input type=submit value='회원가입' style="width: 120px;" /> 
					<input type=reset value='취소' style="width: 120px;" />
				</td>
			</tr>
		</table>
	</form>
</center>