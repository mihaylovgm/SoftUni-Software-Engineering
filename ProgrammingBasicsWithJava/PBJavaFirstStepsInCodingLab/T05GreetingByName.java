package FirstStepsInCodingLab;

import java.util.Scanner;

public class T05GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, " + name + "!");
    }
}
