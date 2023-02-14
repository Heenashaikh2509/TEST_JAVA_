package com.exaample.Student.reop;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Entity.StudentData;

public interface StudentRepo  extends JpaRepository<StudentData,Long>
{

}
