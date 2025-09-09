package Exercise_Bonus2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Conta vocali e consonanti
        Scanner scanner = new Scanner(System.in);
        int vocali = 0;
        int consonanti = 0;
        System.out.println("Inserisci una parola");
        String parola = scanner.nextLine().toLowerCase();
        for (int i = 0; i < parola.length(); i++) {
            char carattere = parola.charAt(i);
            if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                vocali++;
            } else {
                consonanti++;
            }
        }
        System.out.println("Numero vocali " + vocali);
        System.out.println("Numero consonanti " + consonanti);
    }
}
