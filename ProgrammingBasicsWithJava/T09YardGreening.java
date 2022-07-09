package FirstStepsInCodingLab;

import java.util.Scanner;

public class T09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double totalPrice = area * 7.61;
        double discount = 0.18*totalPrice;
        double finalPrice = totalPrice - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
