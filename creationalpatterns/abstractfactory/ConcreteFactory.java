package abstractfactory;

/**
 * - implements the operations to create concrete product objects.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteFactory implements AbstractFactory {

	@Override
	public AbstractProduct createProduct() {
		return new ConcreteProduct();
	}

}
