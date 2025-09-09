package Exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------ES 1 di ES 1----------");
        System.out.println("Inserisci una frase");
        String phrase = scanner.nextLine();
        boolean isEven = evenOrOdd(phrase);
        System.out.println(isEven);

        System.out.println("----------ES 2 di ES 1----------");
        int anno = Integer.parseInt(scanner.nextLine());
        boolean isLeap = leapYear(anno);
        System.out.println(isLeap);
        scanner.close();
    }

    public static boolean evenOrOdd(String inputString) {
        int lengthString = inputString.length();
        if (lengthString % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
