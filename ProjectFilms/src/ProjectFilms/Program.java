package ProjectFilms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		FeatureFilm help = new FeatureFilm();
		Films.Films.add(new FeatureFilm("Puss in boots", "Banderas", 2023));
		Films.Films.add(new FeatureFilm("Transformers", "Michael Bay", 2000));
		
		
		for(Films film : Films.Films) {
			System.out.println(film);
		}
		
		System.out.println();
		Films.editDirector("Puss in boots", "Orlando");
		help.addActor("Transformers", "Megan Fox");
		help.addActor("Transformers", "Optimus Prime");
		help.removeActor("Transformers", "Optimus Prime");
		help.addRating("Puss in boots", 10, "Great movie");
		
		for(Films film : Films.Films) {
			System.out.println(film);
		}
	}

}
