package com.asba.skill;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController 
@RequestMapping(value="/")
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {
	
	@Autowired
	private StudentDAO sdao;
	
	@RequestMapping(value="/liststud" , method =RequestMethod.GET)
	public List<Student> getStudent() {
		return sdao.getStudent();
		
	}
	
	/*//http://localhost:8085/create
	
	{
    "bid": 0,
    "cid": 0,
    "date": null,
    "amt": 0,
    "payMode": null,
    "plan": null
}
	
	}
	
	*/
	@RequestMapping(value="/create" , method=RequestMethod.POST)
	public Student createStudent(@RequestBody Student stud)
	{
		return sdao.createStudent(stud);
		
	}
	

}
