package com.gb.lessons;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван Иванов", "менеджер", "ivan@mail.ru", "+123456789", 15500, 29);
        employees[1] = new Employee("Олег Быков", "архитектор", "oleg@mail.ru", "+90002341", 50000, 41);
        employees[2] = new Employee("Мария Миронова", "разработчик", "maria@mail.ru", "+190200987", 45000, 39);
        employees[3] = new Employee("Павел Буханкин", "администратор", "pasha@mail.ru", "+7078903371", 39900, 45);
        employees[4] = new Employee("Вадим Пивоваров", "маркетолог", "vadim@mail.ru", "+77078953341", 25000, 43);

        for (Employee employee: employees) {
            if (employee.getAge() > 40)
                employee.print();
        }
    }
}
