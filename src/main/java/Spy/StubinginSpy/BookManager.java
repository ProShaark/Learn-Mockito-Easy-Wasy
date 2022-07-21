package Spy.StubinginSpy;

public class BookManager {

	private BookServices bookServices ;

	public BookManager(BookServices bookServices) {
		super();
		this.bookServices = bookServices;
	}
	
	
	public int applyDiscountonBook(String bookId,int discountRate)
	{
		Book book =bookServices.findBook(bookId); // we need to mock
		int discountPrice =bookServices.getAppliedDiscount(book,discountRate); // we need to actually call
		return discountPrice;
		
	}
	
}
