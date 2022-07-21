package TestDoubleWithMockitoTestingPackage.MockTestDouble;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import TestDoubleWithMockito.MockTestDouble.BookRepository;
import TestDoubleWithMockito.MockTestDouble.*;


public class MockTestDouble {

	@Test
	public void mocktestDouble()
	{
		BookRepository bookRepositry = Mockito.mock(BookRepository.class);
		BookServices bookServices = new BookServices(bookRepositry);
	
		
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 400, LocalDate.now());
		
		bookServices.addBook(book1);
		bookServices.addBook(book2);
		Mockito.verify(bookRepositry,Mockito.times(1)).save(book2);

	}
	
	
}
