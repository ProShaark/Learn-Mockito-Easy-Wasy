package argumentCaptor;

import java.time.LocalDate;

public class BookRquest {

	
	private String title;
	private int price;
	private  LocalDate date;
	
	
	public BookRquest(String title, int price, LocalDate date) {
		super();
		this.title = title;
		this.price = price;
		this.date = date;
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
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
}
