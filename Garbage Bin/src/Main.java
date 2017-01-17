
public class Main {

	public static void main(String[] args) {
		final Dustbin kuka = new Dustbin("green");
		final PaperGarbage garbage1 = new PaperGarbage("Egg container", false);
		final PaperGarbage garbage2 = new PaperGarbage("million dollar contract", true);
		final PlasticGarbage garbage3 = new PlasticGarbage("PET Bottle", false);
		final PlasticGarbage garbage4 = new PlasticGarbage("Unused dog toy", true);
		final Garbage garbage5 = new Garbage("Chewing gum");
		final Garbage garbage6 = new Garbage("X-mas tree");
		
		
		System.out.println("> Let's throw out the Egg container...");
		kuka.throw_out_garbage(garbage1);
		System.out.println("> Have to squeeze it!");
		garbage1.squeeze();
		System.out.println("> Let's throw out a million dollar contract...");
		kuka.throw_out_garbage(garbage2);
		System.out.println("> Let's throw out a PET Bottle...");
		kuka.throw_out_garbage(garbage3);
		System.out.println("> Have to clean it!");
		garbage3.clean();
		System.out.println("> Let's throw out a Unused dog toy...");
		kuka.throw_out_garbage(garbage4);
		System.out.println("> Let's throw out a Chewing gum...");
		kuka.throw_out_garbage(garbage5);
		System.out.println("> Let's throw out a X-mas tree...");
		kuka.throw_out_garbage(garbage6);
		System.out.println("> Now, empty the dustbin...");
		kuka.emptyContent();
	}

}
