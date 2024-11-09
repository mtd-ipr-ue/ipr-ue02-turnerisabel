import java.util.Scanner;

public class ue02_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Geben Sie eine Jahreszahl ein: ");
        int year = myScanner.nextInt();

        System.out.println("Geben Sie ein Monat zwischen 1-12 ein: ");
        int month = myScanner.nextInt();

        myScanner.close();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: 
                System.out.println("Das Monat hat 31 Tage.");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
              System.out.println("Das Monat hat 30 Tage");
            break;
            case 2: 
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Das eingegebene Jahr ist ein Schaltjahr und hat 29 Tage.");
            }else {
                System.out.println("Das eingegbene Jahr ist kein Schaltjahr und hat 28 Tage.");
            }
            default: 
            if (month < 1 || month > 12) {
                System.out.println("Der eingegebene Wert liegt nicht zwischen 1 und 12!");
            }
           break;     
        }
    }
}
