package argumentCaptorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import argumentCaptor.Book;
import argumentCaptor.BookRepository;
import argumentCaptor.BookRquest;
import argumentCaptor.BookService;

@ExtendWith(MockitoExtension.class)
public class ArgumentCaptorWithoutAnnotation {

	@Mock
	private BookRepository bookRepositry;
	@InjectMocks
	private BookService bookService;
	
	@Test
	public void argumentCaptorWithAnnotaionMethod()
	{
		BookRquest bookRequest = new BookRquest("123", 100, LocalDate.now());
	    ArgumentCaptor<Book> bookArgumnetCaptor =ArgumentCaptor.forClass(Book.class);
	    
	    bookService.addBook(bookRequest);
	    Mockito.verify(bookRepositry).save(bookArgumnetCaptor.capture());
	    Book book = bookArgumnetCaptor.getValue();
	    assertEquals("123", book.getTitle());
		
		
		
	}
	
}
