import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Escribe tu ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Cantidad de cursos terminados: ");
        int cursosTerminados = scanner.nextInt();

        System.out.println();
        System.out.println("===== FICHA DE USUARIO =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Edad: " + edad);
        System.out.println("Cursos terminados: " + cursosTerminados);

        scanner.close();
    }
}

    
