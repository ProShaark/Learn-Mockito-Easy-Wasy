package argumentCaptorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import argumentCaptor.Book;
import argumentCaptor.BookRepository;
import argumentCaptor.BookRquest;
import argumentCaptor.BookService;
@ExtendWith(MockitoExtension.class)
public class ArgumentCaptorUsingAnnoation {

	@Mock
	private BookRepository bookRepositry;
	@InjectMocks
	private BookService bookService;
	@Captor
	private ArgumentCaptor<Book> bookArgumnetCaptor;
	
	@Test
	public void argumentCaptor()
	{	BookRquest bookRequest = new BookRquest("123", 100, LocalDate.now());
		bookService.addBook(bookRequest);
	    Mockito.verify(bookRepositry).save(bookArgumnetCaptor.capture());
	    Book book = bookArgumnetCaptor.getValue();
	    assertEquals("123", book.getTitle());
	}
}
