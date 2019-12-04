package org.practica;

public class Movies extends Products {

	private int yearReleased;

	protected Movies(String title, String director, int yearReleased, int examples, int availables) {
		super(title, director, examples, availables);
		this.yearReleased = yearReleased;
	}

	@Override
	public String getAttributes() {
		return "Title: " + super.getTitle() + "\t Author/director: " + super.getAuthor() + "\t Examples: " + super.getExamples() + "\t Availables: " + super.getAvailables() + "\t Year released: " + this.yearReleased;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

}
