package com.labifuco.firestats.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {

	
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/salute")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
	
		ModelAndView model = new ModelAndView();
		model.setViewName("display");
		model.addObject("result", name + " " + lastname);
		
		return model;
	}
};
