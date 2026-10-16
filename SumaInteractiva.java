import java.util.Scanner;

public class SumaInteractiva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Escribe el segundo número: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int residuo = numero1 % numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);

        scanner.close();
    }
}
    

