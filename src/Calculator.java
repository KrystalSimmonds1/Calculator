import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNum, secondNum, answer;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        firstNum = scanner.nextInt();

        System.out.println("Enter your second number: ");
        secondNum = scanner.nextInt();

        System.out.println("Please select an operation: '1' for Addition, '2' for Multiplication, '3' for Subtraction and '4' for Division");

        int choice;
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println(addition(firstNum, secondNum));
        } else if (choice == 2) {
            System.out.println(multiplication(firstNum, secondNum));
        } else if (choice == 3) {
            System.out.println(subtraction(firstNum, secondNum));
        } else if (choice == 4) {
            if (firstNum < secondNum) {
                System.out.println(division(firstNum, secondNum));
            } else {
                System.out.println("Division cannot be performed");
            }

        } else {
            System.out.println("Invalid selection.");
        }
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static double division(double x, double y) {
        return x / y;

    }
}
