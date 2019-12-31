package Command;

public class BananaCommand extends Command {

	public BananaCommand(Peddler peddler) {
		super(peddler);
	}
	@Override
	public void sell() {
		peddler.sellBanana();
	}

}
