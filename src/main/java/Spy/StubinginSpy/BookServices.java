package Spy.StubinginSpy;

import java.util.*;

public class BookServices {

	public Book findBook(String bookId) {
		
		return null;
	}

	public int getAppliedDiscount(Book book, int discountRate) {
		int price =book.getPrice();
		price = price-(discountRate*price/100);
		return price;
	}

	
}
