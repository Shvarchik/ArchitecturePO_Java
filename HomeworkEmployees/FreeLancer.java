package HomeworkEmployees;

class Freelancer extends Employee{

    public Freelancer(String surname, String name, double salary) {
        super(surname, name, salary);
    }

    @Override
    public double calculateSalary() {
        return 20 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Ср/мес заработная плата: %.2f (руб.); Почасовая ставка: %.2f (руб.)",
                surname, name, calculateSalary(), salary);
    }
}
