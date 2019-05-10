package decorator;

/**
 * - adds responsibilities to the component.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteDecorator extends Decorator {

	private void addedBehavior() {

	}

	@Override
	public void operation() {
		// addedBehavior();
		super.operation();
		addedBehavior();
	}
}
