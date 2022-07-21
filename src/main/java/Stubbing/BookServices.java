package Stubbing;

import java.util.*;

public class BookServices {

	private BookRepository bookRepository;
	public BookServices(BookRepository bookRepository)
	{
		this.bookRepository=bookRepository;
	}

	public java.util.List<Book> getNewBooksWithAppliedDiscount(int discountRate, int days)
	{
		java.util.List<Book> newBoooks = bookRepository.findNewBooks(days);

		for(Book book:newBoooks)
		{
			int price=book.getPrice();
			int newPrice = price-(discountRate*price/100);
			book.setPrice(newPrice);
		}

		return newBoooks;
	}

	
	public int calculateTotlaCost(List<String> bookId)
	{
		int totalCost=0;
		for(String bookID:bookId )
		{
			Book book=bookRepository.findBookByBookId(bookID);
			totalCost=book.getPrice()+totalCost;
			
		}
			
		
		
		
		return totalCost;
	}
	
	public String CallsayHello()
	{
		return sayHello();
	}
	
	private String sayHello()
	{
		return "Hello";
	}
	
	public void save(Book book)
	{
		bookRepository.save(book);
	}
	
	
	
}
