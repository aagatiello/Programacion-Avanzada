package org.practica;

public class Books extends Products {

	private long isbn;

	protected Books(String title, String author, long isbn, int examples, int availables) {
		super(title, author, examples, availables);
		this.isbn = isbn;
	}

	@Override
	public String getAttributes() {
		return "Title: " + super.getTitle() + "\t Author/director: " + super.getAuthor() + "\t Examples: " + super.getExamples() + "\t Availables: " + super.getAvailables() + "\t ISBN: " + this.isbn;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
}
