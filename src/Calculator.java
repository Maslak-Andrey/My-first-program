import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String value1 = null;
        String value2 = null;
        String operation = null;

        System.out.println("Программа калькулятор");
        System.out.println("Введите 2 числа и математическую операцию, соблюдая пробелы (пример: 2 * 4)");

        Scanner scanner = new Scanner(System.in);
        value1 = scanner.next();
        operation = scanner.next();
        value2 = scanner.next();

        Logic.logic(value1, operation, value2);
    }
}
