public class EmployeePayrollData {

        public int id;
        //public String name;
       public int salary;
       public String name;
    public EmployeePayrollData(int id,String name,int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
