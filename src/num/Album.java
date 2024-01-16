package num;

public class Album {

	private String Name;// = "jn950";
	private String Artist;// = "Yosef";
	private int BBC;// = "Number 5";
	
	Album(){
	Name = "jn950";
	Artist = "Yosef";
	BBC = 5;	
	}
	
	public String toString() {
		String Stat = "";
		
		Stat+= Artist+" released an album called "+Name+" "
				+ "in 2020 December as a holiday album and was "
				+ "Number "+BBC+" on the Billboard Charts";
	return Stat;
	}
	public double calcSpotifyPrice( double pr ){
		double Price = 100/pr;
		return Price;
		
		
	}
}
