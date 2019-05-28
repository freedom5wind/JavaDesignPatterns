package memento;

/**
 * - is responsible for the memento's safekeeping. <br>
 * - never operates on or examines the contents of a memento.
 * 
 * @author freedom5wind
 *
 */
public class Caretaker {
	private Memento memento;
	private Originator originator;
	
	void operation() {
		memento = originator.createMemento();
		
		// do something...
		
		originator.setMemento(memento);
	}
}
