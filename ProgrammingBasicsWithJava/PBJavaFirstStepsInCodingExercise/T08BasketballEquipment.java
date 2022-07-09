package FirstStepsInCodingExercise;

import java.util.Scanner;

public class T08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        double shoes = fee - (0.4 * fee);
        double tracksuit = shoes - (0.2 * shoes);
        double ball = 0.25 * tracksuit;
        double acs = 0.2 * ball;

        double total = fee + shoes + tracksuit + ball + acs;

        System.out.println(total);
    }
}
