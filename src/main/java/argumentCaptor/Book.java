package argumentCaptor;

import java.time.LocalDate;

public class Book {

	private String bookId;
	private String title;
	private int price;
	private String PunlisherName;
	private  LocalDate date;
	

	public Book() {
		super();

	}
	public Book(String bookId, String title, int price, String punlisherName, LocalDate date) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		PunlisherName = punlisherName;
	}
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPunlisherName() {
		return PunlisherName;
	}

	public void setPunlisherName(String punlisherName) {
		PunlisherName = punlisherName;
	}
	
	
	
	
}
