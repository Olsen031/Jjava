public class Patient {
    private int idNum;
    private int age;

    public Patient(int num1, int num2){
        idNum = num1;
        age = num2;
    }

    public void display(){
        System.out.println("The patients id number is, " + idNum + ". They are " + age + " year(s) old.");
    }
}
