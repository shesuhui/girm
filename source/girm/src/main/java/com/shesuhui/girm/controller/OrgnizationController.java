package com.shesuhui.girm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/org")
public class OrgnizationController {

	
@RequestMapping("index")
public String index(){
	return "orglist";
}
	
	
}
