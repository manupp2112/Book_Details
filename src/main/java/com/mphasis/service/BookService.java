package com.mphasis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.model.Book_Details;
import com.mphasis.repo.BookRepository;

@Service
public class BookService {
@Autowired
BookRepository repository;
public List<Book_Details> findAll(){
	return repository.findAll();
}
}
