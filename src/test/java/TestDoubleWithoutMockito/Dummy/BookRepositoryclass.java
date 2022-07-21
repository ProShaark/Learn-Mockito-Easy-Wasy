package TestDoubleWithoutMockito.Dummy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import TestDoubleWithoutMockito.DummyTestDouble.Book;
import TestDoubleWithoutMockito.DummyTestDouble.BookRepository;


public class BookRepositoryclass implements BookRepository {

	Map<String, Book> bookStore = new HashMap<String, Book>();

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Book> finaAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	



}
