package cn.zfy.pojo;

public class Worker {
	private int id;
	private String name;
	public Worker() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + "]";
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
	
}
