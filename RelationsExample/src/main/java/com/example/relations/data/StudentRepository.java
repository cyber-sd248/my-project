package com.example.relations.data;

import org.springframework.data.repository.CrudRepository;

import com.example.relations.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
