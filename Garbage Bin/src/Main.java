
public class Main {

	public static void main(String[] args) {
		final Dustbin kuka = new Dustbin("green");
		final Garbage garbage1 = new PaperGarbage("Egg container", false);
		final Garbage garbage2 = new PaperGarbage("million dollar contract", true);
		final Garbage garbage3 = new PlasticGarbage("PET Bottle", false);
		final Garbage garbage4 = new PlasticGarbage("Unused dog toy", true);
		final Garbage garbage5 = new Garbage("Chewing gum");
		final Garbage garbage6 = new Garbage("X-mas tree");
		
		
		System.out.print("> Let's throw out the Egg container...");
		kuka.throw_out_garbage(garbage1);
		System.out.print("> Have to squeeze it!");
		garbage1.squeeze();
		
	}

}
