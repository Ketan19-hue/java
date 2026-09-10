import java.util.ArrayList;

public class collectionBasic {

    public static void main (String[] args) {

        System.out.println("Collection in Java");

        ArrayList<String> student = new ArrayList<>();
        student.add("Ketan");
        student.add("varun");
        student.add("yash");
        System.out.println("student list: " + student);

        //displaying name of the students using name temporary variable one by one
        for (String name : student) {
            System.out.println("My name is " + name);
        }

        System.out.println("First student: " + student.get(0));

        
    }
}