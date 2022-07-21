package TestDoubleWithoutMockito.MockTestDouble;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;



public class MockTestDouble {

	@Test
	public void mocktestDouble()
	{
		BookRepositryClass bookRepositry = new BookRepositryClass();
		BookServices bookServices = new BookServices(bookRepositry);
		
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 400, LocalDate.now());
		
		bookServices.addBook(book1);
		bookServices.addBook(book2);
		bookRepositry.verify(book2, 1);
	}
	
	
}
