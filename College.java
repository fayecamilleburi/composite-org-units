import java.util.*;

public class College implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        units.add(unit);
    }

    @Override
    public int getNumberOfStudents() {
        int count = 0;
        for (EducationalUnit unit : units) {
            count += unit.getNumberOfStudents();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double budget = 0;
        for (EducationalUnit unit : units) {
            budget += unit.getBudget();
        }
        return budget;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "College: " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails(indent + "  ");
        }
    }
}