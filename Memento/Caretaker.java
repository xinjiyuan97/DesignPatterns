package Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	private List <Mementor> caretaker;
	public Caretaker () {
		caretaker = new ArrayList<Mementor>();
	}
	
	public void setMementor(Mementor mementor) {
		caretaker.add(mementor);
	}
	
	public Mementor getMementor() {
		return caretaker.get(caretaker.size() - 1);
	}
}
