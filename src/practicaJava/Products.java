package practicaJava;

public class Products {

	private String title;
	private String author;
	private int examples; 
	private int availables;

	public Products (String title, String author, int examples, int availables) {
		this.title = title;
		this.author = author;
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

	public int getExamples() {
		return examples;
	}

	public void setExamples(int examples) {
		this.examples = examples;
	}

	public int getAvailables() {
		return availables;
	}

	public void setAvailables(int availables) {
		this.availables = availables;
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
		return "Title: " + this.title + "\t Author/director: " + this.author + "\t Examples: " + this.examples + "\t Availables: " + this.availables; 
	}


}
