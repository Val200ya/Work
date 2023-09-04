public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.add("Иванов", "Андрей", "Васильевич", "водитель", 50000);
        //employee.add("Виноградов", "Владимир", "Сергеевич", "Водитель", 50000);
        System.out.println("ID сотрудника: " + employee.id + ", ФИО сотрудника: " + employee.surname1 + " " + employee.name + " " + employee.surname2 + ", должность: " + employee.position + ", зарплата: " + employee.salary + " р. в месяц");
    }
}
