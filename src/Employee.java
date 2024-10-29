// Задание 1
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Сотрудник: " + fullName + ", " + position + ", " + email + ", " + phoneNumber + ", "
                + salary + ", " + age);
    }

    public static void main(String[] args) {
        Employee app = new Employee("Ivanova Darya Ivanovna", "accountant", "ivanova@gmail.com",
                "8 900-546-56-50", 33400 ,36);
        app.getInfo();
    }
}

