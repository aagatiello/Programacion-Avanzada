package org.practica;

public abstract class Products implements InterfaceProducts {

	// Structural pattern applied (Decorator)

	private String author;
	private int availables;
	private int examples; 
	private String title;

	public Products() { }

	public Products (String title, String author, int examples, int availables) {
		this.title = title;
		this.author = author;
		this.examples = examples;
		this.availables = availables;
	}

	public String getAuthor() {
		return author;
	}

	public int getAvailables() {
		return availables;
	}

	public int getExamples() {
		return examples;
	}

	public String getTitle() {
		return title;
	}

	public boolean isAvailable() {
		boolean available = true;
		if (availables == 0) {
			available = false;
		} else {
			availables--;
		}
		return available;
	}

	public boolean isReturned() {
		boolean returned = true;
		if (availables < examples) {
			availables++;
		} else {
			returned = false;
		}
		return returned;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setAvailables(int availables) {
		this.availables = availables;
	}

	public void setExamples(int examples) {
		this.examples = examples;
	}

	public void setTitle(String title) {
		this.title = title;
	} 

}
