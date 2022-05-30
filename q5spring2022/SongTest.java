package q5spring2022;

public class SongTest {

	public static void main(String[] args) {
		Song[] songList = new Song[3];
		songList[0] = new Song("King Crimson", 5, "Schizoid man");
		songList[1] = new Song("THC", 4, "Sweet caroline");
		songList[2] = new Song("Marianoa", 8, "Okay");
		Disc myDisk = new Disc("Crimson king", songList);

		Song[] songList2 = new Song[5];
		songList2[0] = new Song("King Crimson", 5, "Schizoid man");
		songList2[1] = new Song("THC", 4, "Sweet caroline");
		songList2[2] = new Song("Lmao", 3, "Okay");
		songList2[3] = new Song("okay Dude", 8, "Okay");
		songList2[4] = new Song("Marianoa", 8, "Okay");
		Disc myDisk2 = new Disc("Comfortably numb", songList2);

		Song ns = new Song("Ququ", 120, "Buku");
		System.out.println(ns.status());
		System.out.println(largeDiscName(myDisk, myDisk2));
	}

	public static String largeDiscName(Disc d1, Disc d2) {

		int disc1Amount = 0;
		int disc2Amount = 0;

		for (int i = 0; i < d1.getSongs().length; i++) {
			disc1Amount++;
		}

		for (int i = 0; i < d2.getSongs().length; i++) {
			disc2Amount++;
		}

		if (disc1Amount > disc2Amount) {
			return d1.getdiscName();
		} else {
			return d2.getdiscName();
		}
	}

}
