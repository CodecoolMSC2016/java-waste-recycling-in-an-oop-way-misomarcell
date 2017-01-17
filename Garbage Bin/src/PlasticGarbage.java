
public class PlasticGarbage extends Garbage {
	
	public Boolean _is_clean;
	
	public PlasticGarbage(String name, Boolean clean) {
		super(name);
		_is_clean = clean;
		System.out.println("A plastic garbage, named '" + name + "' is just created.");
	}
	
	public void clean()  {
		this._is_clean = true;
		System.out.println(this._name + " cleared.");
	}
}
