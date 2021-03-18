package com.loveCalc_Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	/**
	 * this function is to return the file.jsp which is in the view 
	 * @return
	 */
	@RequestMapping("/homePage")
	public String string() {
		
		return "love-calc";
	}

}
