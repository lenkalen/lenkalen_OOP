package Lesson_HW;
//  1. Создание класса "Сотрудник" с полями: ФИО, должность, email,телефон, зарплата, возраст.
public class Employee {
    private String surname;
    private String name;
    private String secondName;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

//    2. Конструктор класса.
    public Employee(String surname,
                    String name,
                    String secondName,
                    String position,
                    String email,
                    String telephone,
                    int salary,
                    int age) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.position = position ;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
//    3. Вывод информации об объекте в консоль.
//    Getter
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public String getTelephone() {
        return telephone;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public String getInfoEmployee() {
        return surname + " " + name + " " + secondName + ", " + position + ", " + email  + ", " + telephone + ", "
                + salary + " BYN" + ", " + "Full years: " + age;
    }
}



