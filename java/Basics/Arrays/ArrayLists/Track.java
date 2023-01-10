import java.util.ArrayList;
public class Track{
	private ArrayList<String> artists = new ArrayList<String>();
	private String name;
	private double duration;

	public void setArtists(String unformattedArtists){
		String []aux = unformattedArtists.split(",");
		for(int i = 0; i < aux.length; i++){
			this.artists.add(aux[i]);
		}
	}

	public void displayArtists(){
		System.out.println(this.artists);
	}
}