package com.example.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Entity.StudentData;
import com.example.Student.Service.StduentServInterface;

@RestController 
@RequestMapping("/Student")
public class StudentController 

{

@Autowired
private StduentServInterface studservice;

//  Create operation
	@PostMapping("/save")
	public ResponseEntity<StudentData> addStudentData(@RequestBody StudentData student )
	{
		StudentData studSaved=studservice.addStudentData(student);
		
		return new ResponseEntity<StudentData>(studSaved,HttpStatus.CREATED);
		
	}
	
// Retrieve	 all
	@GetMapping("/all")
	public ResponseEntity<List<StudentData>> getAllStudentData() 
	{
		
		List<StudentData> listofallstut=studservice.getAllStudentData();
		return new ResponseEntity<List<StudentData>>(listofallstut,HttpStatus.OK);
	}
	
	// Retrieve single element	

	@GetMapping("/id/{id}")
	public ResponseEntity<StudentData> getStudentDataById(@PathVariable("id") Long id) 
	{
		
		StudentData studentd=studservice.getStudentDataById(id);
		return new ResponseEntity<StudentData>(studentd,HttpStatus.OK);
	}
	
	//	delete  single element	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteStudentDataById(@PathVariable("id") Long id) 
	{
		
		studservice.deleteStudentDataById(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	// Update operation 
	
	@PutMapping("/update")
	public ResponseEntity<StudentData> updateStudentData(@RequestBody StudentData student )
	{
		StudentData studSaved=studservice.addStudentData(student);
		
		return new ResponseEntity<StudentData>(studSaved,HttpStatus.CREATED);
		
	}
	
	
	
}
