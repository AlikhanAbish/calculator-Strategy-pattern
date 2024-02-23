package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator(new Addition());

        System.out.println("Ready to calculate!");

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            String operator = scanner.next();

            switch (operator) {
                case "+":
                    calculator.setOperation(new Addition());
                    break;
                case "-":
                    calculator.setOperation(new Subtraction());
                    break;
                case "*":
                    calculator.setOperation(new Multiplication());
                    break;
                case "/":
                    calculator.setOperation(new Division());
                    break;
                default:
                    System.out.println("error");
                    continue;
            }

            try {
                double result = calculator.calculate(num1, num2);
                System.out.println("Answer: " + result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

        }

    }

}