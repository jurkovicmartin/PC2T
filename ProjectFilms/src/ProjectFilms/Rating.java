package ProjectFilms;

public class Rating implements Comparable<Rating>{
	
		private int points;
		private String comment;
		
		Rating(int points){
			this.points = points;
		}
		Rating(int points, String comment){
			this.points = points;
			this.comment = comment;
		}
		
		public int getPoints() {
			return points;
		}
		
		@Override
		public String toString() {
			return "\nPoints: " + points + ", Comment: " + comment;
		}
		@Override
		public int compareTo(Rating o) {
			if(this.points == o.points)
				return 0;
			if(this.points < o.points)
				return 1;
			return -1;
		}

}
