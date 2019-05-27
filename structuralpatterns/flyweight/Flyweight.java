package flyweight;

/**
 * - declares an interface through which flyweights can receive and act on
 * extrinsic state.
 * 
 * @author freedom5wind
 *
 */
public interface Flyweight {
	void operation(int extrinsicState);
}
