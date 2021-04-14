package com.akshay.acting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerformers {

	public static void main(String[] args) {
		System.out.println("main---starting()...");
//		Start the Container
		System.out.println("main starting()-spring container...");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		System.out.println("main()---started - spring container...");
//		ask the container to give beans
		
		
		
		Performer p1 = (Performer)ctx.getBean("ramu");
		p1.perform();
		
		Performer p2 = (Performer)ctx.getBean("ramu");
		System.out.println("p1==p2  ? " + (p1==p2));
		
		Performer p3 = (Performer)ctx.getBean("somu");
		p3.perform();
		
		Performer p4 = (Performer)ctx.getBean("mamu");
		p4.perform();
		
		Performer p5 = (Performer)ctx.getBean("bheemu");
		p5.perform();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("main()---ending...");
		
	}
}
