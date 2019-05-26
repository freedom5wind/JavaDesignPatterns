package iterator;

/**
 * - implements the Iterator creation interface to return an instance of the
 * proper ConcreteIterator.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteAggregate implements Aggregate {

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

}
