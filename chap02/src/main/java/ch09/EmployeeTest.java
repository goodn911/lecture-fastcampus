package ch09;

public class EmployeeTest {
    public static void main(String[]args){

        Employee employee = new Employee();
        employee.setEmployeeName("이순신");

        System.out.println(Employee.getSerialNum());

        Employee employee1 = new Employee();
        employee1.setEmployeeName("김유신");


        System.out.println(employee.getEmployeeName()+ employee.getEmployeeId());
        System.out.println(employee1.getEmployeeName()+employee1.getEmployeeId());
    }

}
