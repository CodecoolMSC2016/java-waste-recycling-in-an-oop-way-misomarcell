public class PaperGarbage extends Garbage {

	public Boolean _is_squeezed;
	
	public PaperGarbage(String name, Boolean squeezed){
		super(name);
		_is_squeezed = squeezed;
	}
	
	public void squeeze(){
		_is_squeezed = true;
	}
}
