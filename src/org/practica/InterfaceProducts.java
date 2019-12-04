package org.practica;

public interface InterfaceProducts {

	public String getTitle();
	public void setTitle(String title);

	public String getAuthor();
	public void setAuthor(String author);

	public int getExamples();
	public void setExamples(int examples);

	public int getAvailables();
	public void setAvailables(int availables);

	public abstract String getAttributes();

	public boolean isAvailable();
	public boolean isReturned();
	
}
