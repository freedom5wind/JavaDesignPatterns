package interpreter;

/**
 * - builds (or is given) an abstract syntax tree representing a particular
 * sentence in the language that the grammar defines. The abstract syntax tree
 * is assembled from instances of the NonterminalExpression and
 * TerminalExpression classes. <br>
 * - invokes the Interpret operation.
 * 
 * @author freedom5wind
 *
 */
public class Client {

	private AbstractExpression expr;
	private Context context;

	void operation() {
		expr.interpret(context);
	}
}
