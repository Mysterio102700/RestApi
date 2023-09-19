package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.person;
import com.example.demo.services.personservices;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200/")
public class personcontroller {
	@Autowired
	personservices ser;
	
	@PostMapping("/insert")
	public person insert(@RequestBody person per) {
		return ser.insert(per);
	}
	
	@GetMapping("/getall")
	public List<person>getall(){
		return ser.getall();
	}
}
