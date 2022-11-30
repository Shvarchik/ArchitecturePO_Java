package HomeworkEmployees;

/**
 * Рабочий (фулл-тайм)
 */
class Worker extends Employee{


    public Worker(String surname, String name, double salary) {
        super(surname, name, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Заработная плата (фикс.): %.2f (руб.)",
                surname, name, salary);
    }
}