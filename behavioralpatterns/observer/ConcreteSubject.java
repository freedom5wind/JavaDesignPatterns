package observer;

/**
 * - stores state of interest to ConcreteSubject objects. <br>
 * - sends a notification to its observers when its state changes.
 * 
 * @author freedom5wind
 *
 */
public class ConcreteSubject extends Subject {
	private int subjectState;
	
	public void setState(int s) {
		subjectState = s;
	}
	
	public int getState() {
		return subjectState;
	}
}
