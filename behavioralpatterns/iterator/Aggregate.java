package iterator;

/**
 * - defines an interface for creating an Iterator object.
 * <p>
 * The aggregate might define the traversal algorithm and use the iterator to
 * store just the state of the iteration. We call this kind of iterator a
 * <b>cursor</b>.
 * 
 * @author freedom5wind
 *
 */
public interface Aggregate {
	Iterator createIterator();
}
