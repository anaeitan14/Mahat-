package q5spring2022;

public class SongTest {

	public static void main(String[] args) {
		Song[] songList = new Song[3];
		songList[0] = new Song("okok", 5, "song1");
		songList[1] = new Song("two", 4, "song1");
		songList[2] = new Song("twotwo", 8, "song1");
		Disc myDisk = new Disc("song12", songList);

		Song[] songList2 = new Song[5];
		songList2[0] = new Song("songtwo", 5, "sirsir");
		songList2[1] = new Song("ok", 4, "to");
		songList2[2] = new Song("no", 3, "yes");
		songList2[3] = new Song("song3", 8, "song5");
		songList2[4] = new Song("song9", 8, "song6");
		Disc myDisk2 = new Disc("song10", songList2);

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
