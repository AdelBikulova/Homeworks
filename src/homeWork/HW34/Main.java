package homeWork.HW34;

import java.util.Arrays;

public class Main {

    /*
    Создать программу для бухгалтерии, которая сможет делать следующее:

    1. добавлять сотрудников в штат
    2. удалять сотрудников из штата
    3. рассчитать зарплату для двух категориев сотрудников
        - сотрудник с почасовой оплатой;
        - менеджер по продажам (проценты с продаж)
    4. Добавление и удаление сотрудников, а также методы для вывода на экран списка сотрудников
    и суммирования зарплат всех сотрудников должны находиться в классе Company
    5. В программе должны быть также классы WageEmployee и SaleManager с полями id, name, secondName,
        количество проработанных часов, а также метод для расчета зарплаты.
    6. У сотрудников на почасовой оплате должно быть поле ставка в час. Метод расчета его зарплаты
        должен учитывать минимальный размер оплаты труда
    7. У менеджера по продажам нет фиксированной оплаты труда, его зарплата рассчитывается как процент
        от объема продаж. Но его метод оплаты также должен учитывать минимальный размер оплаты труда
    8. Программа должна быть написана с использованием свойства наследования

       class Company :
       methods
       addEmployee
       removeEmployee
       display
       sumSalary

       fields
       employees
       companySize

    Task 2
    В проекте Accounting добавить возможность сортировки сотрудников по фамилии.
    (Вам может понадобится вариант метода sort, принимающий массив и индексы элементов начала и конца сортировки)

    Task 3
    В проекте Accounting добавить дополнительные возможности сортировки сотрудников:
    1.по id,
    2.по имени и если имена одинаковые то по id.
    */

    public static void main(String[] args) {

        Employee salesManager1 = new SalesManager(7,
                "John",
                "Smith",
                80,
                100000,
                0.05);

        Employee salesManager2 = new SalesManager(1,
                "Ann",
                "Black",
                30,
                100000,
                0.5);

        Employee salesManager3 = new SalesManager(4,
                "Mary",
                "Kraft",
                65,
                100000,
                0.3);

        Employee wageEmployee1 = new WageEmployee(2, "John", "Snow", 50, 20.5);
        Employee wageEmployee2 = new WageEmployee(45, "Ann", "Brown", 30, 6.0);
        Employee wageEmployee3 = new WageEmployee(21, "Garry", "Potter", 80, 12.9);

        Employee[] employees = {salesManager1, salesManager2, salesManager3, wageEmployee1, wageEmployee2, wageEmployee3};

        System.out.println("Sort by ID");
        Arrays.sort(employees, new ComparatorByID());
        for (Employee employee : employees)
            System.out.println(employee);

        System.out.println();

        System.out.println("Sort by FirstName");
        Arrays.sort(employees, new ComparatorByFirstName());
        for (Employee employee : employees)
            System.out.println(employee);

        System.out.println();

        System.out.println("Sort by FirstName and ID");
        Arrays.sort(employees, new FirstNameThenIDComparator());
        for (Employee employee : employees)
            System.out.println(employee);
    }
}
