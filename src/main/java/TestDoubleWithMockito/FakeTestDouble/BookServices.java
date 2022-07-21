package TestDoubleWithMockito.FakeTestDouble;

import java.util.Collection;

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
	
	public int findNumberOfBook()
	{
		return bookRepository.finaAll().size();
	}
}
