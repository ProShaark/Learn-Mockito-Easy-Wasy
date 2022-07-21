package BehaviorVerificationtest;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import BehaviorVerification.Book;
import BehaviorVerification.BookRepository;
import BehaviorVerification.BookServices;

@ExtendWith(MockitoExtension.class)
public class verifyNoInteraction {

	
	@Mock
	private BookRepository bookRepository;
	@InjectMocks
	private BookServices bookServices;
	
	
	@Test
	public void verifyNoInteractionMethod()
	{
		Book book1 = new Book("123", "Learn Mockito", 500, LocalDate.now());
		bookServices.verifyNoInteractionsMethodCheck(null);
		Mockito.verifyNoInteractions(bookRepository);
	}
	
}
