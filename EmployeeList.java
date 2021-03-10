package Lesson5;

public class EmployeeList {

    public static final int PRINT_AGE = 40; // возраст, не ниже которого отображается список

    public static void main(String[] args) {

        Employee employee = new Employee("Иван Иванов", "Уборщик", "ivanov@vektor.ru", "252", "10000", "30");

        employee.printListEmployee();

        System.out.println();

        // вывод в консоль из массива сотрудников старше, чем значение PRINT_AGE


        Employee[] listEmployees = new Employee[5];


        listEmployees[0] = new Employee("Иван Иванов", "Директор", "ivanov@vektor.ru",
                "001", "100000", "50");

        listEmployees[1] = new Employee("Петр Петров", "Бухгалтер", "petrov@vektor.ru",
                "002", "90000", "45");

        listEmployees[2] = new Employee("Василий Васильев", "Менеджер", "vasiliev@vektor.ru",
                "003", "70000", "32");

        listEmployees[3] = new Employee("Григорий Григорьев", "Охранник", "grigoriev@vektor.ru",
                "004", "30000", "50");

        listEmployees[4] = new Employee("Мария Ивановна", "Уборщица", "отсутствует",
                "отсутствует", "10000", "60");


        for (int i = 0; i < listEmployees.length; i++) {

            if (Integer.parseInt(listEmployees[i].getAge()) > PRINT_AGE)
                listEmployees[i].printListEmployee();

            System.out.println();

        }
    }
}
