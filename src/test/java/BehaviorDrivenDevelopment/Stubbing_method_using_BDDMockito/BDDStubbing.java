package BehaviorDrivenDevelopment.Stubbing_method_using_BDDMockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.BDDMockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class BDDStubbing {
	@Mock
	private BookRepository bookRepositry;
	@InjectMocks 
	private BookServices bookServices;
	
		


	
	@Test
	public void traditionalWayToStubbing()
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
	
	
	
	@Test
	public void bddWayToStubbing()      //assertj api required
	{
		//Give   =Arrange

		List<Book> bookList = new ArrayList<Book>();

		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		Book book2 = new Book("124", "Learn Java", 400, LocalDate.now());
		
		bookList.add(book1);
		bookList.add(book2);
		
		//When = Act
		given(bookRepositry.findNewBooks(Mockito.anyInt())).willReturn(bookList);
		
		
		//then = Assert

		List<Book> getbookList = bookServices.getNewBooksWithAppliedDiscount(10, 7);
	//	then(getbookList).isNotNull();
		//then(getbookList.size()).isEqualTo(2)
		
		
	}
	
}
