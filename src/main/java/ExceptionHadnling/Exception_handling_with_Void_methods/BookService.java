package ExceptionHadnling.Exception_handling_with_Void_methods;

import java.sql.SQLException;
import java.util.List;

public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public void addBook(Book book) throws DatabasesWriteException
	{
		try {
			bookRepository.save(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DatabasesWriteException("You got Database Write Exception" +e.getMessage());
		}
		
	}




}
