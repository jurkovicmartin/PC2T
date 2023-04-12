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
	
	public static void removeFilm(String filmName) {
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				for(Actor actor : ((FeatureFilm)film).actors) {
					actor.removeFilm(film);
				}
				Films.remove(film);
				return;
			}	
		}
	}
	
	//pridani hodnoceni bez komentare
	public static void addRating(String filmName, int points) {
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				((FeatureFilm)film).rating.add(new Rating(points));
				return;
			}	
		}
	}

	//pridani hodnoceni s komentarem
	public static void addRating(String filmName, int points, String comment) {
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				((FeatureFilm)film).rating.add(new Rating(points, comment));
				return;
			}	
		}
	}
	
	public static List<Rating> getRatings(String filmName) {
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
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
		if(allActors.isEmpty()) {
			allActors.add(new Actor(actorName));
		}
		Films tempFilm = null;
		//najdu si film
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				tempFilm = film;
				break;
			}
		}
		//zjistim jestli tento herec s timto jmennem existuje
		for(Actor actor : allActors) {
			//pokud existuje najdu ho
			if(actor.getName().equals(actorName)) {
				((FeatureFilm)tempFilm).actors.add(actor);
				actor.addFilm(tempFilm);
				return;
			}
		
		}
		//pokud neexistuje vytovrim ho
		allActors.add(new Actor(actorName));
		//pak jej najdu a udelam prirazeni
		for(Actor actor : allActors) {
			if(actor.getName().equals(actorName)) {
				((FeatureFilm)tempFilm).actors.add(actor);
				actor.addFilm(tempFilm);
				return;
			}
		
		}
	}
	
	public static void removeActor(String filmName, String actorName) {
		Films tempFilm = null;
		//najdu si film
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				tempFilm = film;
				break;
			}
		}
		
		//zjistim jestli tento herec s timto jmennem existuje
		for(Actor actor : allActors) {
			//pokud existuje smazu ho
			if(actor.getName().equals(actorName)) {
				((FeatureFilm)tempFilm).actors.remove(actor);
				actor.removeFilm(tempFilm);
				return;
				}
				
		}
	}
	
	public static List<Actor> getActors(String filmName) {
		for(Films film : Films) {
			if(film.name.equals(filmName))
				return ((FeatureFilm)film).actors;
		}
		return null;
	}
	
	public static List<Actor> getAllActors(){
		return allActors;
	}
	
	//funguje jen z pulky, nevypise filmy toho herce
	public static List<Actor> getActorsWithMoreThanOneFilm(){
		List<Actor> tempList = new ArrayList<Actor>();
		for(Actor actor : allActors) {
			if(actor.getFilms().size() > 1) {
				tempList.add(actor);
			}
		}
		return tempList;
	}

}
