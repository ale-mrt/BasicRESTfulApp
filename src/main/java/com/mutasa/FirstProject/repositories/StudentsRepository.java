package com.mutasa.FirstProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mutasa.FirstProject.entities.Student;

public interface StudentsRepository extends CrudRepository<Student, Integer>{

}
