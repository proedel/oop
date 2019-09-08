package oop;

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("carrera")) {
			this.model = model;
		} else {
			System.out.println("Model unknown");
		}

	}
	
	public String getModel() {
		return this.model;
	}
	
}
