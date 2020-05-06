package com.springbootbasics.implementation.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceImplementer {

	@Autowired
	private ServiceA serviceA;
	@Autowired
	private ServiceB serviceB;

	public ServiceImplementer() {
		System.out.println("Initializing the Beans from empty constructor");
	}


	public ServiceImplementer(ServiceA serviceA, ServiceB serviceB) {
		System.out.println("Initializing the Bean");
		this.serviceA = serviceA;
		this.serviceB = serviceB;
	}

	public static void main(String[] args) {

//		ServiceImplementer implementer = ServiceImplementer.getInstance();
		
		BeanFactory factory = new ClassPathXmlApplicationContext("spring-example.xml");
		ServiceImplementer implementer = factory.getBean(ServiceImplementer.class, "serviceImplementer");
		implementer.runTask();
	}
	
	public static ServiceImplementer getInstance() {
		ServiceA a = new ServiceA();
		ServiceB b = new ServiceB();
		return new ServiceImplementer(a, b);
		
		
//		if (s != null) {
//			return s;
//		} else {
//			s = new ServiceImplementer(a, b);
//			return s;
//		}
	}

	public void runTask() {
		System.out.println("Runnig Implemeter...");
		// serviceA.performTask();
	}

	public void setServiceA(ServiceA serviceA) {
		System.out.println("setting A here");
		this.serviceA = serviceA;
	}

	public void setServiceB(ServiceB serviceB) {
		this.serviceB = serviceB;
	}
}
