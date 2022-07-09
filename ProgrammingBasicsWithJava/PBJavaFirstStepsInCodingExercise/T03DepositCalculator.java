package FirstStepsInCodingExercise;

import java.util.Scanner;

public class T03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        double months = Double.parseDouble(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double amount = deposit + months * ((deposit * interest / 100) / 12);

        System.out.println(amount);
      }
}
