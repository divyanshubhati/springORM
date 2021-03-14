package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	int id;
	String name;
	String brand;
	int ram;
	int screensize;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getScreensize() {
		return screensize;
	}
	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", brand=" + brand + ", ram=" + ram + ", screensize="
				+ screensize + "]";
	}
	
}
