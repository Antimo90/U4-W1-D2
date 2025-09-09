package Exercise_3;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("inserisci una frase");
            String stringToSplit = scanner.nextLine();
            if (Objects.equals(stringToSplit, ":q")) break;
            for (int i = 0; i < stringToSplit.length(); i++) {
                System.out.print(stringToSplit.charAt(i));
                if (i < stringToSplit.length() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
