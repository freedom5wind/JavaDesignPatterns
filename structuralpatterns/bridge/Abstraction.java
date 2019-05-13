package bridge;

/**
 * - defines the abstraction's interface.<br>
 * - maintains a reference to an object of type Implementor.
 * 
 * @author freedom5wind
 *
 */
public abstract class Abstraction {
	private Implementor imp;
	
	void operation() {
		imp.operationImp();
	}
}
