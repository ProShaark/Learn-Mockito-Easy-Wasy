package TestDoubleWithMockitoTestingPackage.Dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import TestDoubleWithMockito.DummyTestDouble.Book;
import TestDoubleWithMockito.DummyTestDouble.BookRepository;
import TestDoubleWithMockito.DummyTestDouble.BookServices;
import TestDoubleWithMockito.DummyTestDouble.EmailService;




public class DummyTestDouble {

	
	@Test
	public void dummyTestDouble()
	{
		BookRepository bookRepositry = Mockito.mock(BookRepository.class);
		EmailService emailServices = Mockito.mock(EmailService.class);           // Create Dummy Mock Object For Compile Code Only
		BookServices bookServices = new BookServices(bookRepositry, emailServices);
		
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 600, LocalDate.now());
		Collection<Book> bookStore = new ArrayList<Book>();
		bookStore.add(book1);
		bookStore.add(book2);
		
		Mockito.when(bookRepositry.finaAll()).thenReturn(bookStore);
		
		assertEquals(2, bookServices.findNumberOfBook());
	}
	
	
	
	
}
