package cn.zfy.pojo;

public class Student {
	private int id;
	private String name;
	private int age;
	private int tid;
	private Teacher teacher;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age, int tid, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.tid = tid;
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", tid=" + tid + ", teacher=" + teacher + "]";
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
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
