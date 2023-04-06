package ProjectFilms;

import java.util.ArrayList;
import java.util.List;

public class Actor {
	
	private String name;
	private List<Films> films;
	
	// novy herec
	Actor(String actorName){
		name = actorName;
		films = new ArrayList<Films>();
	}
	
	public String getActorName() {
		return name;
	}
	
	public void addActorFilm(Films film) {
		films.add(film);
	}
	
	public void removeActorFilm(Films film) {
		films.remove(film);
	}
	
	@Override
	public String toString() {
		return name;
	}
}