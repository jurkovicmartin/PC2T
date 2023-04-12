package ProjectFilms;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//nacteni dat z databaze
		Scanner sc = new Scanner(System.in);
		String operation;
		
		while(true) {
			System.out.println("Choose operation: ");
			System.out.println("a - Add film");
			System.out.println("b - Edit film");
			System.out.println("c - Delete film");
			System.out.println("d - Add rating to film");
			System.out.println("e - Print all films");
			System.out.println("f - Search for film");
			System.out.println("g - Print all actors / animators with more than 1 film");
			System.out.println("h - Print all films of 1 actor / animator");
			System.out.println("i - Save info about film to file");
			System.out.println("j - Import info about film from file");
			System.out.println("0 - End program");
			operation = sc.next();
			
			switch(operation) {
			case "0":{
				//ulozeni dat do databaze
				return;
			}
//dodelat pridavani hercu
			case "a":{	
				boolean run = true;
				String choice;
				while(run) {
					System.out.println("Choose film");
					System.out.println("1 - Feature film");
					System.out.println("2 - Animated film");
					System.out.println("0 - Go back");
					choice = sc.next();
					switch(choice) {
					case "1":{
						System.out.println("Insert name of film");
						sc.nextLine();
						String name = sc.nextLine();
						if(Films.doesFilmExists(name)) {
							System.out.println("Film allready exists");
							break;
						}
						System.out.println("Insert director of film");
						String director = sc.nextLine();
						int year;
						while(true) {
							System.out.println("Insert year of release");
							if(sc.hasNextInt()) {
								year = sc.nextInt();
								break;
							}
							System.out.println("Wrong input. Insert number");
							sc.next();
						}
						Films.Films.add(new FeatureFilm(name, director, year));
						break;
					}
					case "2":{
						System.out.println("Insert name of film");
						sc.nextLine();
						String name = sc.nextLine();
						if(Films.doesFilmExists(name)) {
							System.out.println("Film allready exists");
							break;
						}
						System.out.println("Insert director of film");
						String director = sc.nextLine();
						int year;
						while(true) {
							System.out.println("Insert year of release");
							if(sc.hasNextInt()) {
								year = sc.nextInt();
								break;
							}
							System.out.println("Wrong input. Insert number");
							sc.next();
						}
						int age;
						while(true) {
							System.out.println("Insert recommended age for film");
							if(sc.hasNextInt()) {
								age = sc.nextInt();
								break;
							}
							System.out.println("Wrong input. Insert number");
							sc.next();
						}
						Films.Films.add(new AnimatedFilm(name, director, year, age));
						break;
					}
					case "0":{
						run = false;
						break;
					}
					default:
						System.out.println("Wrong opeartion. Insert operation again.");
						break;
					}
				}
				break;
			}
			case "b":{
				break;
			}
			case "c":{
				break;
			}
			case "d":{
				break;
			}
			case "e":{
				if(Films.Films.isEmpty()) {
					System.out.println("No existing films");
				}
				else {
					for(Films film : Films.Films) 
						System.out.println(film);
				}
				break;
			}
			case "f":{
				break;
			}
			case "g":{
				break;
			}
			case "h":{
				break;
			}
			case "j":{
				break;
			}
			default:{
				System.out.println("Wrong opeartion. Insert operation again.");
				break;
			}
		}
		}
		/*
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
		// C
		FeatureFilm.removeFilm("Tetris");
		//F
		System.out.println(Films.findFilm("Creed") + "\nRatings: "+ FeatureFilm.getRatings("Creed"));
		// H
		System.out.println("Films of Megan" + Actor.getActorsFilms("Megan Fox"));
		// G
		System.out.println("------");
		for(Actor actor : FeatureFilm.getActorsWithMoreThanOneFilm()) {
			System.out.println("\n" + actor);
			System.out.println(actor.getFilms());
		}*/
		
	}

}
