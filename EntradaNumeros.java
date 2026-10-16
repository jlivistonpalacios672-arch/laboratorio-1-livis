import java.util.Scanner;

public class EntradaNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Escribe un precio: ");
        double precio = scanner.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Precio: $" + precio);

        scanner.close();
    }
}

