package iterator;

/**
 * - implements the Iterator interface. <br>
 * - keeps track of the current position in the traversal of the aggregate.
 * @author freedom5wind
 *
 */
public class ConcreteIterator implements Iterator{

	private ConcreteAggregate aggregate;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}
	
	@Override
	public void first() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int isDone() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
