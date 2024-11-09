import java.util.Scanner;

import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Geben Sie die zweite Ganzzahl ein: ");
        int firstNumber = myScanner.nextInt();

        System.out.println("Geben Sie die zweite Ganzzahl ein: ");
        int secondNumber = myScanner.nextInt();

        System.out.println("Geben Sie die dritte Ganzzahl ein: ");
        int thirdNumber = myScanner.nextInt();

        myScanner.close();

        int maxNum = 0;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            maxNum = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            maxNum = secondNumber;
        } else {
            maxNum = thirdNumber;
        }
        System.out.println("Das Maximum der eingegebenen Werte ist: " + maxNum);
    }
}
