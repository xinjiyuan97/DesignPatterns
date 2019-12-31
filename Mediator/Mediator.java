package Mediator;

public class Mediator {
	private Man man;
	private Woman woman;
	
	
	
	public void setMan(Man man) {
		this.man = man;
	}

	public void setWoman(Woman woman) {
		this.woman = woman;
	}

	public boolean getPartner(People people) {
		if (people instanceof Man) 
			man = (Man) people;
		else 
			woman = (Woman) people;
		
		if (man == null || woman == null) {
			System.out.println("不是同性恋");
			return false;
		}
		
		if (man.getAge() == woman.getAge()) {
			System.out.println(man.getName() + "和" + woman.getName() + "匹配");
			return true;
		}
		System.out.println(man.getName() + "和" + woman.getName() + "不匹配");
		return false;
	}
}
