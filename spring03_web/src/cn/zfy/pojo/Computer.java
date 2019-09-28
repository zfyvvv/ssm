package cn.zfy.pojo;

public class Computer {
	private String band;
	private double price;
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Computer [band=" + band + ", price=" + price + "]";
	}

	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
