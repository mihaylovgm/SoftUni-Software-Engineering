package FirstStepsInCodingExercise;

import java.util.Scanner;

public class T02RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());
        double gradus = rad*180/Math.PI;

        System.out.println(gradus);
    }
}
