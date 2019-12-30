package Composite;

public class MainClass {

	public static void main(String[] args) {
		Directory root = new Directory("root");
		
		root.add(new File(".gitignore"));
		root.add(new Directory("usr"));
		root.add(new Directory("bin"));
		
		root.display();
	}

}
