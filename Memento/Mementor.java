package Memento;

public class Mementor {
	private String name;
	private String sex;
	private int age;
	
	public Mementor(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}
	
	
}
