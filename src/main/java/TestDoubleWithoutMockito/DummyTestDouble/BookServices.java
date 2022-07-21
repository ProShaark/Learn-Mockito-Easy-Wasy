package TestDoubleWithoutMockito.DummyTestDouble;

import java.util.Collection;

public class BookServices {

	private BookRepository bookRepository;
	private EmailService emailService;
	
	public BookServices(BookRepository bookRepository,EmailService emailService)
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
