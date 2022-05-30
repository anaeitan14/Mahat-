package q5spring2022;

public class Disc {
	private String discName;
	private Song[] songs;

	public Disc(String discName, Song[] songs) {
		this.discName = discName;
		this.songs = songs;
	}

	public void setdiscName(String d) {
		this.discName = d;
	}

	public void setSongs(Song[] s) {
		this.songs = s;
	}

	public String getdiscName() {
		return this.discName;
	}

	public Song[] getSongs() {
		return this.songs;
	}

	public String toString() {
		return "Disc name: " + discName + " Songs:" + songs;
	}

	public boolean exist(String nSong, String pSong) {
		for (int i = 0; i < this.songs.length; i++) {
			if (this.songs[i].getName().equals(nSong) && this.songs[i].getPerformer().equals(pSong)) {
				return true;
			}
		}
		return false;
	}
}
