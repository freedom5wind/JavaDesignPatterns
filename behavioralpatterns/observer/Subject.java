package observer;

import java.util.ArrayList;

/**
 * - knows its observers. Any number of Observer objects may observe a subject.
 * <br>
 * - provides an interface for attaching and detaching Observer objects.
 * 
 * @author freedom5wind
 *
 */
public class Subject {
	private ArrayList<Observer> observers;
	
	public void attach(Observer o) {
		observers.add(o);
	}
	
	public void detach(Observer o) {
		observers.remove(o);
	}
	
	public void notify_() {
		for(Observer o : observers) {
			o.update();
		}
	}
}
