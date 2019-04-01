public class Algorithms {
    public static void main(String args[]) {
        Song[] tenSongs = {new Song(9, "Highway to Hell"),
                new Song(5, "Living after Midnight"),
                new Song(2, "Slow Ride"),
                new Song(6, "Strutter"),
                new Song(9, "Love Gun"),
                new Song(4, "Thunderstruck"),
                new Song(10, "Cold Gin")
        };
        for(int i = 0; i < tenSongs.length; i++){
            System.out.println(tenSongs[i]);
        }
    }
}
