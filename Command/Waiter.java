package Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	List <Command> commands;
	
	public Waiter() {
		commands = new ArrayList<Command>();
	}
	
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void removeCommand(Command command) {
		commands.remove(command);
	}
	
	public void work() {
		for(Command com : commands)
			com.sell();
	}
}
