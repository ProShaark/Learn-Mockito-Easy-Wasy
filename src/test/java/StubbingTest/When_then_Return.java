package StubbingTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import Stubbing.Book;
import Stubbing.BookRepository;
import Stubbing.BookServices;

@ExtendWith(MockitoExtension.class)
public class When_then_Return {

	
	@Mock
	private BookRepository bookRepositry;
	@InjectMocks
	private BookServices bookServices;
	
	
	@Test

	public void stubbingMethod()
	{
		int expected=500;
		Book book1 = new Book("123","Learn Java",500,LocalDate.now());
		
		Mockito.when(bookRepositry.findBookByBookId("123")).thenReturn(book1);
		Mockito.when(bookRepositry.findBookByBookId("124")).thenReturn(book1);
		
		
		
		
		List<String> bookId = new ArrayList<String>();
		bookId.add("123");
		bookId.add("124");
		int actual=bookServices.calculateTotlaCost(bookId);
		System.out.println(actual);
		assertEquals(1000, actual);
		
	
	}
}
