package BehaviorVerification;

import java.util.List;


public interface BookRepository {

	public void save(Book book);

	public Book finBookById(String iD);
}
