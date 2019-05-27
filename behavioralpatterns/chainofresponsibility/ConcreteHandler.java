package chainofresponsibility;

/**
 * - handles requests it is responsible for. <br>
 * - can access its successor. <br>
 * - if the ConcreteHandler can handle the request, it does so; otherwise it
 * forwards the request to its successor.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteHandler implements Handler {

	private Handler successor;
	
	@Override
	public void handleHelp() {
		// TODO Auto-generated method stub

	}

}
