package composite;

/**
 * - represents leaf objects in the composition. A leaf has no children. <br>
 * - defines behavior for primitive objects in the composition.
 * 
 * @author freedom5wind
 * 
 */
public class Leaf implements Component {

	@Override
	public void operation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Component child) throws Exception {
		throw new Exception();
	}

	@Override
	public void remove(Component child) throws Exception {
		throw new Exception();
	}

	@Override
	public Component getChild(int index) throws Exception {
		throw new Exception();
	}

}
