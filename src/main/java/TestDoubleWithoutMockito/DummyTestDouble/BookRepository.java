package TestDoubleWithoutMockito.DummyTestDouble;

import java.util.Collection;

public interface BookRepository {

	void save(Book book);
	Collection<Book> finaAll();
	
}
