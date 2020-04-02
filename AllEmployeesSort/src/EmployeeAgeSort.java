import java.util.Comparator;

public class EmployeeAgeSort implements Comparator<Employee> {
    private StringBuilder employeesAgeSortReport;

    EmployeeAgeSort() {
        employeesAgeSortReport = new StringBuilder();
    }

    public StringBuilder getAgeSortReport() {
        return employeesAgeSortReport;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }
}
