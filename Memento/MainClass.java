package Memento;

public class MainClass {
    public static void main(String[] argv) {
    	
    	Caretaker caretaker = new Caretaker();
    	People per = new People("xiaoming", "男", 12);
    	per.display();
    	caretaker.setMementor(per.createMementor());
    	per.setName("xiaoli");
    	per.display();
    	per.setMementor(caretaker.getMementor());
    	per.display();
    }
}
