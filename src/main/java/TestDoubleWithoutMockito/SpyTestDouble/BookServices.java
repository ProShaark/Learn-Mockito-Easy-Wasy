package TestDoubleWithoutMockito.SpyTestDouble;



public class BookServices {

	private BookRepository bookRepository;
	
	public BookServices(BookRepository bookRepository)
	{
		this.bookRepository=bookRepository;
	}
	
	public void addBook(Book book)
	{
		bookRepository.save(book);
	}
	
	
}
