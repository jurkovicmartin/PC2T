package ProjectFilms;

import java.util.ArrayList;
import java.util.List;

public abstract class Films {
	
	protected String name;
	protected String director;
	protected int year;
	public static List<Films> Films = new ArrayList<Films>();
	
	public void editName(String filmName, String newName) {
		for(Films film : Films) {
			if(film.name == filmName) {
				film.name = newName;
				return;
			}
		}
	}
	
	public static void editDirector(String filmName, String newDirector) {
		for(Films film : Films) {
			if(film.name == filmName) {
				film.director = newDirector;
				return;
			}
		}
	}
	
	public void editYear(String filmName, int newYear) {
		for(Films film : Films) {
			if(film.name == filmName) {
				film.year = newYear;
				return;
			}
		}
	}
	
}
