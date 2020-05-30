package C1811L;

public class Book {
	private String name_book;
	private Author[] author;
	private double price_book;
	private int quantity;
				//	Author(String name, String email, char gender){
				//		
				//	}
	Book(){}
	public double getPrice_book() {
		return price_book;
	}

	public void setPrice_book(double price_book) {
		this.price_book = price_book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName_book() {
		return name_book;
	}
	public Author getAuthor() {
        for (Author a: author) {
            return a;
        }
        return null;
    }
	public void setAuthor(Author[] author) {
		this.author = author;
	}
//	public Author[] getAuthor() {
//		return author;
//	}
	Book(String name_book,Author[] authors, double price_book, int quantity){
		
		this.name_book = name_book;
		this.author = authors;
		this.price_book = price_book; 
		this.quantity = quantity;
	}

	Book(String name_book, Author[] author, double price_book) {
		
		this.name_book = name_book;
		this.author = author;
		this.price_book = price_book;
	}
	
	
}
