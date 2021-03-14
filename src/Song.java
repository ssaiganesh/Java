
public class Song {
	private String title;
	private String artist;
	private int length;
	private static int songsCount = 0; //same for all the objects under songs class
	//public, private, protected -- access modifiers
	
	public Song(String title, String artist, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
		songsCount++;
		// System.out.println("song count: " + songsCount);
	}
	
	public void playSong() {
		System.out.println("Playing: " + this.title + " by "+ this.artist + " of length " + this.length + " seconds.");
	}
	

	
	public int getSongsCount() {
		return songsCount;
	}
	
	//GETTERS & SETTERS
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
}
