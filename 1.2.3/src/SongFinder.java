public class SongFinder
{
    public static int findTitle(Song[] songs, String target){

        for (int i = 0; i < songs.length; i++) {
            String word = songs[i].getTitle();
            if (word.equals(target)) {
                return  i;
            } else
                return  -1;
        }
         return -1;
    }
    // Have not idea what do do on part 3

    public static int getIndexLastDiscount(Song[] songs, double compare){
        if (songs == null) return -1;

        int found = -1;
        for (int i = songs.length - 1; i >=0; i--) {
            if (songs[i].getPrice() < compare) {
                found = i;
            }
            else {
                found = -1; // to show none found
            }
        }
        return found;
    }
    // done with part 4????

    //**
    // Search through all songs, checking for blank titles.
        // If blank title is found, return -1 to indicate an error.
        // If all titles are "well-defined", return the last index in the array.

    public static int getIndexLastTitle(Song[] songs)
    {
        int i;
        if (songs == null) {
            return -1;
        }
        for (i = 0; i < songs.length - 1; i++) {
            // skip if no title
            if (songs[i].getTitle().equals("")) {
                return -1;
            }
        }
        return i;
    }
}