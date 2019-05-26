package visitor;

/**
 * - implements an Accept operation that takes a visitor as an argument.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteElement implements Element {

	@Override
	public void accept(Visitor v) {
		v.visitConcreteElement(this);
	}

}
