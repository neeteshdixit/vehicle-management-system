package studentmanagementsystem;

public class Students {
    String name;
    int rollNumber;
    float mathmarks;
    float physicsmarks;
    float chemistrymarks;
    float totalmarks;


    Students(String name, int rollNumber, float mathmarks, float physicsmarks, float chemistrymarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mathmarks = mathmarks;
        this.physicsmarks = physicsmarks;
        this.chemistrymarks = chemistrymarks;
    }

    public static void calculateAverage(float mathmarks, float physicsmarks, float chemistrymarks) {
        float total = mathmarks + physicsmarks + chemistrymarks;
        float average = total / 3;
        System.out.println("Average marks: " + average);
    }

    public static void displayStudent(String name, int rollno){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
    }

    public static void maxmarks(float mathmarks, float physicsmarks, float chemistrymarks){
        float max = Math.max(mathmarks, Math.max(physicsmarks, chemistrymarks));
        System.out.println("Maximum marks: " + max);
    }

    public static void main(String[] args) {
        Students student1 = new Students("Alice", 1, 85.5f, 90.0f, 78.0f);
        Students student2 = new Students("Bob", 2, 92.0f, 88.5f, 95.0f);

        System.out.println("Student 1:");
        displayStudent(student1.name, student1.rollNumber);
        calculateAverage(student1.mathmarks, student1.physicsmarks, student1.chemistrymarks);
        maxmarks(student1.mathmarks, student1.physicsmarks, student1.chemistrymarks);

        System.out.println("\nStudent 2:");
        displayStudent(student2.name, student2.rollNumber);
        calculateAverage(student2.mathmarks, student2.physicsmarks, student2.chemistrymarks);
        maxmarks(student2.mathmarks, student2.physicsmarks, student2.chemistrymarks);
    }
}

