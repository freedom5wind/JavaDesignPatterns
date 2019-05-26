package adapter;

/**
 * - adapts the interface of Adaptee to the Target interface.
 * <p>
 * A class adapter won't work when we want to adapt a class and all its
 * subclasses. <br>
 * Lets Adapter override some of Adaptee's behavior.
 * 
 * @author freedom5wind
 *
 */
public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void request() {
		specificRequest();
	}

}
