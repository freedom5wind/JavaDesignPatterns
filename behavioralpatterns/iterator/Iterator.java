package iterator;

/**
 * - defines an interface for accessing and traversing elements.
 * <p>
 * When the client controls the iteration, the iteration is called an
 * <b>external iteration</b>, and when the iterator controls it, the iterator is
 * an internal iterator.
 * 
 * @author freedom5wind
 *
 */
public interface Iterator {
	void first();

	void next();

	int isDone();

	Object currentItem();
}
