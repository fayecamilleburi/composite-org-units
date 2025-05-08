public class UniversityClient {
    public static void main(String[] args) {
        // Create Teachers
        Teacher t1 = new Teacher("Dr. Smith", "CS101", 60000);
        Teacher t2 = new Teacher("Prof. Johnson", "CS102", 65000);

        // Create Students
        Student s1 = new Student("Alice", "2021001", 30000);
        Student s2 = new Student("Bob", "2021002", 30000);

        // Create Department
        Department csDept = new Department("Computer Science");
        csDept.add(t1);
        csDept.add(t2);
        csDept.add(s1);
        csDept.add(s2);

        // Create College
        College cics = new College("College of Informatics and Computing Studies");
        cics.add(csDept);

        // Add standalone student and teacher directly to College
        cics.add(new Student("Charlie", "2021003", 28000));
        cics.add(new Teacher("Dr. Alice", "Math101", 55000));

        // Display Details
        cics.displayDetails("");

        // Show Metrics
        System.out.println("\nTotal Students: " + cics.getNumberOfStudents());
        System.out.println("Total Budget: " + cics.getBudget());
    }
}