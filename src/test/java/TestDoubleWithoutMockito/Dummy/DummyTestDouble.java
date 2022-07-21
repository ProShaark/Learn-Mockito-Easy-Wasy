package TestDoubleWithoutMockito.Dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import TestDoubleWithoutMockito.DummyTestDouble.Book;
import TestDoubleWithoutMockito.DummyTestDouble.BookRepository;
import TestDoubleWithoutMockito.DummyTestDouble.BookServices;
import TestDoubleWithoutMockito.DummyTestDouble.EmailService;

public class DummyTestDouble {

	
	@Test
	public void dummyTestDouble()
	{
		BookRepository bookRepository = new BookRepositoryclass();
		EmailService emailServices = new DummyEmailServiceClass();
		BookServices bookService = new BookServices(bookRepository,emailServices);
		
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 600, LocalDate.now());
		
		bookService.addBook(book1);
		bookService.addBook(book2);
		
		System.out.println(bookService.findNumberOfBook());
		
		
		
	}
	
	
	
	
}
