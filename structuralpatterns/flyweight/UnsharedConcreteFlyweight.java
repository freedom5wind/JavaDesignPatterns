package flyweight;

/**
 * - not all Flyweight subclasses need to be shared. The Flyweight interface
 * enables sharing; it doesn't enforce it. It's common for
 * UnsharedConcreteFlyweight objects to have ConcreteFlyweight objects as children
 * at some level in the flyweight object structure.
 * 
 * @author freedom5wind
 *
 */
public class UnsharedConcreteFlyweight implements Flyweight {

	private int allState;

	@Override
	public void operation(int extrinsicState) {
		// TODO Auto-generated method stub

	}

}
