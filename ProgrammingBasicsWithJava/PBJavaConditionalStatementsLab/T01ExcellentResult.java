package PBJavaConditionalStatementsLab;

import java.util.Scanner;

import static java.lang.System.*;

public class T01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int grade = Integer.parseInt(scanner.nextLine());

        //boolean isExcellent = grade >= 5;

        if (grade >=5) {
            System.out.println("Excellent!");
        }
    }
}
