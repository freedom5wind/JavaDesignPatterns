package observer;

/**
 * - maintains a reference to a ConcreteSubject object. <br>
 * - stores state that should stay consistent with the subject's. <br>
 * - implements the Observer updating interface to keep its state consistent
 * with the subject's.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteObserver implements Observer {
	private ConcreteSubject subject;
	private int observerState;

	@Override
	public void update() {
		observerState = subject.getState();
	}

}
