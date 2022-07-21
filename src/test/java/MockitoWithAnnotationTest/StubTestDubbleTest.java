package MockitoWithAnnotationTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import TestDoubleWithMockito.StubTestDoubble.Book;
import TestDoubleWithMockito.StubTestDoubble.BookRepository;
import TestDoubleWithMockito.StubTestDoubble.BookServices;

@ExtendWith(MockitoExtension.class)    // this is for junit5  in junit4-mockito   @RunWith(MockitoJUnitRunner.class) @@PrepareTestFor() are this use
public class StubTestDubbleTest {

	@Mock
	private BookRepository bookRepositry;
	@InjectMocks 
	private BookServices bookServices;
	
		


	
	@Test
	public void stubTestDouble()
	{
		
	
	
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
