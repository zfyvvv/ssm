package  cn.zfy.pojo;

public class People {
	private int id;
	private String name;
	private int age;
	private String work;
	public People() {
		// TODO Auto-generated constructor stub
	}
	
	
	public People(int id, String name, int age, String work) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
	}


	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", age=" + age + ", work=" + work + "]";
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	
}
