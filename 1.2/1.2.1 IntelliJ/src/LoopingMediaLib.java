
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    
    public static void main(String args[]) {

        boolean isNull = true;

        while (isNull == true) {
            String songInfo = MediaFile.readString();

            if (songInfo == null) {
                isNull = false;
            }
            if (isNull == true) {
                System.out.print("Title: ");
                System.out.println(songInfo);
            }
        }
        MediaFile.saveAndClose();
    }




      /*  for(int i = 0; i <= 100; i += 1)
        {
            String songInfo = MediaFile.readString();
            System.out.print("Title: ");
            System.out.println(songInfo);
        }
        MediaFile.saveAndClose();
    }
    */
}

