package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {

	private String brand;
	private String model;
	
	@Autowired
	@Qualifier("mediatek")
	private Processor processor;

	public Computer() {
	}

	public Computer(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void getStatus() {
		System.out.println(brand + "[" + model + "] Computer is on.");
		processor.processorType();
	}
}
