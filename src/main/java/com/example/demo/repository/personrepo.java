package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.person;

public interface personrepo extends JpaRepository<person, Integer>{

}
