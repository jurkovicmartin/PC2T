package ProjectFilms;

import java.util.ArrayList;
import java.util.List;

public class FeatureFilm extends Films{

	class Rating{
		private int points;
		private String comment;
		
		Rating(int points){
			this.points = points;
		}
		Rating(int points, String comment){
			this.points = points;
			this.comment = comment;
		}
	}
	
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
	
	FeatureFilm(){
		
	}
	
	//pridani hodnoceni bez komentare
	public void addRating(String filmName, int points) {
		for(Films film : Films) {
			if(film.name == filmName) {
				((FeatureFilm)film).rating.add(new Rating(points));
				return;
			}	
		}
	}

	//pridani hodnoceni s komentarem
	public void addRating(String filmName, int points, String comment) {
		for(Films film : Films) {
			if(film.name == filmName) {
				((FeatureFilm)film).rating.add(new Rating(points, comment));
				return;
			}	
		}
	}
	
	@Override
	public String toString() {
		return "Film: " + name + ", Director: " + director + ", Year: " + year + "\nActors: " + actors;
	}
	
	public void addActor(String filmName, String actorName) {
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
	
	public void removeActor(String filmName, String actorName) {
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
	
	public List<Actor> getActors(String filmName) {
		for(Films film : Films) {
			if(film.name == filmName)
				return ((FeatureFilm)film).actors;
		}
		return null;
	}
}
