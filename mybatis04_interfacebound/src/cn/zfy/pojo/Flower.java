package cn.zfy.pojo;

public class Flower {
	private int id;
	private String name;
	private int price;
	private String produce;
	
	
	
	
	public Flower(int id, String name, int price, String produce) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.produce = produce;
	}
	public Flower() {
		// TODO Auto-generated constructor stub
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProduce() {
		return produce;
	}
	public void setProduce(String produce) {
		this.produce = produce;
	}
	@Override
	public String toString() {
		return "Flower [id=" + id + ", name=" + name + ", price=" + price + ", produce=" + produce + "]";
	}
	
	
	

}
