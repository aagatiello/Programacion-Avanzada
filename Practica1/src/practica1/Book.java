package practica1;

public class Book {

	String title;
	String author;
	long isbn;
	int examples; 
	int availables;

	public Book(String title, String author, long isbn, int examples, int availables) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.examples = examples;
		this.availables = availables;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getExamples() {
		return examples;
	}

	public void setExamples(int examples) {
		this.examples = examples;
	}

	public Boolean isAvailable() {
		boolean available = true;
		if (availables == 0) {
			available = false;
		} else {
			availables--;
		}
		return available;
	}

	public Boolean isReturned() {
		boolean returned = true;
		if (availables < examples) {
			availables++;
		} else {
			returned = false;
		}
		return returned;
	}

	public String getAttributes() {
		return "Title: " + this.title + "\t Author: " + this.author + "\t ISBN: " + this.isbn + "\t Examples: " + this.examples + "\t Availables: " + this.availables; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
