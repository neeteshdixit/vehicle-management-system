package studentmanagementsystem;

import java.util.Scanner;

public class Students {

    String name;
    int rollNumber;
    float mathMarks;
    float physicsMarks;
    float chemistryMarks;

    Students(String name, int rollNumber,
             float mathMarks,
             float physicsMarks,
             float chemistryMarks) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.mathMarks = mathMarks;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
    }

    void calculateAverage() {

        float total = mathMarks + physicsMarks + chemistryMarks;
        float average = total / 3;

        System.out.println("Average = " + average);
    }

    void displayStudent() {

        System.out.println("Name = " + name);
        System.out.println("Roll Number = " + rollNumber);
    }

    void highestMarks() {

        float highest = mathMarks;

        if (physicsMarks > highest)
            highest = physicsMarks;

        if (chemistryMarks > highest)
            highest = chemistryMarks;

        System.out.println("Highest Marks = " + highest);
    }

    void checkPassFail() {

        float total = mathMarks + physicsMarks + chemistryMarks;

        if (total >= 150)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Students student1 =
                new Students(
                        "Alice",
                        1,
                        85.5f,
                        90.0f,
                        78.0f
                );

        System.out.println("1. Average");
        System.out.println("2. Display");
        System.out.println("3. Highest");
        System.out.println("4. Result");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                student1.calculateAverage();
                break;

            case 2:
                student1.displayStudent();
                break;

            case 3:
                student1.highestMarks();
                break;

            case 4:
                student1.checkPassFail();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}