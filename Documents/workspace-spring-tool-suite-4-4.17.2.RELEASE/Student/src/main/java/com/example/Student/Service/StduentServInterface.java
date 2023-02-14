package com.example.Student.Service;

import java.util.List;

import com.example.Student.Entity.StudentData;

public interface StduentServInterface   
{

public StudentData addStudentData(StudentData student);

public List<StudentData> getAllStudentData();

public StudentData getStudentDataById(Long id);

public void deleteStudentDataById(Long id);




}
