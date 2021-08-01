package Lesson_HW;

public class Launch {
    public static void main(String[] args) {
//  4. Создание массива из 5 сотрудников.
       Employee leadingEmployee = new Employee("Каминский", "Игорь", "Олегович",
                "project Manager", "ikaminski@gmail.com", "+375291280326", 4200, 41);
       Employee[] project = {
               leadingEmployee,
               new Employee("Козич", "Светлана", "Витальевна", "analyst",
                       "sKozich@mail.ru", "+375296548914", 3000, 50),
               new Employee("Матусевич", "Сергей", "Валерьевич", "driver",
                       "matus@mail.ru", "+375445238914", 1500, 49),
               new Employee("Аксинович", "Сергей", "Сергеевич", "programmer",
                       "axel@gmail.com", "+375257841245", 3800, 34),
               new Employee("Макеенко", "Вячеслав", "Васильевич", "programmer",
                       "vmakeenko@mail.ru", "+375294851154", 3600, 28)
       };

        printProject(project);
        System.out.println("***************");
        employeeOld(project, 40);
    }

    public static void printProject(Employee[] project) {
        System.out.println("Project team: ");
            for (int i = 0; i < project.length; i++)
            System.out.println(project[i].getInfoEmployee());
    }
//  5. Вывод информации только о сотрудниках старше 40 лет.
    public static void employeeOld(Employee[] project, int fullYear) {
            for (int i = 0; i < project.length; i++)
                if (project[i].getAge() > fullYear) {
                    System.out.println(project[i].getInfoEmployee());
                }
        }
}