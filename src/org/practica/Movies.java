package org.practica;

public class Movies extends Products {

	int yearReleased;

	protected Movies(String title, String director, int yearReleased, int examples, int availables) {
		super(title, director, examples, availables);
		this.yearReleased = yearReleased;
	}

	@Override
	public String getAttributes() {
		return super.getAttributes() + "\t Year released: " + this.yearReleased;
	}

}
