package TestDoubleWithoutMockito.StubTestDoubble;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRepositry implements BookRepository {

	@Override
	
		public List<TestDoubleWithoutMockito.StubTestDoubble.Book> findNewBooks(int days) {
			List<TestDoubleWithoutMockito.StubTestDoubble.Book> bookList = new ArrayList<TestDoubleWithoutMockito.StubTestDoubble.Book>();
			TestDoubleWithoutMockito.StubTestDoubble.Book book1 = new TestDoubleWithoutMockito.StubTestDoubble.Book("123", "Learn Mockito", 500, LocalDate.now());
			TestDoubleWithoutMockito.StubTestDoubble.Book book2 = new TestDoubleWithoutMockito.StubTestDoubble.Book("124", "Learn Java", 400, LocalDate.now());

			bookList.add(book1);
			bookList.add(book2);
			return bookList;
		}

}
