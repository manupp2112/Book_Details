package com.mphasis.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.model.Book_Details;
@Repository
public interface BookRepository extends CrudRepository<Book_Details, Long>{
List<Book_Details> findAll();
}
