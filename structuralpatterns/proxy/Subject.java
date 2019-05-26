package proxy;

/**
 * - defines the common interface for RealSubject and Proxy so that a Proxy can
 * be used anywhere a RealSubject is expexted.
 * 
 * @author freedom5wind
 *
 */
public interface Subject {
	void request();
}
