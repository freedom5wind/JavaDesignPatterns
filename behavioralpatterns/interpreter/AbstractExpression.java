package interpreter;

/**
 * - declares an abstract Interpret operation that is common to all nodes in the abstract syntax tree.
 * 
 * @author freedom5wind
 *
 */
public interface AbstractExpression {
	void interpret(Context context);
}
