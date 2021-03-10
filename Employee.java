package Lesson5;

public class Employee {


    private String name, jobTitle, eMail, phoneNumber, salary, age;


    public Employee(String name, String jobTitle, String eMail, String phoneNumber, String salary, String age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printListEmployee() {
        System.out.println("Имя:" + name);
        System.out.println("Должность:" + jobTitle);
        System.out.println("E-Mail:" + eMail);
        System.out.println("Телефон:" + phoneNumber);
        System.out.println("Зарплата:" + salary + "руб.");
        System.out.println("Возраст:" + age + "лет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) { this.salary = salary; }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
