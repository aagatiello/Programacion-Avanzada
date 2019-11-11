package org.practica;

public class Books extends Products {

	long isbn;

	protected Books(String title, String author, long isbn, int examples, int availables) {
		super(title, author, examples, availables);
		this.isbn = isbn;
	}

	public long getIsbn() {
		return isbn;
	}

	@Override
	public String getAttributes() {
		return super.getAttributes() + "\t ISBN: " + this.isbn;
	}

}
