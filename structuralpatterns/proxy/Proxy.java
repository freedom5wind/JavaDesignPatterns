package proxy;

/**
 * - maintains a reference that lets the proxy access the real subject. Proxy
 * may refer to a Subject if the RealSubject and Subject interfaces are the
 * same. <br>
 * - provides an interface identical to Subject's so that a proxy can by
 * substituted for the real subject. <br>
 * - controls access to the real subject and may responsible for creating and
 * deleting it. <br>
 * - other responsibilities depend on the kind of proxy: <br>
 * <i>remote proxies</i> are responsible for encoding a request and its
 * arguments and for sending the encoded request to the real subject in a
 * different address space. <br>
 * <i>virtual proxies</i> may cache additional information about the real
 * subject so that they can postpone accessing it. <br>
 * <i>protection proxies</i> check that the caller has the access permissions
 * required to perform a request.
 * 
 * @author freedom5wind
 *
 */
public class Proxy implements Subject {

	private RealSubject realSubject;

	@Override
	public void request() {
		realSubject.request();
	}

}
