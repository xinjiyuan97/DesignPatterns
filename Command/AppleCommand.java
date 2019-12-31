package Command;

public class AppleCommand extends Command {

	public AppleCommand(Peddler peddler) {
		super(peddler);
	}

	@Override
	public void sell() {
		peddler.sellApple();
	}

}
