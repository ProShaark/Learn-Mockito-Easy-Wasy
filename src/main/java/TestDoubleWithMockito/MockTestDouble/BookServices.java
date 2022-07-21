package TestDoubleWithMockito.MockTestDouble;

import java.util.Collection;

public class BookServices {

	private BookRepository bookRepository;

	
	public BookServices(BookRepository bookRepository)
	{
		this.bookRepository=bookRepository;
	}
	
	public void addBook(Book book)
	{
		if(book.getPrice()>400)
		{
			return;
		}
		bookRepository.save(book);
	}
	
}
