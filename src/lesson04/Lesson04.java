package lesson04;


public class Lesson04 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Владимир Николаевич", "программист", "+71234567890", 70000, 29);
        employees[1] = new Employee("Петров Игорь Олегович", " специалист тех.поддержки", "+79876543210", 25000, 47);
        employees[2] = new Employee("Сидорова Мария Владимировна", "бухгалтер", "+71234567890", 40000, 43);
        employees[3] = new Employee("Попова Анна Николаевна", "аналитик", "+7987654321", 55000, 31);
        employees[4] = new Employee("Иванова Ольга Васильевна", "стажер", "+7987654321", 20000, 22);

        // Задание 4
        System.out.println(employees[1].getName());
        System.out.println(employees[2].getPosition());

        // Задание 5
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee.getName() + ", " + employee.getPosition() + ", " + employee.getPhone() + ", " + employee.getSalary() + ", " + employee.getAge());
            }
        }
    }
}
