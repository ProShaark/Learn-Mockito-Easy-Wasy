package BehaviorDrivenDevelopment.Stubbing_method_using_BDDMockito;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import ExceptionHadnling.Exception_handling_with_Non_Void_0methods.BookRepository;
import ExceptionHadnling.Exception_handling_with_Non_Void_0methods.BookService;
import ExceptionHadnling.Exception_handling_with_Non_Void_0methods.DatabaseReadException;

@ExtendWith(MockitoExtension.class)
public class BDDException {
	
		@Mock
		private BookRepository bookRepositry;
		@InjectMocks
		private BookService bookSerives;
		
		
		@Test
		public void nonVoidExceptionHAndling() throws SQLException
		{
		//	Mockito.when(bookRepositry.findAllBooks()).thenThrow(SQLException.class);  Tradational Way
			BDDMockito.given(bookRepositry.findAllBooks()).willThrow(SQLException.class);
			
			
			assertThrows(DatabaseReadException.class, ()->bookSerives.getTotalPriceOFBooks());
				
		}
	
	
	

}
