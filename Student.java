public class Student {
    // 1. Three private attributes
    private String name;
    private String studentId;
    private double grade;

    // 2. Constructor that sets all three attributes
    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    // 3. Getters for all attributes
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // 4. Method to display student's info
    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + studentId + " | Grade: " + grade);
    }

    // 5. Main method to create objects and test functionality
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Juan Dela Cruz", "2026-001", 90.0);
        Student student2 = new Student("Maria Santos", "2026-002", 88.5);

        // Change one student's grade using the setter (e.g., updating Juan's grade to 92.0)
        student1.setGrade(92.0);

        // Call displayInfo() on both objects
        student1.displayInfo();
        student2.displayInfo();
    }
}