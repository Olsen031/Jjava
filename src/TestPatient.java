public class TestPatient {

    public static void main(String[] args){
        BloodData person1 = new BloodData("O", '+');
        Patient info1 = new Patient(0, 0);
        info1.display();
        person1.display();
    }
}
