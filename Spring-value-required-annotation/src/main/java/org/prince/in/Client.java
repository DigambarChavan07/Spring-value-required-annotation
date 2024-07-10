package org.prince.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student);
		
		StudentInfo studentInfo = context.getBean("studentInfo", StudentInfo.class);
		
		System.out.println(studentInfo);
	}
}
