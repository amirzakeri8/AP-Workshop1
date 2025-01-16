import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        String operation = scanner.next();
        int secondNumber = scanner.nextInt();

        int result = 0;

        switch (operation) {
            case "+" -> result = add(firstNumber, secondNumber);
            case "-" -> result = minus(firstNumber, secondNumber);
            case "*" -> result = multiply(firstNumber, secondNumber);
            case "/" -> result = divide(firstNumber, secondNumber);
        }

        System.out.println(result);
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int divide(int firstNumber, int secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        }
        return -1;
    }
}
