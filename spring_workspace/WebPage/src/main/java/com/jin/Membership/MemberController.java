package com.jin.Membership;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("membership")
//session 생성
//@SessionAttributes("sessionAuthNum")
public class MemberController {
	private static final Logger logger = 
			LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private IMemberService iMemberServ;
	
	@RequestMapping(value = "memberProc")
	public String memberProc(Model model, Member member, Postcode postcode) {
		String msg = iMemberServ.memberProc(member, postcode);
		model.addAttribute("msg", msg);
		return "forward:/index?formPath=membership";
	}
	@RequestMapping(value = "isExistID")
	public String isExistID(Model model, Member member) {
		iMemberServ.IsExistID(/* login */member);
		model.addAttribute("msg", "isExistID");
		return "forward:/index?formPath=membership";
	}
	
	@RequestMapping(value = "sendAuth")
	public String sendAuth(Model model, Member member,
			HttpSession session) {
		/* String randNum = */iMemberServ.sendAuth(member);
		//session 저장
//		model.addAttribute("sessionAuthNum", randNum);
//		session.setAttribute("sessionAuthNum", randNum);
		String randNum = (String)session.getAttribute("authNum");
		
		model.addAttribute("msg", randNum);
		return "forward:/index?formPath=membership";
	}
	@RequestMapping(value = "authConfirm")
	public String authConfirm(Model model, Member member, 
			@RequestParam("authNum") String authNum
//			session 얻기
//			@ModelAttribute("sessionAuthNum")String sAuthNum, 
//			SessionStatus session
//			HttpSession session
			) {
//		logger.warn((String)session.getAttribute("sessionAuthNum"));
//		session.setMaxInactiveInterval(1);
//		String msg = iMemberServ.authConfirm(authNum, sAuthNum, session);
//		model.addAttribute("msg", msg);
		String msg = iMemberServ.authConfirm(authNum);
		model.addAttribute("msg", msg);
		return "forward:/index?formPath=membership";
	}
	
	@RequestMapping(value = "postSearch")
	public String postSearch(Model model) {
		return "MemberForm/searchPostcodeForm";
	}
	@RequestMapping(value = "searchZipcode")
	public String searchZipcode(Model model,
			@RequestParam("addr") String addr) {
		List<Zipcode> zipcodeLst = iMemberServ.searchZipcode(addr);
		model.addAttribute("zipcodeLst", zipcodeLst);
		return "MemberForm/searchPostcodeForm";
	}
}
