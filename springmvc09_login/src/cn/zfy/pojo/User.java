package cn.zfy.pojo;


public class User {
	private String name;
	private int password;
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
