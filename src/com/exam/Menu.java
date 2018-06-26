package com.exam;

public class Menu {
	int id;
	String name;
	int price;
	int cal;
	
	public Menu(int id, String name, int price, int cal) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.cal = cal;
	}
	public boolean isAvailable(int id,int price,int cal){
		boolean avail = false;
		if(id == this.id){

		}
	return avail;
	
				
	}
	public int getId() {
		return id;
	}
	public void setNumber(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
}

