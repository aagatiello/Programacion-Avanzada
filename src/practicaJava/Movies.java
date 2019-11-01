package practicaJava;

public class Movies extends Products {

	int year_released;
	
	protected Movies(String title, String director, int year_released, int examples, int availables) {
		super(title, director, examples, availables);
		this.year_released = year_released;
	}

	public String getAttributes() {
		return super.getAttributes() + "\t Year released: " + this.year_released;
	}

}
