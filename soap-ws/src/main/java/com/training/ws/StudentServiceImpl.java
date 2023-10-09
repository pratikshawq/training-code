package com.training.ws;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
	List<Student> studList = new ArrayList<>();

	@Override
	public String getStudentInfo() {
		
		return  "Retrieving Student Info";
	}

	@Override
	public void addStudent(Student stud) {
		studList.add(stud);
		
	}
	
	

}
