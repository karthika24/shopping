package com.chainsys.model;

public class Laptop {
	private int id;
	private String name;
	private String model;
	private String processor;
	private int ram;
	private int hard_drive;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHard_drive() {
		return hard_drive;
	}
	public void setHard_drive(int hard_drive) {
		this.hard_drive = hard_drive;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", model=" + model
				+ ", processor=" + processor + ", ram=" + ram + ", hard_drive="
				+ hard_drive + ", price=" + price + "]";
	}
	

}
