package singleton;

/**
 * - defines an Instance operation that lets clients access its unique instance.
 * Instance is a class operation (that is , a class method in Smalltalk and a
 * static member function in C++). <br>
 * - may be responsible for creating its own unique instance.
 * 
 * @author freedom5wind
 *
 */
public class Singleton {
	private static Singleton uniqueInstance;
	private int singletonData;

	protected Singleton() {
		
	}
	
	public static Singleton instance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();
		return uniqueInstance;
	}
	
	public void singletonOperation() {
		
	}
	
	public int getSingletonData() {
		return singletonData;
	}
}
