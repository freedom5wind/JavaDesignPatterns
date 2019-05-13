package command;

/**
 * - asks the command to carry out the request.
 * 
 * @author freedom5wind
 *
 */
public class Invoker {
	private Command command;
	
	public Invoker(Command c) {
		command = c;
	}
	
	public void onInvoke() {
		command.execute();
	}
}
