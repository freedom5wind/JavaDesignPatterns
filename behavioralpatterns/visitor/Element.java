package visitor;

/**
 * - defines an Accept operation that takes a visitor as an argument.
 * 
 * @author freedom5wind
 *
 */
public interface Element {
	void accept(Visitor visitor);
}
