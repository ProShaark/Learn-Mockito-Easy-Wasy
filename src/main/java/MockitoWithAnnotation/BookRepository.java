package MockitoWithAnnotation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public interface BookRepository {



	public List<Book> findNewBooks(int days);
}
