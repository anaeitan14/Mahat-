package q5spring2022;

public class Song {

	private String name;
	private String performer;
	private int length;

	public Song(String name, int length, String performer) {
		this.name = name;
		this.length = length;
		this.performer = performer;
	}

	public void setName(String s) {
		this.name = s;
	}

	public void setPerfomer(String p) {
		this.performer = p;
	}

	public void setLenght(int l) {
		this.length = l;
	}

	public String getName() {
		return this.name;
	}

	public String getPerformer() {
		return this.performer;
	}

	public int getLength() {
		return this.length;
	}

	public String toString() {
		return "Song name: " + name + " Perfomer name: " + performer + " song length: " + length;
	}

	public String status() {
		return performer + "/" + name + ":" + length;
	}
}
