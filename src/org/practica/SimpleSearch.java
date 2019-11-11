package org.practica;

public class SimpleSearch implements Search {

	private String [] names;

	public SimpleSearch(String [] names) {
		this.names = names;
	}

	@Override
	public boolean found(String name) {
		boolean found = false;
		for (int i=0; i < names.length; i++) {
			if (names[i].equals(name)) return true;
		}
		return found;
	}

}
