// Задание 2
public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {
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

    public static void main(String args[]) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanova Darya Ivanovna", "accountant", "ivanova@gmail.com",
                "8 900-546-56-50", 33400 ,36);
        persArray[1] = new Person("Kondratiev Gennady Mikhailovich", "security guard", "kondratiev@gmail.com",
                "8 903-526-13-09", 30400 ,51);
        persArray[2] = new Person("Loginova Valeria Tarasovna", "director", "loginova@gmail.com",
                "8 945-064-67-34", 70550 ,31);
        persArray[3] = new Person("Vasilyeva Alexandra Maksimovna", "accountant", "vasilyeva@gmail.com",
                "8 975-345-23-35", 30550 ,23);
        persArray[4] = new Person("Denisov Anatoly Yaroslavovich", "shop assistant", "denisov@gmail.com",
                "8 967-378-12-90", 28550 ,21);

        for (Person employee : persArray) {
            employee.getInfo();
        }
    }
}

