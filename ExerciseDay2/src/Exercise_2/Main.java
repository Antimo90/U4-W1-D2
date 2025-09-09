package Exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dammi un numero");
        int num = Integer.parseInt(scanner.nextLine());
        String letters = switch (num) {
            case 0 -> "Zero";
            case 1 -> "Uno";
            case 2 -> "Due";
            case 3 -> "Tre";
            default -> "Errore numero non accettato";
        };
        System.out.println(letters);
    }


}
