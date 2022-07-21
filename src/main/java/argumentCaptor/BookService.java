package argumentCaptor;

import java.sql.SQLException;
import java.util.List;


public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	
	public void addBook(BookRquest bookRequest)
	{
		Book book = new Book();
		book.setTitle(bookRequest.getTitle());
		book.setPrice(bookRequest.getPrice());
		book.setDate(bookRequest.getDate());
		bookRepository.save(book);
	}
	
	


}
