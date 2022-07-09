package FirstStepsInCodingExercise;

import java.util.Scanner;

public class T05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packsPens = Integer.parseInt(scanner.nextLine());
        int packsMarkers = Integer.parseInt(scanner.nextLine());
        int packsCleaner = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pricePens = packsPens * 5.80;
        double priceMarkers = packsMarkers * 7.20;
        double priceCleaner = packsCleaner * 1.20;
        double discountPercent = discount/100;

        double total = pricePens + priceMarkers + priceCleaner;
        double totalPrice = total - (total * discountPercent);

        System.out.println(totalPrice);
    }
}
