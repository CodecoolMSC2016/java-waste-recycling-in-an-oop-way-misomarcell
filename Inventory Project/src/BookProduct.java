
public class BookProduct extends Product{

	public int pageSize;
	
	public BookProduct(int size)
	{
		super(productName, productPrice);
		pageSize = size;
	}
}
