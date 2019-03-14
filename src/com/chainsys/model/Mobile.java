package com.chainsys.model;

public class Mobile {
	private int id;
	private String name;
	private String model;
	private int ram;
	private int storage;
	private int battery;
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", model=" + model
				+ ", ram=" + ram + ", storage=" + storage + ", battery="
				+ battery + ", price=" + price + "]";
	}
	
}
