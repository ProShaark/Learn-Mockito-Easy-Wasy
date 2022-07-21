package TestDoubleWithMockitoTestingPackage.SpyTestDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import TestDoubleWithMockito.SpyTestDouble.*;



public class SpyTestDouble {

	@Test
	public void spyTestDouble()
	{
		
		BookRepository bookRepositry =Mockito.spy(BookRepository.class);
		BookServices bookServices = new BookServices(bookRepositry);
		
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 600, LocalDate.now());
		
		bookServices.addBook(book1);
		bookServices.addBook(book2);
	
		Mockito.verify(bookRepositry).save(book2);
		
	}
	
}
