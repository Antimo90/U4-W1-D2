package Exercise_Bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // calcolatrice avanzata
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il primo numero");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("inserisci un operatore tra +, -, *, /, %");
        char operatore = scanner.nextLine().charAt(0);
        System.out.println("inserisci il secondo numero");
        double num2 = Double.parseDouble(scanner.nextLine());
        double risultato = 0.0;

        if (operatore == '/' && num2 == 0) {
            System.out.println("Errore : impossibile dividere per 0");
        } else {
            switch (operatore) {
                case '+':
                    risultato = num1 + num2;
                    break;
                case '-':
                    risultato = num1 - num2;
                    break;
                case '*':
                    risultato = num1 * num2;
                    break;
                case '/':
                    risultato = num1 / num2;
                    break;
                case '%':
                    risultato = num1 % num2;
                    break;
                default:
                    System.out.println("Operatore non valido");
            }
            System.out.println("il risultato è " + risultato);
        }
    }
}
