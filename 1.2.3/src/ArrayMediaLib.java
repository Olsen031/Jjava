
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib {
    public static void main(String args[]) {
        String[] sharingFriends = {"Jamal",
                "Emily",
                "Destiny",
                "Mateo",
                "Sofia"
        };

        for (int i = 0; i < sharingFriends.length; ++i) {
            System.out.println(sharingFriends[i]);
        }


        // ------------Part III------------------

        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0;
        double average;

        for (int val : daysBtwnPurchase) {
            total = total + val;


        }
        average = total / daysBtwnPurchase.length;
        System.out.println("Average days inbetween purchase are: " + average);


        // ---------------Part IV---------------
        Song[] topTenSongs = {new Song("Highway to Hell"),
                new Song("Living after Midnight"),
                new Song("Slow Ride"),
                new Song("Strutter"),
                new Song("Love Gun"),
                new Song("Thunderstruck"),
                new Song("Cold Gin")
        };

        for (Song s : topTenSongs) {
            System.out.println(s.getTitle());
        }

        // change the array
        System.out.println("-BEFORE--");
        for (Song changeSong : topTenSongs) {
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());
        }
// show the array
        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
        }

        int count = 0;
        for (Song s : topTenSongs) {
            if (count % 3 == 0) {
                System.out.println("Name of song: " + s.getTitle() + ".99");
            } else
                System.out.println("Name of song: " + s.getTitle() + "1.29");
            ++count;
        }



        int index = SongFinder.findTitle(topTenSongs, "Slow Ride");
        if (index >= 0) {
            System.out.println("Found " + topTenSongs[index].getTitle());
        } else {
            System.out.println("Song not found!");
        }

        index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
        if (index >= 0) {
            System.out.println("Discount found " + topTenSongs[index].getTitle());
        } else {
            System.out.println("No songs are discounted");
        }

        System.out.println("--Find last song --");
        index = SongFinder.getIndexLastTitle(topTenSongs);
        if (index >= 0 ) {
            System.out.println("Last title: " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("You have a blank title!");
        }
    }
}

