package flyweight;

/**
 * - implements the Flyweight interface and adds storage for intrinsic state, if
 * any. A ConcreteFlyweight object must be sharable. Any state it stores must be
 * intrinsic; that is, it must be independent of the ConcreteFlyweight object's
 * context.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteFlyweight implements Flyweight{

	private int intrinsicState;
	
	@Override
	public void operation(int extrinsicState) {
		// TODO Auto-generated method stub
		
	}

}
