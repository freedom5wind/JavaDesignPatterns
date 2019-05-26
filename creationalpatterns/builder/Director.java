package builder;

/**
 * - constructs an object using the Builder interface.
 * 
 * @author freedom5wind
 *
 */
public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		// for all objects in structure {
			builder.buildPart();
		// }
	}
}
