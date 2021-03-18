package com.loveCalc_Controllers;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.loveCalc.Dto.api.info;
import com.loveCalc.Dto.api.registerInfo;

@Controller
public class LCapplication {

	@RequestMapping("/")
	public String showPage(@ModelAttribute("info") info inf) {
		/**
		 * we have used @ModelAttribute("info") insted of the follwing lines.
		 */
		/*
		 * // creat opj for the calss info inf = new info(); //send it to the model
		 * model.addarrtibute("inf", inf);
		 */

		return "home-page";
	}

	/*
	 * @RequestMapping("/result") public String resultPage(@RequestParam String
	 * userName, @RequestParam String cruchName, Model model) {
	 * model.addAttribute("userName", userName); model.addAttribute("curshName",
	 * cruchName);
	 * 
	 * System.out.println("Your username is: " + userName);
	 * System.out.println("Your crushName is: " + cruchName);
	 * 
	 * 
	 * return "result-page"; }
	 */
	/**
	 * insted of the above class we will use the follwing one to reduce the number
	 * of the parameters related to time
	 */
	@RequestMapping("/result")
	public String resultPage(@Valid @Validated  @ModelAttribute("inf") info inf, /*BindingResult rs*/ Errors error) {
		System.out.println("Hello");
		if (error.hasErrors()) {
			System.out.println("there is an error");
			return"home-page";
		}else {
		return "result-page";}
	}

	@RequestMapping("/register")
	public String register(@ModelAttribute("Register") registerInfo regInfo) {

		return "register-page";
	}

	@RequestMapping("/success")
	public String RegisterSuccess(@ModelAttribute("Register") registerInfo regInfo) {

		return "Register_success";
	}

}
