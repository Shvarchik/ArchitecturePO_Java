package HomeworkEmployees;
    /**
 * Работник (базовый класс)
 */
abstract class Employee{

    protected String surname;
    protected String name;
    protected double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    protected Employee(String surname, String name, double salary) {
        
        this.surname = surname;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     */
    public abstract double calculateSalary();

}

