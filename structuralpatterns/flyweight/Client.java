package flyweight;

/**
 * - maintains a reference to flyweight(s).
 * - computes or stores the extrinsic state of flyweight(s).
 * 
 * @author freedom5wind
 *
 */
public class Client {
	private FlyweightFactory flyweightFactory;
	
	void operation() {
		Flyweight flyweight = flyweightFactory.getFlyweight("Key");
	}
}
