package org.practica;

import java.util.ArrayList;

public interface InterfaceProducts {

	public String getTitle();
	public void setTitle(String title);

	public String getAuthor();
	public void setAuthor(String author);

	public int getExamples();
	public void setExamples(int examples);

	public int getAvailables();
	public void setAvailables(int availables);

	public String getAttributes();

	public boolean isAvailable();

	public boolean isReturned();

	public static boolean search(String title, ArrayList<Products> Plist) {
		return false;
	}
}
