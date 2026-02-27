import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class classobject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // One-time input
        System.out.print("Enter name: ");
        String inputName = sc.nextLine();
        System.out.print("Enter roll number: ");
        int inputRoll = sc.nextInt();

        // First student object
        Student s1 = new Student();
        s1.name = inputName;
        s1.rollNo = inputRoll;
        s1.display();

        // Second student object (same input reused)
        Student s2 = new Student();
        s2.name = inputName;
        s2.rollNo = inputRoll + 1; // example: next roll number
        s2.display();

        sc.close();
    }
}
