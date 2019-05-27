package flyweight;

import java.util.ArrayList;
import java.util.Dictionary;

/**
 * - creates and manages flyweight objects. <br>
 * - ensures that flyweights are shared properly. When a client requests a
 * flyweight, the FlyweightFactory object supplies an existing instance or
 * creates one, if none exists.
 * 
 * @author freedom5wind
 *
 */
public class FlyweightFactory {
	private Dictionary<String, Flyweight> flyweights;
	
	Flyweight getFlyweight(String key) {
		if(flyweights.get(key) != null)
			return flyweights.get(key);
		else {
			Flyweight flyweight = new ConcreteFlyweight();
			flyweights.put(key, flyweight);
			return flyweight;
		}
	}
}
