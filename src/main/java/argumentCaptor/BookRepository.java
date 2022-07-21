package argumentCaptor;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository {

	void save(Book book);
	Book findById(String bookId);
	List<Book> findAllBooks()throws SQLException ;

}
