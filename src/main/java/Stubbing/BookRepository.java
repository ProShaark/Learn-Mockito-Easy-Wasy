package Stubbing;

import java.util.List;


public interface BookRepository {



	public List<Book> findNewBooks(int days);

	public Book findBookByBookId(String bookID);

	public void save(Book book);
}
