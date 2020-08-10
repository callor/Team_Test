package com.biz.team.controller;

import org.springframework.stereotype.Controller;

@Controller
public class BookController {

	public String list() {
		return "book/list";
	}
	
}
