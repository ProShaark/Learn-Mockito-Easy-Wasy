package ExceptionHAndlingTest.ExceptionhandlingwithVoidmethods;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import ExceptionHadnling.Exception_handling_with_Void_methods.*;




@ExtendWith(MockitoExtension.class)
public class VoidMethodException {

	@Mock
	private BookRepository bookRepositry;
	@InjectMocks
	private BookService bookSerives;


	@Test
	public void voidExceptionHAndling() throws SQLException
	{
		Book book2 = new Book("124", "Learn Java", 400,"Rohit" ,LocalDate.now());
		Mockito.doThrow(SQLException.class).when(bookRepositry).save(book2);
		
		assertThrows(DatabasesWriteException.class, ()->bookSerives.addBook(book2));
		
	}
	
}
