
public class PlasticGarbage extends Garbage {
	
	public Boolean _is_clean;
	
	public PlasticGarbage(String name, Boolean clean) {
		super(name);
		_is_clean = clean;
	}
	
	public void clean()  {
		_is_clean = true;
	}
}
