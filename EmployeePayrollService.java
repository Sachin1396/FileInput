import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {


     Scanner scanner = new Scanner(System.in);
     ArrayList<EmployeePayrollData> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.readEmployeePayrollData();
        employeePayrollService.writeEmployeePayrollData();


    }

    public void readEmployeePayrollData() {
        System.out.println("enter the id of employee");
        int id = scanner.nextInt();
        System.out.println("enter the name");
        String name = scanner.next();
        System.out.println("enter the employee salary");
        int salary = scanner.nextInt();
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(id,name,salary);
        arrayList.add(employeePayrollData);

    }
        public void writeEmployeePayrollData () {
            System.out.println(arrayList);

        }
    }

