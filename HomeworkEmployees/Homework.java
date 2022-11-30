package HomeworkEmployees;

import java.util.Random;

public class Homework {

    static Employee generateEmployee (){

        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        Random rand = new Random();
        double salary;
        switch (rand.nextInt(2)){
            case 0:
                salary = (rand.nextInt(61) + 40)*1000;
                return new Worker(surnames[rand.nextInt(surnames.length)],names[rand.nextInt(surnames.length)], salary);
            case 1:
                salary = (rand.nextInt(16) + 5)*100;
                return new Freelancer(surnames[rand.nextInt(surnames.length)],names[rand.nextInt(surnames.length)], salary);
            default:
                return  null;
        }
    }

    public static void main(String[] args) {
        
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        for (Employee e: employees) {
            System.out.println(e);
        }
    }
}
