package FirstStepsInCodingExercise;

import java.util.Scanner;

public class T07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numChicken = Integer.parseInt(scanner.nextLine());
        int numFish = Integer.parseInt(scanner.nextLine());
        int numVegeterian = Integer.parseInt(scanner.nextLine());

        double chicken = numChicken * 10.35;
        double fish = numFish * 12.40;
        double vege = numVegeterian * 8.15;
        double desert = 0.2 * (chicken + fish + vege);

        double total = chicken + fish + vege + desert + 2.5;

        System.out.println(total);
    }

}
