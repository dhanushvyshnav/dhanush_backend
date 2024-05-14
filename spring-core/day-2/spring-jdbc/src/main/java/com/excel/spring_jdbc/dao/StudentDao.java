package com.excel.spring_jdbc.dao;

import java.util.List;

import com.excel.spring_jdbc.entity.Student;

public interface StudentDao 
{
	int insertStudnets(Student student);
	
	int updateStudnets(Student student);
	
	int deleteStudents(int id);

	int getStudent(int id);

    public List<Student> getAllStudents();

}
