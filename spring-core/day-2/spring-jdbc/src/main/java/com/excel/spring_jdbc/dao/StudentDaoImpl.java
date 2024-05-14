package com.excel.spring_jdbc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.excel.spring_jdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertStudnets(Student student) 
	{
		String query = "insert into Student(id, name, city) values(?,?,?)";
		return jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
	}

	@Override
	public int updateStudnets(Student student) {
		String query= "update Student set name=?, city=? where id=?";
		return jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
	}

	@Override
	public int deleteStudents(int  id) {
		String query =" delete from student where id=?";
		return jdbcTemplate.update(query, id);
	}

	@Override
	public int getStudent(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAllStudents()
	{
		String query = "select * from Student";
		return jdbcTemplate.query(query, new RowMapper<Student>(){
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				return student;
			}
		});
	}
}

