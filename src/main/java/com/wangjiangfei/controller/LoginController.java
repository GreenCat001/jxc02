package com.wangjiangfei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping({"", "login"}) //这里为空或者是login都能进入该方法
	public String login() {
		return "login";
	}

}
