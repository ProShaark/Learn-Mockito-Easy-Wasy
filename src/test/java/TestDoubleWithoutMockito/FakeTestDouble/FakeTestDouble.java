package TestDoubleWithoutMockito.FakeTestDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class FakeTestDouble {

	
	@Test
	public void fakeTestDouble()
	{
		BookRepository bookRepository = new BookRepositoryclass();
		BookServices bookServices = new BookServices(bookRepository);
		
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 600, LocalDate.now());
		
		bookServices.addBook(book1);
		bookServices.addBook(book2);
		
		
		assertEquals(2, bookServices.findNumberOfBook());
		
		
	}
	
	
	
	
}
