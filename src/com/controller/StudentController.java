package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.StudentPOJO;
import com.dao.StudentDAO;

@Controller
public class StudentController {
	@Autowired
	StudentDAO dao;

	@RequestMapping("/save")
	public ModelAndView insert(@ModelAttribute("student") StudentPOJO student) throws Exception {
		System.out.println(student.getUsername());
		dao.store(student);
		return new ModelAndView("redirect:/portal");
	}

	@RequestMapping("/index")
	public ModelAndView index1() {
		return new ModelAndView("Reg", "command", new StudentPOJO());
	}

}
