package ProjectFilms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FeatureFilm extends Films{
	
	private List<Actor> actors;
	private List<Rating> rating;
	private static List<Actor> allActors = new ArrayList<Actor>();
	
	//vytvoreni filmu
	FeatureFilm(String name, String director, int year){
		super.name = name;
		super.director = director;
		super.year = year;
		actors = new ArrayList<Actor>();
		rating = new ArrayList<Rating>();
	}
	
	//pridani hodnoceni bez komentare
	public static void addRating(String filmName, int points) {
		for(Films film : Films) {
			if(film.name == filmName) {
				((FeatureFilm)film).rating.add(new Rating(points));
				return;
			}	
		}
	}

	//pridani hodnoceni s komentarem
	public static void addRating(String filmName, int points, String comment) {
		for(Films film : Films) {
			if(film.name == filmName) {
				((FeatureFilm)film).rating.add(new Rating(points, comment));
				return;
			}	
		}
	}
	
	public static List<Rating> getRatings(String filmName) {
		for(Films film : Films) {
			if(film.name == filmName) {
				Collections.sort(((FeatureFilm)film).rating);
				return ((FeatureFilm)film).rating;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "\nFilm: " + name + ", Director: " + director + ", Year: " + year + "\nActors: " + actors;
	}
	
	public static void addActor(String filmName, String actorName) {
		if(allActors == null) {
			allActors.add(new Actor(actorName));
		}
		Films tempFilm = null;
		//najdu si film
		for(Films film : Films) {
			if(film.name == filmName) {
				tempFilm = film;
				break;
			}
		}
		//zjistim jestli tento herec s timto jmennem existuje
		for(Actor actor : allActors) {
			//pokud existuje najdu ho
			if(actor.getActorName() == actorName) {
				((FeatureFilm)tempFilm).actors.add(actor);
				actor.addActorFilm(tempFilm);
				return;
			}
		
		}
		//pokud neexistuje vytovrim ho
		allActors.add(new Actor(actorName));
		//pak jej najdu a udelam prirazeni
		for(Actor actor : allActors) {
			if(actor.getActorName() == actorName) {
				((FeatureFilm)tempFilm).actors.add(actor);
				actor.addActorFilm(tempFilm);
				return;
			}
		
		}
	}
	
	public static void removeActor(String filmName, String actorName) {
		Films tempFilm = null;
		//najdu si film
		for(Films film : Films) {
			if(film.name == filmName) {
				tempFilm = film;
				break;
			}
		}
		
		//zjistim jestli tento herec s timto jmennem existuje
				for(Actor actor : allActors) {
					//pokud existuje smazu ho
					if(actor.getActorName() == actorName) {
						((FeatureFilm)tempFilm).actors.remove(actor);
						actor.removeActorFilm(tempFilm);
						return;
					}
				
				}
	}
	
	public static List<Actor> getActors(String filmName) {
		for(Films film : Films) {
			if(film.name == filmName)
				return ((FeatureFilm)film).actors;
		}
		return null;
	}
	
	public static List<Actor> getAllActors(){
		return allActors;
	}
}
