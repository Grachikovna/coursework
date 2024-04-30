import java.util.Random;

public class Main {
    //Базовая сложность
    // private static final Employee[] employees = new Employee[10];
    private static final Random random = new Random(1);

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.add("Neverova Irina ", 20000, 1);
        employeeBook.add("Grigoryan Roman ", 25000, 2);
        System.out.println(employeeBook);
    }
}







