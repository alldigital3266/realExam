package kr.co.mook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mook.vo.MemberVO;

@Controller
@RequestMapping(value = "/mem")
public class MemController {
	
	@RequestMapping( value = "/login")
	public String login() {
		return "login";
	}
	@RequestMapping( value = "/insertForm")
	public String insertForm() {
		return "insertForm";
	}
	@RequestMapping( value = "/main")
	public String mainMenu() {
		return "main";
	}
	@RequestMapping( value = "/update")
	public String update() {
		return "update";
		
	}
	
	
	@RequestMapping( value = "/updateMember")
	public String updateMember(MemberVO vo) {
		return "updateMember";
	}
	
}
