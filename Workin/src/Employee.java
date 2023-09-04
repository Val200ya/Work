public class Employee {
    public int id;
    public String surname1;
    public String name;
    public String surname2;
    public String position;
    public int salary;
    public void add(String employeeSurname1, String employeeName, String employeeSurname2, String employeePosition, int employeeSalary){
        surname1 = employeeSurname1;
        name = employeeName;
        surname2 = employeeSurname2;
        position = employeePosition;
        salary = employeeSalary;
        id = (int) (Math.random() * (1000 - 1)) + 1;
    }
    public void Select(){

    }
}
