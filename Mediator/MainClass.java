package Mediator;

public class MainClass {

	public static void main(String[] args) {
		Woman xiaofang = new Woman("小芳", 7, new Mediator());
		Man xiaoming = new Man("小明", 7, new Mediator());
		Man lihua = new Man("李华", 8, new Mediator());
		
		xiaofang.getPartner(xiaoming);
		xiaoming.getPartner(lihua);
		lihua.getPartner(xiaofang);

	}

}
