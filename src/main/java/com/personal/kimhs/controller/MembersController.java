package com.personal.kimhs.controller;

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
	public String toRegistConfirm(Members m) {
		return "members/registResult";
	}
	
	@GetMapping("/login")
	public String toLogin() {
		return "members/login";
	}
}
