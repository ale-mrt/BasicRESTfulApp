package com.mutasa.FirstProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;
import com.mutasa.FirstProject.repositories.StudentsRepository;

@Controller
@RequestMapping("/studenti")
public class StudentController {

	@Autowired
	private StudentsRepository repository;
	
	@GetMapping("")
	public String students() {
		return "students.html";
	}
	
	@GetMapping("/getAllStudents")
	@ResponseBody
	public String getAllStudents() {
		Gson gson = new Gson();
		
		return gson.toJson(repository.findAll());
	}
}
