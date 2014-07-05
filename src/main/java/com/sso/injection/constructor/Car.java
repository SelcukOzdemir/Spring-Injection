package com.sso.injection.constructor;

public class Car {

	private String model;
	private int car;
	public Car(String model, int car) {
		super();
		this.model = model;
		this.car = car;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCar() {
		return car;
	}
	public void setCar(int car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", car=" + car + "]";
	}
	
	
}
