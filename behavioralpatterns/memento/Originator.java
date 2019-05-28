package memento;

/**
 * - creates a memento containing a snapshot of its current internal state. <br>
 * - uses the memento to restore its internal state.
 * 
 * @author freedom5wind
 *
 */
public class Originator {
	
	private int state;
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void setMemento(Memento m) {
		state = m.getState();
	}
}
