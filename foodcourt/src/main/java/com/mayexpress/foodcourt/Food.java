package com.mayexpress.foodcourt;

public class Food {
	private int id;
	private String name;
	private String type;
	private int status;
	private int price;
	public Food(int id, String name, String type, int status, int price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.status = status;
		this.price = price;
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
