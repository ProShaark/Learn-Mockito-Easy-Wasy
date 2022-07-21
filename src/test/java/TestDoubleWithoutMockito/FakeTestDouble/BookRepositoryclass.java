package TestDoubleWithoutMockito.FakeTestDouble;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookRepositoryclass implements BookRepository {

	Map<String, Book> bookStore = new HashMap<String, Book>();
	
	
	@Override
	public void save(Book book) {
		bookStore.put(book.getBookId(), book);
		
	}

	@Override
	public Collection<Book> finaAll() {
		
		return bookStore.values();
	}

}
