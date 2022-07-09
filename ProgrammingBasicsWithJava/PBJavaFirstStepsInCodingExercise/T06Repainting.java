package FirstStepsInCodingExercise;

import java.util.Scanner;

public class T06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int areanylon = Integer.parseInt(scanner.nextLine());
        int quantitypaint = Integer.parseInt(scanner.nextLine());
        int quantitythinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylon = (areanylon + 2) * 1.50;
        double paint = (quantitypaint * 1.1) * 14.5;
        int thinner = quantitythinner * 5;
        double work = hours * 0.3 * (nylon + paint + thinner + 0.4);
        double total = nylon + paint + thinner + 0.4 + work;

        System.out.println(total);
    }
}
