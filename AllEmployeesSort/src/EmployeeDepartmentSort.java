import java.util.Comparator;

public class EmployeeDepartmentSort implements Comparator<Employee> {
    private StringBuilder employeesDepartmentSortReport;

    EmployeeDepartmentSort() {
        employeesDepartmentSortReport = new StringBuilder();
    }

    public StringBuilder getEmployeesDepartmentSortReport() {
        return employeesDepartmentSortReport;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getDepartment().compareTo(e2.getDepartment()), 0);
    }
}
