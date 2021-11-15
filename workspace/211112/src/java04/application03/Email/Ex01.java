package java04.application03.Email;

import com.jin.mail.JinsMail;

public class Ex01 {
	public static void main(String[] args) {
		JinsMail mail = new JinsMail();
		 
		//mail.setId("발신자googleID"); 
		//mail.setPw("발신자googlePW"); 
		//mail.setSndUsr("보내는사람이름", "보내는사람이메일"); 
		//mail.SendMail("받는사람이메일", "보낼제목", "보낼내용");
		
		System.out.println("메일 전송 완료");
	}
}
