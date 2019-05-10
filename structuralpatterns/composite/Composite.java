package composite;

import java.util.ArrayList;

/**
 * - defines behavior for components having children. <br>
 * - stores child components. <br>
 * - implements child-related operations in the Component interface.
 * 
 * @author freedom5wind
 */
public class Composite implements Component {

	private ArrayList<Component> children;

	@Override
	public void operation() {
		for (Component child : children) {
			child.operation();
		}
	}

	@Override
	public void add(Component child) {
		children.add(child);
	}

	@Override
	public void remove(Component child) {
		children.remove(child);
	}

	@Override
	public Component getChild(int index) {
		return children.get(index);
	}

}
