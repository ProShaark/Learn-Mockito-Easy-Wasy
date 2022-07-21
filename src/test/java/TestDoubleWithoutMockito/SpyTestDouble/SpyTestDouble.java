package TestDoubleWithoutMockito.SpyTestDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;



public class SpyTestDouble {

	@Test
	public void spyTestDouble()
	{
		BookRepositryClass bookRepositry = new BookRepositryClass();
	
		BookServices bookServices = new BookServices(bookRepositry);
		
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 600, LocalDate.now());
		
		bookServices.addBook(book1);
		bookServices.addBook(book2);
	 assertEquals(2, bookRepositry.timesCalled());
	 assertTrue(bookRepositry.lastBookMethod(book2));
	}
	
}
