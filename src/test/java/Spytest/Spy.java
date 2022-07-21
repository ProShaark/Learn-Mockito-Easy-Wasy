package Spytest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import Spy.*;
import Spy.StubinginSpy.Book;
import Spy.StubinginSpy.BookManager;
import Spy.StubinginSpy.BookServices;

@ExtendWith(MockitoExtension.class)
public class Spy {

	@InjectMocks
	private BookManager bookManager;
	@org.mockito.Spy
	private BookServices bookService;
	
	
	@Test
	public void spy()
	{
		// spy have capablity of mock object any Call mock Object
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		
		//Mockito.doReturn(book1).when(bookService).findBook("123");
		Mockito.when(bookService.findBook("123")).thenReturn(book1);
		
		int actualDiscount = bookManager.applyDiscountonBook("123", 10);
		assertEquals(450, actualDiscount);
				
		
		
	}
	
}
