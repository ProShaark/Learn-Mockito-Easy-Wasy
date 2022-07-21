package TestDoubleWithoutMockito.MockTestDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;



public class BookRepositryClass implements BookRepository {
	int saveCalled=0;
	Book lastBook;


	public void verify(Book book,int times)
	{
		assertEquals(times, saveCalled);
		assertEquals(lastBook, book);
		
	}


	@Override
	public void save(Book book) {
		saveCalled++;
		lastBook=book;
		
	}


	
}
