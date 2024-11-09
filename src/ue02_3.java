import java.util.Scanner;

import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Geben Sie die x-Koordinate ein: ");
        double x = myScanner.nextDouble();

        System.out.println("Geben Sie die y-Koordinate ein: ");
        double y = myScanner.nextDouble();

        myScanner.close();

        if ((x > 0 && y > 0 && x <=4 && y <=4) && x+y > 4) {
            System.out.println("Liegt im grünen Bereich");
        }else{
            System.out.println("Liegt außerhalb des grünen Bereichs");
        }
    }
}
