package TestDoubleWithoutMockito.SpyTestDouble;



public class BookRepositryClass implements BookRepository {

	int saveCalled=0;
	Book lastBook;
	@Override
	public void save(Book book) {
		saveCalled++;
		lastBook=book;
		
	}

	public int timesCalled()
	{
		return saveCalled;
	}
	public boolean lastBookMethod(Book book)
	{
		return lastBook.equals(book);
	}
	
}
