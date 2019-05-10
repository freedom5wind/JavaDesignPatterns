package decorator;

/**
 * - maintains a reference to a Component object and defines an interface that
 * conforms to Component's interface.
 * 
 * @author freedom5wind
 *
 */
public abstract class Decorator implements Component {

	private Component component;

	@Override
	public void operation() {
		component.operation();
	}

}
