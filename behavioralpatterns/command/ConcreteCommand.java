package command;

/**
 * - defines a binding between a Receiver object and an action. <br>
 * - implements execute by invoking the corresponding operation(s) on Receiver.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteCommand implements Command{
	private Receiver receiver;
	private int state;

	public ConcreteCommand(Receiver r) {
		receiver = r;
	}
	
	@Override
	public void execute() {
		receiver.action();
	}
}
