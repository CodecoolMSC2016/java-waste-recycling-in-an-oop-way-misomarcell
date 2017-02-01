
public class CDProduct extends Product{

	public int numOfTracks;
	
	public CDProduct(int tracks)
	{
		super(productName, productPrice);
		numOfTracks = tracks;
	}
	
}
