package ExceptionHadnling.Exception_handling_with_Non_Void_0methods;

import java.sql.SQLException;
import java.util.List;

public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}



	public int getTotalPriceOFBooks() throws DatabaseReadException 
	{
		List<Book> books;
		try {
			books = bookRepository.findAllBooks();


		} catch (SQLException e) {

			throw new DatabaseReadException("You got Databases Read Exception"+e.getMessage());

		}
		int totalprice=0;

		for(Book book:books)
		{
			totalprice=totalprice+book.getPrice();
		}

		return totalprice;
	}




}
