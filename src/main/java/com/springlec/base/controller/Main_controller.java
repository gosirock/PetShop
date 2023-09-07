package com.springlec.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main_controller {

	@RequestMapping("/Main")
	public String MainView() {
		System.out.println("컨트롤러");
		return "Hi";
	}
}
