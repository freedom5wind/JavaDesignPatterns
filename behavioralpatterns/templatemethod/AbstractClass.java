package templatemethod;

/**
 * - defines abstract primitive operations that concrete subclasses defines to
 * implement steps of an algorithm. <br>
 * - implements a template method defining the skeleton of an algorithm. The
 * template method calls primitive operations as well as operations defined in
 * AbstractClass or those of other objects.
 * 
 * @author freedom5wind
 *
 */
public abstract class AbstractClass {
	void templateMethod() {

	}

	abstract void primitiveOperation();
}
