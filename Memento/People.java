package Memento;

public class People {
	private String name;
	private String sex;
	private int age;
	
	public People(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public People() {}
	
	public Mementor createMementor() {
		return new Mementor(name, sex, age);
	}
	
	public void setMementor(Mementor mementor) {
		name = mementor.getName();
		sex = mementor.getSex();
		age = mementor.getAge();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println(name + sex + age);
	}
}
