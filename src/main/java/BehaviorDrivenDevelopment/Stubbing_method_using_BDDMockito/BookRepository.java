package BehaviorDrivenDevelopment.Stubbing_method_using_BDDMockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public interface BookRepository {



	public List<Book> findNewBooks(int days);

	public Book findBookById(String bookId);

	public void save(Book book);
}
