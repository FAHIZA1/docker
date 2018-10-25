package com.asba.skill;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private MongoTemplate mTemplate;
	
	@Override
	public List<Student> getStudent(){
	return mTemplate.findAll(Student.class);
	
}
	@Override
	public Student createStudent(Student stud) {
		
		mTemplate.save(stud);
		return stud;
		
	}
}
