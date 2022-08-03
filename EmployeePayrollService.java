import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    // public enum IOService{CONSOLE_ID,FILE_ID,DB_ID,REST_IO}
    public List<EmployeePayrollData> employeePayrollDataList;

    // public EmployeePayrollService(){}

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList) {

    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollDataList);
        Scanner scanner = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(scanner);
        employeePayrollService.writeEmployeePayrollData();

    }

    public void readEmployeePayrollData(Scanner scanner) {
        System.out.println("enter the employee id");
        Integer id = scanner.nextInt();
        System.out.println("enter the employee name");
        String name = scanner.next();
        System.out.println("enetr the salary");
        Integer salary = scanner.nextInt();
        try {
            employeePayrollDataList.add(new EmployeePayrollData(id, name, salary));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void writeEmployeePayrollData () {
            System.out.println(employeePayrollDataList);
        }
    }

