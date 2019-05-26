package factorymethod;

/**
 * - declares the factory method, which returns an object of type Product.
 * Creator may also define a default implementation of the factory method that
 * returns a default ConcreteProduct object. <br>
 * - may call the factory method to create a Product object.
 * 
 * @author freedom5wind
 *
 */
public abstract class Createor {
	abstract Product factoryMethod();

	void anOperation() {
		Product product = factoryMethod();
		// ...
	}
}
