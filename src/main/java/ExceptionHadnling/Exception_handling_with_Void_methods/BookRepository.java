package ExceptionHadnling.Exception_handling_with_Void_methods;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository {

	Book findById(String bookId);
	List<Book> findAllBooks()throws SQLException ;
	void save(Book book)throws SQLException ;
	
}
