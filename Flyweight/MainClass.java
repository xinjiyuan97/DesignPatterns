package Flyweight;

public class MainClass {

	public static void main(String[] args) {
		MyCharacterFactory cFactory = new MyCharacterFactory();
		MyCharacter A = cFactory.getMyCharacter('A');
		MyCharacter B = cFactory.getMyCharacter('B');
		MyCharacter C = cFactory.getMyCharacter('A');
		if (A == C) 
			System.out.println("A 和 C 相等。");
		else
			System.out.println("A 和 C 不相等。");
	}

}
