package factorymethod;

/**
 * - overrides the factory method to return an instance of a ConcreteProduct.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteCreator extends Createor {

	@Override
	Product factoryMethod() {
		return new ConcreteProduct();
	}

}
