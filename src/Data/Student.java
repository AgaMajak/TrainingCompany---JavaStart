package Data;

public class Student extends Person {
    String attendedClasses;
    double monthlyCharge;

    public Student(String firstName, String lastName, int phoneNumber, String attendedClasses, double monthlyCharge) {
        super(firstName, lastName, phoneNumber);
        this.attendedClasses = attendedClasses;
        this.monthlyCharge = monthlyCharge;
    }
}
