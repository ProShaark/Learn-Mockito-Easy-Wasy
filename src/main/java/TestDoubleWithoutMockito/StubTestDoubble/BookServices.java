package TestDoubleWithoutMockito.StubTestDoubble;

import java.awt.List;

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

}
