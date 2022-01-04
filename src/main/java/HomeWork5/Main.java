package HomeWork5;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Developer", "java1@mail.ru", "892791455", 15000, 50);
        employeeArray[1] = new Employee("Yakimenko Pavel", "Manager", "teamdlead@mail.ru", "895897622", 250000, 59);
        employeeArray[2] = new Employee("Kirkorov Filip", "Engineer", "qa1@mail.ru", "895789634", 16000, 46);
        employeeArray[3] = new Employee("Simanov Sergey", "Developer", "java2@mail.ru", "89235489", 12000, 35);
        employeeArray[4] = new Employee("Danilenko Dima", "Engineer", "qa2@mail.ru", "892568746", 14500, 28);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
