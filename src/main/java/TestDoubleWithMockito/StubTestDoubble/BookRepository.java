package TestDoubleWithMockito.StubTestDoubble;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import TestDoubleWithoutMockito.DummyTestDouble.Book;

public interface BookRepository {



	public List<TestDoubleWithMockito.StubTestDoubble.Book> findNewBooks(int days);
}
