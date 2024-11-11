package com.minh.jpa.repositories;

import com.minh.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    //select * from author where first_name = 'ali'
    List<Author> findAllByFirstNameIgnoreCase(String fn);

    //select * from author where first_name like '%fn%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    //select * from author where first_name in ('minh', 'nhat')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> fn);

    
}
