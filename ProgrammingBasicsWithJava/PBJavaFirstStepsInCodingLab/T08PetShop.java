package FirstStepsInCodingLab;

import java.util.Scanner;

public class T08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double dogs = Double.parseDouble(scanner.nextLine());
        Double cats = Double.parseDouble(scanner.nextLine());
        Double sum = (dogs * 2.5) + (cats * 4);
        System.out.println(sum + " lv.");
    }

}
