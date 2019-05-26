package adapter;

/**
 * - adapts the interface of Adaptee to the Target interface.
 * <p>
 * Lets a single Adapter work with many Adaptees. <br>
 * Makes it harder to override Adaptee behavior.
 * 
 * @author freedom5wind
 *
 */
public class ObjectAdapter implements Target{
	private Adaptee adaptee;
	
	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
