package com.excel.spring_hibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.excel.spring_hibernate.entity.Student;

@Component
public class StudentDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	//to insert
	@Transactional
	public int insert(Student student)
	{
		Integer i= (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//to get single data
	@Transactional
	public Student getStudent(int id)
	{
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}
	
	// to delete data
	@Transactional
	public int deleteDb(int id)
	{
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
		return id;
	}
	
	// to update the data
	@Transactional
	public int update(Student student)
	{
		this.hibernateTemplate.update(student);
		return 1;
	}
	//To get all studnets
	@Transactional
	public List<Student> getAllStudent()
	{
		List<Student> student= this.hibernateTemplate.loadAll(Student.class);
		return student;
		
	}
}
