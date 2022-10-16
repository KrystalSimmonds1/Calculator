import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNum, secondNum, sum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        firstNum = scanner.nextInt();

        System.out.println("Enter your second number: ");
        secondNum = scanner.nextInt();

        sum = addition(firstNum, secondNum);

        System.out.println(sum);
    }

    public static int addition(int x, int y) {
        return x + y;
    }
}
