package TestDoubleWithoutMockito.StubTestDoubble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StubTestDubbleTest {

	
	@Test
	public void stubTestDouble()
	{
		BookRepository bookRepository =new BookRepositry();
		BookServices bookservices = new BookServices(bookRepository);
		
		List<Book> bookList = bookservices.getNewBooksWithAppliedDiscount(10, 7);
		
		assertEquals(2, bookList.size());
		assertEquals(450, bookList.get(0).getPrice());
		assertEquals(360, bookList.get(1).getPrice());
		
		
	}
	
}
