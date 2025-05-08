public class Teacher implements EducationalUnit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public int getNumberOfStudents() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Teacher: " + name + " | Subject: " + subject + " | Salary: " + salary);
    }
}