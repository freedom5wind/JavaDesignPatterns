package visitor;

/**
 * - declares a Visit operation for each class of ConcreteElement in the object
 * structure. The operation's name and signature identifies the class that sends
 * the Visit request to the visitor. That lets the visitor determine the
 * concrete class of the element being visited. Then the visitor can access the
 * element directly through its particular interface.
 * 
 * @author freedom5wind
 *
 */
public interface Visitor {
	void visitConcreteElement(ConcreteElement element);
	
	// void visitConcreteElementB();
}
