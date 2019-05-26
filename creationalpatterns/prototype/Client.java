package prototype;

/**
 * - creates a new object by asking a prototype to clone itself.
 * 
 * @author freedom5wind
 *
 */
public class Client {
	private Prototype prototype;
	
	public void operation() {
		Prototype p = prototype.clone();
	}
}
