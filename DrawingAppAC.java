package com.test.appcon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppAC {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springac.xml");
		TriangleAC triangle = (TriangleAC) context.getBean("tri-angle");
		System.out.println(triangle.getType());
	}

}
