package ProjectFilms;

public class Program {

	public static void main(String[] args) {
		Films.Films.add(new FeatureFilm("Puss in boots", "Banderas", 2023));
		Films.Films.add(new FeatureFilm("Transformers", "Michael Bay", 2000));
		
		//vypis vsech filmu
		for(Films film : Films.Films) {
			System.out.println(film);
		}
		
		System.out.println();
		Films.editDirector("Puss in boots", "Orlando");
		FeatureFilm.addActor("Transformers", "Megan Fox");
		FeatureFilm.addActor("Transformers", "Optimus Prime");
		FeatureFilm.addActor("Puss in boots", "Megan Fox");
		FeatureFilm.removeActor("Transformers", "Optimus Prime");
		FeatureFilm.addRating("Puss in boots", 8, "Good movie");
		FeatureFilm.addRating("Puss in boots", 10, "Great movie");
		
		for(Films film : Films.Films) {
			System.out.println(film);
		}
		System.out.println();
		System.out.println(Films.findFilm("Puss in boots") + "\nRatings: "+ FeatureFilm.getRatings("Puss in boots"));
		
		System.out.println();
		System.out.println("Films of Megan" + Actor.getFilms("Megan Fox"));
		
	}

}
