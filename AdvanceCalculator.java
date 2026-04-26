
import java.util.Scanner;

public class AdvanceCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println(" welcome to the Advance Calculator ");
        System.out.println(" type ' exit' any time to quit");

        whilw( running;) {
            System.out.println(" enter first number ( or ' exit') ");
            String input = scanner.next();
            if (input.equalsIgnoreCase(" exit ")) {
                System.out.println(" goodbye");
                running = false;
                break;
            }

            double num1 = Double.parseDouble(input);
            System.out.print(" enter  operation ( +,-,*,/):");
            String op = scanner.next();
            System.out.println(" enter second number ");
            double num2 = scanner.nextDouble();
            double result = (0);
            boolean valid = true;
            if (op.equals("+")) {
                result = num1 + num2;
            } else if (op.equals("-")) {
                result = num1 - num2;
            } else if (op.equals(" *")) {
                result = num1 * num2;
            } else if (op.equals("/")) {
                if (num2 == (double)0.0F) {
                    System.out.println(" Error : cannot divide by zero ");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("invalid operation ");
                valid = false;
            }

            if (valid) {
                System.out.println(" result:" + result);
            }
        }
        System.oau.println();

        scanner.close();
    }


