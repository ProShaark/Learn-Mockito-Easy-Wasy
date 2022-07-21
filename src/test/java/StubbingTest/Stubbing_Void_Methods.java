package StubbingTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import Stubbing.Book;
import Stubbing.BookRepository;
import Stubbing.BookServices;

@ExtendWith(MockitoExtension.class)
public class Stubbing_Void_Methods {

	

	@Mock
	private BookRepository bookRepositry;
	@InjectMocks
	private BookServices bookServices;
	
	
	@Test
	public void stubbingMethod()
	{
		int expected=500;
		Book book1 = new Book("123","Learn Java",500,LocalDate.now());
		doNothing().when(bookRepositry).save(book1);
	
		
		bookServices.save(book1);
		verify(bookRepositry).save(book1);
		
	
		
	
	}
}
