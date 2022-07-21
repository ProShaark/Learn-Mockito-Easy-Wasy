package BehaviorVerification;

import java.util.*;

public class BookServices {

	private BookRepository bookRepository;
	public BookServices(BookRepository bookRepository)
	{
		this.bookRepository=bookRepository;
	}

	
	
	public void addBook(Book book)
	{
		bookRepository.save(book);
	}
	public void verifyNoInteractionsMethodCheck(Book book)
	{
		if(book==null)
		{
			return;
		}
		bookRepository.save(book);
	}
	
	public void verifyNoMoreIntractionsMethod_UpdatedPrice(String iD,int price)
	{
		if(iD==null)
		{
			return;
		}
		Book book=bookRepository.finBookById(iD);
		if(book.getPrice()==price)
		{
			return;
		}
		bookRepository.save(book);
	}
	
	
}
