package com.springbootbasics.implementation.example;

public class ServiceA {
	private String serviceName;
	private Integer serviceId;

	public ServiceA() {

	}

	public ServiceA(String serviceName, Integer serviceId) {
		this.serviceName = serviceName;
		this.serviceId = serviceId;
	}

	public void performTask() {
		System.out.println("Service Name - %s Service ID - %s".format(serviceName, serviceId));
	}

	public static ServiceA getInstance() {
		return new ServiceA("Sourabh", 1);
	}

}
