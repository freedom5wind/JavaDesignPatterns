package builder;

/**
 * - constructs and assemble parts of the product by implementing the Builder
 * interface. <br>
 * - defines and keeps track of the representation it creates. <br>
 * - provides an interface for retrieving the product.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteBuilder implements Builder {

	private Product result;
	
	@Override
	public void buildPart() {
		// TODO Auto-generated method stub

	}
	
	public Product getResult() {
		return result;
	}

}
