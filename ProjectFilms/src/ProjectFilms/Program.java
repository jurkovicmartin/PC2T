package ProjectFilms;

public class Program {

	public static void main(String[] args) {
		// A
		Films.Films.add(new FeatureFilm("Creed", "Banderas", 2023));
		Films.Films.add(new FeatureFilm("Transformers", "Michael Bay", 2000));
		Films.Films.add(new FeatureFilm("John Wick", "Martyn", 2023));
		Films.Films.add(new FeatureFilm("Tetris", "Michael", 2023));
		
		// E
		for(Films film : Films.Films) {
			System.out.println(film);
		}
		
		// A / B
		System.out.println("------");
		Films.editDirector("Creed", "Orlando");
		FeatureFilm.addActor("Transformers", "Megan Fox");
		FeatureFilm.addActor("Transformers", "Optimus Prime");
		FeatureFilm.addActor("Creed", "Megan Fox");
		FeatureFilm.addActor("Tetris", "Megan Fox");
		FeatureFilm.addActor("Creed", "Antonio");
		FeatureFilm.addActor("John Wick", "Antonio");
		FeatureFilm.removeActor("Transformers", "Optimus Prime");
		
		// D
		FeatureFilm.addRating("Creed", 8, "Good movie");
		FeatureFilm.addRating("Creed", 10, "Great movie");
		
		
		// E
		for(Films film : Films.Films) {
			System.out.println(film);
		}
		System.out.println("------");
		
		// C
		FeatureFilm.removeFilm("Tetris");
		
		// E
		for(Films film : Films.Films) {
			System.out.println(film);
		}
		
		//F
		System.out.println("------");
		System.out.println(Films.findFilm("Creed") + "\nRatings: "+ FeatureFilm.getRatings("Creed"));
		
		// H
		System.out.println("------");
		System.out.println("Films of Megan" + Actor.getActorsFilms("Megan Fox"));
		
		// G
		System.out.println("------");
		for(Actor actor : FeatureFilm.getActorsWithMoreThanOneFilm()) {
			System.out.println("\n" + actor);
			System.out.println(actor.getFilms());
		}
		
	}

}
