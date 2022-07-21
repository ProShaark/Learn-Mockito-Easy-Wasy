package BehaviorDrivenDevelopment.Stubbing_method_using_BDDMockito;

import static org.mockito.BDDMockito.given;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BehaviourVerificationBDDMockito {
	

		@Mock
		private BookRepository bookRepositry;
		@InjectMocks 
		private BookServices bookServices;
		
		@Test
		public void behaviourVerifationBDD()
		{
			//Given ==Arrange
			Book book = new Book("123", "Learn Mockito", 500, LocalDate.now());
			given(bookRepositry.findBookById(Mockito.anyString())).willReturn(book);
			//when ==Act
			
			bookServices.updatePrice("123", 500);
			
			
			//then == Assert   ==verification 
			BDDMockito.then(bookRepositry).should().save(book);
			
			
		}
		
		
}
