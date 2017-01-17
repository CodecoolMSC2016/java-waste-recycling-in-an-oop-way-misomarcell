import java.util.ArrayList;

public class Dustbin {

	public String _color;
	public ArrayList<Object> _paper_content;
	public ArrayList<Object> _plastic_content;
	public ArrayList<Object> _house_waste_content;
	
	public Dustbin(String color) {
		_color = color;
		_paper_content = new ArrayList<Object>();
		_plastic_content = new ArrayList<Object>();
		_house_waste_content = new ArrayList<Object>();
		
		System.out.println("A " + _color + " dustbin just created.");
	}
	
	
	public void throw_out_garbage(Object garbage)
	{
		if (garbage instanceof PlasticGarbage) 
		{
			if (((PlasticGarbage) garbage)._is_clean == true)
			{
				_plastic_content.add(garbage);			
				System.out.println(((PlasticGarbage) garbage)._name + " added to the plastic container.");
			}
			else
			{
				System.out.println("Plastic garbage isn't clean");
			}
		}
		else if (garbage instanceof PaperGarbage) 
		{
			if (((PaperGarbage) garbage)._is_squeezed == true)
			{
				_paper_content.add(garbage);			
				System.out.println(((PlasticGarbage) garbage)._name + " added to the paper container.");
			}
			else
			{	
				System.out.println("Paper garbage isn't squeezed.");
			}
		}
		else if (garbage instanceof Garbage &&
				(garbage instanceof PaperGarbage) == false &&
				(garbage instanceof PlasticGarbage) == false)
		{
			_house_waste_content.add(garbage);			
			System.out.println(((PlasticGarbage) garbage)._name + " added to the house waste container.");	
		}
		else
		{
			System.out.println("This is not a garbage.");
		}
	}
	
	
	public void emptyContent()
	{
		_paper_content.clear();
		_plastic_content.clear();
		_house_waste_content.clear();
		System.out.println("Dustbin cleared.");
	}
}
