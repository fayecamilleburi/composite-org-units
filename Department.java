import java.util.*;

public class Department implements EducationalUnit {
    private String name;
    private List<EducationalUnit> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        members.add(unit);
    }

    @Override
    public int getNumberOfStudents() {
        int count = 0;
        for (EducationalUnit unit : members) {
            count += unit.getNumberOfStudents();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double budget = 0;
        for (EducationalUnit unit : members) {
            budget += unit.getBudget();
        }
        return budget;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Department: " + name);
        for (EducationalUnit unit : members) {
            unit.displayDetails(indent + "  ");
        }
    }
}