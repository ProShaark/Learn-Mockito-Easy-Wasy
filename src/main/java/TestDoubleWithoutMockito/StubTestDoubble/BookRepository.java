package TestDoubleWithoutMockito.StubTestDoubble;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import TestDoubleWithoutMockito.DummyTestDouble.Book;

public interface BookRepository {



	public List<TestDoubleWithoutMockito.StubTestDoubble.Book> findNewBooks(int days);
}
