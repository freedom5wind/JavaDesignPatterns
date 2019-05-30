package state;

/**
 * - defines the interface of interest to clients. <br>
 * - maintains an instance of a ConcreteState subclass that defines the current
 * state.
 * 
 * @author freedom5wind
 *
 */
public class Context {
	private State state;
	
	void request() {
		state.handle();
	}
}
