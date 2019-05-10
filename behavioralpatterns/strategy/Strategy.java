package strategy;

/**
 * - declares an interface common to all supported algorithms. Context uses this
 * interface to call the algorithm defined by a ConcreteStrategy. <br>
 * 
 * @author freedom5wind
 * 
 */
public interface Strategy {
	/**
	 * One approach is to have Context pass data in parameters to Strategy
	 * operations--in other words, take the data to strategy. <br>
	 * Another technique has a context pass <i>itself</i> as an argument, and the
	 * strategy requests data from the context explicitly.
	 */
	void algorithmInterface();
}
