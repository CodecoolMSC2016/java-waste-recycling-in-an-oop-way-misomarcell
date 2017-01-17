public class PaperGarbage extends Garbage {

	public Boolean _is_squeezed;
	
	public PaperGarbage(String name, Boolean squeezed){
		super(name);
		_is_squeezed = squeezed;
		System.out.println("A paper garbage, named '" + name + "' is just created.");
	}
	
	public void squeeze(){
		this._is_squeezed = true;
		System.out.println(this._name + " squeezed.");
	}
}
