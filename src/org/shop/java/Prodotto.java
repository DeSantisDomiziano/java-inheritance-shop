package org.shop.java;

public class Prodotto {
	
	private String code;
	private String name;
	private String brand;
	private float price;
	private int vat;
	
	public Prodotto(String name, String brand, float price, int vat) {
		setCode();
		setName(name);
		setBrand(brand);
		setPrice(price);
		setVat(vat);
	}
	
	//TUTTI I GETTER
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public float getPrice() {
		return price;
	}
	
	public int getVat() {
		return vat;
	}
	
	//TUTTI I SETTER
	private void setCode() {
		code = "productCode##";
	}
	
	public void setName(String name) {
		if(name.length() > 0)
			this.name = name;
	}
	
	public void setBrand(String brand) {
		if(brand.length() > 0)
			this.brand = brand;
	}
	
	public void setPrice(float price) {
		if(price > 0 && price < 10_000)
			this.price = price;
	}
	
	public void setVat(int vat) {
		if(vat > 0 && vat < 128)
			this.vat = vat;
	}
	
	public void getFullPrice() {
		System.out.println(String.format("%.02f", (getPrice() + (getPrice() * getVat() / 100))));
	}
	
	@Override
	public String toString() {
		return "code: " + code + " | name: " + name + " | brand: " + brand + " | price: " + price + " | vat: " + vat;
	}
}
