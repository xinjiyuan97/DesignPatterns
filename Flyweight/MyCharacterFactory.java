package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class MyCharacterFactory {
	private Map<Character, MyCharacter> map;
	
	public MyCharacterFactory() {
		map = new HashMap<Character, MyCharacter> ();
	}
	
	public synchronized MyCharacter getMyCharacter(Character c) {
		MyCharacter mycharacter = map.get(c);
		if (mycharacter == null) {
		    mycharacter = new MyCharacter(c);
		    map.put(c, mycharacter);
		}
		return mycharacter;
	}
}
