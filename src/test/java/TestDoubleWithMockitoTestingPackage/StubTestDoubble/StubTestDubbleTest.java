package TestDoubleWithMockitoTestingPackage.StubTestDoubble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import TestDoubleWithMockito.StubTestDoubble.Book;
import TestDoubleWithMockito.StubTestDoubble.BookRepository;
import TestDoubleWithMockito.StubTestDoubble.BookServices;

public class StubTestDubbleTest {

	
	@Test
	public void stubTestDouble()
	{
		BookRepository bookRepositry = Mockito.mock(BookRepository.class);
		BookServices bookServices = new BookServices(bookRepositry);
		List<Book> bookList = new ArrayList<Book>();

		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 400, LocalDate.now());
		
		bookList.add(book1);
		bookList.add(book2);
		
		Mockito.when(bookRepositry.findNewBooks(Mockito.anyInt())).thenReturn(bookList);
		
		List<Book> getbookList = bookServices.getNewBooksWithAppliedDiscount(10, 7);
		
		assertEquals(2, getbookList.size());
		assertEquals(450, getbookList.get(0).getPrice());
		assertEquals(360, getbookList.get(1).getPrice());
		
		
	}
	
}
