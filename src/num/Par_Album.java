package num;
//create album class based on your midterm exam
// 2 concrete child classes 
/*
Create a generic class called Album.
Identify the private attributes of the class,
have a no arg constructor and
a regular constructor which takes in arguments
Have a toString() function when called generates the statement like the one given above. 
Write a method for the class calcSpotifyPrice( double pr ) which takes an argument Base Price and divide it by the Billboard rating to calculate the Spotify price. For example if the base price passed in is 100$ and Billboard rating is 5, the Spotify price is 100/5 = $20.0
No gets and sets required. 
Write a main to create an object of the class A1 using the regular constructor. The variables passed into the constructor should make sure that System.out.println( A1 ) should print out the above statement where John is replaced with the first name and js1234 is replaced with your student id. 
*/

public abstract class Par_Album {
	private String Name;// = "jn950";
	private String Artist;// = "Yosef";
	private int BBC;// = "Number 5";
	private String genre;
	private int yearR;

	Par_Album(){
	Name = "jn950";
	Artist = "Yosef";
	BBC = 5;
	genre = "clasic";
	yearR = 2000;
	}
	
	Par_Album(String N,String A,int C, String G, int Y){
		this.Name = N;
		this.Artist = A;
		this.BBC = C;
		this.genre = G;
		this.yearR = Y;
	}

	public String toString() {
		String Stat = "";
		
		Stat+= Artist+" released an album called "+Name+" "
				+ "in the year"+yearR+" as a "+genre+" album and was "
				+ "Number "+BBC+" on the Billboard Charts";
	return Stat;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	public int getBBC() {
		return BBC;
	}

	public void setBBC(int bBC) {
		BBC = bBC;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearR() {
		return yearR;
	}

	public void setYearR(int yearR) {
		this.yearR = yearR;
	}
}

class OnlineAlbum extends Par_Album{
	private String Platform; 
	
	public double calcSpotifyPrice( double pr ){
		double Price = 100/pr;
		return Price;
}
	
	public double CalPriice() {
		if (Platform == "Spotify";)
			double price = calcSpotifyPrice(C);
	}
}