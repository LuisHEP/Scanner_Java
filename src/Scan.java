import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita o número da tabuada: ");
        int x = scanner.nextInt();

        System.out.println("\nUtilizando for: ");
        for(int y = 1; y <= 10; y++) {
            System.out.println(x + " x " + y + " = " + (x * y));
        }

        System.out.println("\nUtilizando while: ");
        int y = 1;
        while(y <= 10) {
            System.out.println(x + " x " + y + " = " + (x * y));
            y++;
        }
    }
}
