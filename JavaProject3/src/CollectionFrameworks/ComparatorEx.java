package CollectionFrameworks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeData {
    String eName;
    int eSalary;
    LocalDate eDateOfJoining;
    String eDesignation;

    public EmployeeData(String eName, int eSalary, LocalDate eDateOfJoining, String eDesignation) {
        this.eName = eName;
        this.eSalary = eSalary;
        this.eDateOfJoining = eDateOfJoining;
        this.eDesignation = eDesignation;
    }

    @Override
    public String toString() {
        return "Employee [eName=" + eName + ", eSalary=" + eSalary + ", eDateOfJoining=" +
                eDateOfJoining + ", eDesignation=" + eDesignation + "]";
    }
}

class SortByDOJ implements Comparator<EmployeeData> {
    @Override
    public int compare(EmployeeData o1, EmployeeData o2) {
        return o1.eDateOfJoining.compareTo(o2.eDateOfJoining);
    }
}

class SortByName implements Comparator<EmployeeData> {
    @Override
    public int compare(EmployeeData o1, EmployeeData o2) {
        return o1.eName.compareTo(o2.eName);
    }
}

public class ComparatorEx {
    public static void main(String[] args) {
        ArrayList<EmployeeData> e = new ArrayList<>();
        EmployeeData el = new EmployeeData("Sharmii", 60, LocalDate.of(2000, 2, 5), "python");
        e.add(el);
        e.add(new EmployeeData("befii", 10, LocalDate.of(2002, 3, 1), "c++"));
        e.add(new EmployeeData("shakthi", 20, LocalDate.of(2003, 4, 1), "c"));
        e.add(new EmployeeData("fathima", 30, LocalDate.of(2005, 5, 1), "java"));
        e.add(new EmployeeData("nasrin", 40, LocalDate.of(2002, 6, 1), "c#"));
        e.add(new EmployeeData("remii", 50, LocalDate.of(2001, 7, 1), "css"));

        // Sorting by Date of Joining
        Collections.sort(e, new SortByDOJ());
        System.out.println("Sort by DOJ:");
        for (EmployeeData emp : e) {
            System.out.println(emp);
        }
        // Sorting by Name
        Collections.sort(e, new SortByName());
        System.out.println("Sort by Name:");
        for (EmployeeData emp : e) {
            System.out.println(emp);
        }
    }
}
