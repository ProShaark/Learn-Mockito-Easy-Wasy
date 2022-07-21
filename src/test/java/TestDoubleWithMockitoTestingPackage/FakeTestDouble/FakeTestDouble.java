package TestDoubleWithMockitoTestingPackage.FakeTestDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import TestDoubleWithMockito.FakeTestDouble.Book;
import TestDoubleWithMockito.FakeTestDouble.BookRepository;
import TestDoubleWithMockito.FakeTestDouble.BookServices;
import TestDoubleWithoutMockito.MockTestDouble.MockTestDouble;

public class FakeTestDouble {

	
	@Test
	public void fakeTestDouble()
	{
		BookRepository bookRepositry = Mockito.mock(BookRepository.class);
		BookServices bookServices = new BookServices(bookRepositry);
		
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 600, LocalDate.now());
		Collection<Book> bookStore = new ArrayList<Book>();
		bookStore.add(book1);
		bookStore.add(book2);
		
		Mockito.when(bookRepositry.finaAll()).thenReturn(bookStore);
		
		assertEquals(2, bookServices.findNumberOfBook());
	
		
		

		
		
	}
	
	
	
	
}
