package ExceptionHadnling.Exception_handling_with_Non_Void_0methods;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository {

	void save(Book book);
	Book findById(String bookId);
	List<Book> findAllBooks()throws SQLException ;

}
