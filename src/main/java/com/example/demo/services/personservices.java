package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.person;
import com.example.demo.repository.personrepo;

@Service
public class personservices {
	@Autowired
	personrepo repo;
	
	public person insert (person per) {
		return repo.save(per);
	}
	
	public List<person>getall(){
		return repo.findAll();
	}
}
