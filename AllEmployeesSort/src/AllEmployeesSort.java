import java.util.Scanner;

public class AllEmployeesSort {
    public static void main(String[] args) {
        Employee w1 = new Employee();
        Employee w2 = new Employee();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the name of the first Employee: ");
        w1.setName(scan.next());
        System.out.print("Please enter the department of the first Employee: ");
        w1.setDepartment(scan.next());
        System.out.print("Please enter the age of the first Employee: ");
        w1.setAge(scan.nextInt());

        System.out.print("Please enter the name of the second Employee: ");
        w2.setName(scan.next());
        System.out.print("Please enter the department of the second Employee: ");
        w2.setDepartment(scan.next());
        System.out.print("Please enter the age of the second Employee: ");
        w2.setAge(scan.nextInt());

        EmployeeNameSort eNS = new EmployeeNameSort();
        int checkName = eNS.compare(w1, w2);
        if (checkName == -1)
            eNS.getEmployeesNameSortReport().append("Employee name one is less than second one.");
        else if (checkName == 1)
            eNS.getEmployeesNameSortReport().append("Employee name one is more than second one.");
        else
            eNS.getEmployeesNameSortReport().append("The names are equal.");
        System.out.println(eNS.getEmployeesNameSortReport());

        EmployeeDepartmentSort eDS = new EmployeeDepartmentSort();
        int checkDepartment = eNS.compare(w1, w2);
        if (checkDepartment == -1)
            eDS.getEmployeesDepartmentSortReport().append("Employee department one is less than second one.");
        else if (checkDepartment == 1)
            eDS.getEmployeesDepartmentSortReport().append("Employee department one is more than second one.");
        else
            eDS.getEmployeesDepartmentSortReport().append("The departments are equal.");
        System.out.println(eDS.getEmployeesDepartmentSortReport());

        EmployeeAgeSort eAS = new EmployeeAgeSort();
        int checkAge = eAS.compare(w1, w2);
        if (checkAge < 0)
            eAS.getAgeSortReport().append("Employee age one is less than second one.");
        else if (checkAge > 0)
            eAS.getAgeSortReport().append("Employee age one is more than second one.");
        else
            eAS.getAgeSortReport().append("The ages are equal.");
        System.out.println(eAS.getAgeSortReport());

        scan.close();
    }
}
