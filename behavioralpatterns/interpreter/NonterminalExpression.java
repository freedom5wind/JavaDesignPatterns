package interpreter;

/**
 * - one such class is required for every rule R::=R1R2...Rn in the grammar.
 * <br>
 * - maintains instance variables of type AbstractExpression for each of the
 * symbols R1 through R2. <br>
 * - implements an Interpreter operation for nonterminal symbols in the grammar.
 * Interpret typically calls itself recursively on the variables representing R1
 * through Rn.
 * 
 * @author freedom5wind
 *
 */
public class NonterminalExpression implements AbstractExpression {

	private AbstractExpression R1, R2, Rn;
	
	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub

	}

}
