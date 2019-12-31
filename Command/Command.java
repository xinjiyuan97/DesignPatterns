package Command;

public abstract class Command {
	protected Peddler peddler;
    public Command(Peddler peddler) {
    	this.peddler = peddler;
    }
    
    public abstract void sell();
}
