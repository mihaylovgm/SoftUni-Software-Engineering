package FirstStepsInCodingExercise;

import java.util.Scanner;

public class T04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allpages = Integer.parseInt(scanner.nextLine());
        int pagesinahour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int book = allpages / pagesinahour;
        int readinghours = book / days;

        System.out.println(readinghours);
    }
}
