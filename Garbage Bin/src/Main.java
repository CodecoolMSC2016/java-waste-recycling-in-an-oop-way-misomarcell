
public class Main {

	public static void main(String[] args) {
		final Dustbin kuka = new Dustbin("z�ld");
		final Garbage garbage1 = new PaperGarbage("sajt", true);

		kuka.throw_out_garbage(garbage1);
	}

}
