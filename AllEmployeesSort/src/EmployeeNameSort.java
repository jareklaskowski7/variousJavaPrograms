import java.util.Comparator;

public class EmployeeNameSort implements Comparator<Employee> {
    private StringBuilder employeesNameSortReport;

    EmployeeNameSort() {
        employeesNameSortReport = new StringBuilder();
    }

    public StringBuilder getEmployeesNameSortReport() {
        return employeesNameSortReport;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getName().compareTo(e2.getName()), 0);
    }
}
