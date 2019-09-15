package com.personal.kimhs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.personal.kimhs.model.Members;

@Controller
public class MembersController {
	@GetMapping("/regist")
	public String toRegist() {
		return "members/regist";
	}
	
	@PostMapping("/registConfirm")
	public String toRegistConfirm(HttpServletRequest req) {
		System.out.println(req.getParameter("m_id"));
		System.out.println(req.getParameter("m_pw"));
		System.out.println(req.getParameter("m_pwConfirm"));
		System.out.println(req.getParameter("m_name"));
		System.out.println(req.getParameter("m_nick"));
		System.out.println(req.getParameter("m_birth"));
		System.out.println(req.getParameter("m_email"));
		System.out.println(req.getParameter("m_tel"));
		System.out.println(req.getParameter("m_address"));
		System.out.println(req.getParameter("m_regdate"));
		System.out.println(req.getParameter("m_type"));
		
		Members m = new Members();
		m.setM_id(req.getParameter("m_id"));
		m.setM_pw(req.getParameter("m_pw"));
		m.setM_name(req.getParameter("m_name"));
		m.setM_nick(req.getParameter("m_nick"));
		// m.setM_birth(req.getParameter("m_birth"));
		m.setM_email(req.getParameter("m_email"));
		m.setM_tel(req.getParameter("m_tel"));
		m.setM_address(req.getParameter("m_address"));
		// m.setM_regdate(req.getParameter("m_regdate"));
		// m.setM_type(req.getParameter("m_type"));
		
		System.out.println(m.getM_id());
		System.out.println(m.getM_pw());
		System.out.println(m.getM_name());
		System.out.println(m.getM_nick());
		System.out.println(m.getM_email());
		System.out.println(m.getM_tel());
		System.out.println(m.getM_address());
		
		return "members/registResult";
	}
	
	@GetMapping("/login")
	public String toLogin() {
		return "members/login";
	}
}
