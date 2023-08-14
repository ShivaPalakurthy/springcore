package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet() throws Exception { //This method works as init
		// TODO Auto-generated method stub
		System.out.println("Taking pepsi: init");
	}

	public void destroy() throws Exception { //This methods works as a destroy method
		// TODO Auto-generated method stub
		System.out.println("Giving back pepsi to the owner:  destroy method code");
	}
	
}
