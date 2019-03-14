package com.chainsys.model;

/**
 * @author kart2115
 *
 */
public class Bike {
   private int id;
   private String name;
   private String model;
   private int cc;
   private int mileage;
   private float stroke;
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
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public int getMileage() {
	return mileage;
}
public void setMileage(int mileage) {
	this.mileage = mileage;
}
public float getStroke() {
	return stroke;
}
public void setStroke(float stroke) {
	this.stroke = stroke;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Bike [id=" + id + ", name=" + name + ", model=" + model + ", cc="
			+ cc + ", mileage=" + mileage + ", stroke=" + stroke + ", price="
			+ price + "]";
}
   
}
