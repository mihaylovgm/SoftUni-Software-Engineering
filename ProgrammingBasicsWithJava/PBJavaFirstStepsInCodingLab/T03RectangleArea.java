package FirstStepsInCodingLab;

import java.util.Scanner;

public class T03RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int Area = a * b;
        System.out.println(Area);
    }
}
