package com.mphasis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.model.Book_Details;
import com.mphasis.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService service;
	@GetMapping(value="/books",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book_Details> findAll(){
		return service.findAll();
	}
	

}
