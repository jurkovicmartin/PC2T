package ProjectFilms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimatedFilm extends Films {
	
	private List<Animator> animators;
	private List<Rating> rating;
	private int age;
	private static List<Animator> allAnimators = new ArrayList<Animator>();
	
	AnimatedFilm(String name, String director, int year, int recommendedAge){
		super.name = name;
		super.director = director;
		super.year = year;
		age = recommendedAge;
		animators = new ArrayList<Animator>();
		rating = new ArrayList<Rating>();
	}
	
	public static void editAge(String filmName, int newAge) {
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				((AnimatedFilm)film).age = newAge;
				return;
			}	
		}
	}
	
	public static void removeFilm(String filmName) {
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				for(Animator animator : ((AnimatedFilm)film).animators) {
					animator.removeFilm(film);
				}
				Films.remove(film);
				return;
			}	
		}
	}
	
	public static void addRating(String filmName, int points) {
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				((AnimatedFilm)film).rating.add(new Rating(points));
				return;
			}	
		}
	}
	
	public static void addRating(String filmName, int points, String comment) {
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				((AnimatedFilm)film).rating.add(new Rating(points, comment));
				return;
			}	
		}
	}
	
	public static List<Rating> getRatings(String filmName) {
		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				Collections.sort(((AnimatedFilm)film).rating);
				return ((AnimatedFilm)film).rating;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "\nFilm: " + name + ", Director: " + director + ", Year: " + year + ", Recommended age: " + age + "\nAnimators: " + animators;
	}
	
	public static void addAnimator(String filmName, String animatorName) {
		if(allAnimators.isEmpty()) {
			allAnimators.add(new Animator(animatorName));
		}
		Films tempFilm = null;

		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				tempFilm = film;
				break;
			}
		}

		for(Animator animator : allAnimators) {

			if(animator.getName().equals(animatorName)) {
				((AnimatedFilm)tempFilm).animators.add(animator);
				animator.addFilm(tempFilm);
				return;
			}
		
		}

		allAnimators.add(new Animator(animatorName));

		for(Animator animator : allAnimators) {
			if(animator.getName().equals(animatorName)) {
				((AnimatedFilm)tempFilm).animators.add(animator);
				animator.addFilm(tempFilm);
				return;
			}
		
		}
	}
	
	public static void removeAnimator(String filmName, String animatorName) {
		Films tempFilm = null;

		for(Films film : Films) {
			if(film.name.equals(filmName)) {
				tempFilm = film;
				break;
			}
		}
		
		for(Animator animator : allAnimators) {

			if(animator.getName().equals(animatorName)) {
				((AnimatedFilm)tempFilm).animators.remove(animator);
				animator.removeFilm(tempFilm);
				return;
			}
				
		}
	}
	
	public static List<Animator> getAnimators(String filmName) {
		for(Films film : Films) {
			if(film.name.equals(filmName))
				return ((AnimatedFilm)film).animators;
		}
		return null;
	}
	
	public static List<Animator> getAllAnimators(){
		return allAnimators;
	}
	
	//funguje jen z pulky, nevypise filmy toho herce
		public static List<Animator> getAnimatorsWithMoreThanOneFilm(){
			List<Animator> tempList = new ArrayList<Animator>();
			for(Animator animator : allAnimators) {
				if(animator.getFilms().size() > 1) {
					tempList.add(animator);
				}
			}
			return tempList;
		}
}
