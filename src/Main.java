import java.util.Random;

public class Main {
    private static final Employee[] employees = new Employee[10];
    private static final Random random = new Random(1);

    public static void main(String[] args) {
        for (int i = 0; i < employees.length; i++) {
            double salary = Math.round(20_000 + 50_000 * random.nextDouble());
            employees[i] = new Employee("ФИО сотрудника " + i,
                    random.nextInt(1, 6), salary);
            System.out.println(employees[i]);

        }

        printAll();
        System.out.println(getSalarySum());
        System.out.println(getEmployeeWithMinSalary());
        System.out.println(getEmployeeWithMaxSalary());
        System.out.println(getAverageSalary());
        printAllNames();

    }

    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);

        }


    }

    private static double getSalarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        return sum;

    }

    private static Employee getEmployeeWithMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee getEmployeeWithMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    private static double getAverageSalary() {
        return getSalarySum() / employees.length;
    }

    private static void printAllNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}