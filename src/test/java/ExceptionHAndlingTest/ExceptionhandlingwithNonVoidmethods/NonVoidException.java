package ExceptionHAndlingTest.ExceptionhandlingwithNonVoidmethods;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import ExceptionHadnling.Exception_handling_with_Non_Void_0methods.BookRepository;
import ExceptionHadnling.Exception_handling_with_Non_Void_0methods.BookService;
import ExceptionHadnling.Exception_handling_with_Non_Void_0methods.DatabaseReadException;
import StubbingTest.When_then_Return;

@ExtendWith(MockitoExtension.class)
public class NonVoidException {
	@Mock
	private BookRepository bookRepositry;
	@InjectMocks
	private BookService bookSerives;
	
	
	@Test
	public void nonVoidExceptionHAndling() throws SQLException
	{
		Mockito.when(bookRepositry.findAllBooks()).thenThrow(SQLException.class);
		assertThrows(DatabaseReadException.class, ()->bookSerives.getTotalPriceOFBooks());
			
	}

	
	
}
