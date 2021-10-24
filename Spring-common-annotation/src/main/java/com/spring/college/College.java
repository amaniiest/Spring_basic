package com.spring.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.name}")
	private String collegname;
	
	@Autowired
	private Principle principle;
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	public void test() {
		System.out.println("testing method");
		principle.status();
		teacher.teach();
		System.out.println("College name "+ collegname);
	}



	
}
