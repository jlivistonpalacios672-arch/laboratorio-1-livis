import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Horas trabajadas: ");
        int horas = scanner.nextInt();

        System.out.print("Valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        double pagoTotal = horas * valorPorHora;

        System.out.println("-------------------------");
        System.out.println("RESUMEN DE PAGO");
        System.out.println("-------------------------");
        System.out.println("Trabajador: " + nombre);
        System.out.println("Horas: " + horas);
        System.out.println("Valor por hora: $" + valorPorHora);
        System.out.println("Pago total: $" + pagoTotal);

        scanner.close();
    }
}
