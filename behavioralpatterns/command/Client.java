package command;

/**
 * - creates a ConcreteCommand object and sets its receiver.
 * 
 * @author freedom5wind
 *
 */
public class Client {
	private Receiver receiver;
	private Command command = new ConcreteCommand(receiver);
	private Invoker invoker = new Invoker(command);
}
