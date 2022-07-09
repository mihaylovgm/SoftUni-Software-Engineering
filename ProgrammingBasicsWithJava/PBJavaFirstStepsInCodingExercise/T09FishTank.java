package FirstStepsInCodingExercise;

import java.util.Scanner;

public class T09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = (lenght * high * width) * 0.001;
        double filling = volume * percent / 100;
        double litres = volume - filling;

        System.out.println(litres);
    }
}
