package com.example.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exaample.Student.reop.StudentRepo;
import com.example.Student.Entity.StudentData;

@Service
public   class StudentService implements StduentServInterface

{
	@Autowired
	private StudentRepo studrepo;
@Override
	public StudentData addStudentData(StudentData student)
	{
		 StudentData savedStudentData=studrepo.save(student);
		return savedStudentData;
		 
		 
	}
@Override
public List<StudentData> getAllStudentData()

{
	return studrepo.findAll();
}


@Override
public StudentData getStudentDataById(Long id) {
	
	return studrepo.findById(id).get();

}
@Override
public void deleteStudentDataById(Long id)
{
	studrepo.deleteById(id);
}

	
}


	



