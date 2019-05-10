package composite;

/**
 * 
 * - declares the interface for object in the composition. <br>
 * - implements default behavior for the interface common to all classes, as
 * appropriate. <br>
 * - declares an interface for accessing and managing its child components. <br>
 * - (optional) defines an interface for accessing a component's parent in the
 * recursive structure, and implements it if that's appropriate. <br>
 * <p>
 * The decision about declaring the child management operations in the Component
 * or Composite involves a trade-off between safety and transparency. <br>
 * We have emphasized transparency over safety in this pattern. <br>
 * <p>
 * Usually it's better to make <i>Add</i> and <i>Remove</i> fail by default
 * (perhaps by raising an exception) if the component isn't allowed to have
 * children or if the argument of <i>Remove</i> isn't a child of the component,
 * respectively.
 * 
 * @author freedom5wind
 * 
 */
public interface Component {
	void operation();

	void add(Component child) throws Exception;

	void remove(Component child) throws Exception;

	Component getChild(int index) throws Exception;
}
