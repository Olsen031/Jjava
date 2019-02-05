public class BloodData {
    private String bloodType;
    private char rHFactor;


    public BloodData(String blood, char rH){
        bloodType = blood;
        rHFactor = rH;

    }

    public void display(){
        System.out.println("Blood type is: " + bloodType + " " + rHFactor);
    }


}
