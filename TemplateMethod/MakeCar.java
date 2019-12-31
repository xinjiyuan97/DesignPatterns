package TemplateMethod;

public abstract class MakeCar {
	public abstract void makeHead();
	public abstract void makeBody();
	public abstract void makeTail();
	
	public void templateMethod() {
	    this.makeHead();
	    this.makeBody();
	    this.makeTail();
	}
}
