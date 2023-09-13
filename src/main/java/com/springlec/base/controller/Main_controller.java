package com.springlec.base.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main_controller {

	@RequestMapping("/Main")
	public String MainView() {
		
		
		List<String> list = new ArrayList<String>();
		String a = "a";
		String b = "b";
		list.add(a);
		list.add(b);
		for(String aaa : list) {
			System.out.println(aaa);
		}
		
		return "Hi";
		
	}
}
