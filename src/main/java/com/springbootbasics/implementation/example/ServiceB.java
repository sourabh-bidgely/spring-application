package com.springbootbasics.implementation.example;

public class ServiceB {
	private String serviceName;
	private Integer serviceId;

	public ServiceB() {
		
	}

	public ServiceB(String serviceName, Integer serviceId) {
		this.serviceName = serviceName;
		this.serviceId = serviceId;
	}

	public void performTask() {
		System.out.println("Service Name - %s Service ID - %s".format(serviceName, serviceId));
	}

	public static ServiceB getInstance() {
		return new ServiceB("Sourabh", 1);
	}
}
