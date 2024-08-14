class Student {
    // Fields
    private String name;
    private String id;
    private double grade;

    // Constructor
    public Student(String name, String id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Non-Static Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    // Static Method to calculate the average grade of students
    public static double calculateAverageGrade(Student[] students) {
        double total = 0;
        for (Student student : students) {
            total += student.grade;
        }
        return total / students.length;
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Alice", "S001", 85.5);
        Student student2 = new Student("Bob", "S002", 90.0);
        Student student3 = new Student("Charlie", "S003", 78.0);

        // Displaying each student's details
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();

        // Creating an array of students
        Student[] students = { student1, student2, student3 };

        // Calculating and printing the average grade
        double averageGrade = Student.calculateAverageGrade(students);
        System.out.println("Average Grade: " + averageGrade);
    }
}
