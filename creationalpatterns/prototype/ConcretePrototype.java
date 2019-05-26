package prototype;

/**
 * - implements an operation for cloning itself.
 * 
 * @author freedom5wind
 *
 */
public class ConcretePrototype implements Prototype {
	
	@Override
	public Prototype clone() {
		return new ConcretePrototype();
	}
}
