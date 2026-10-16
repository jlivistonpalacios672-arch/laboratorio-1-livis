import java.util.Scanner;

public class CotizadorCompra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Porcentaje de descuento: ");
        int porcentajeDescuento = scanner.nextInt();

        System.out.print("Porcentaje de impuesto: ");
        int porcentajeImpuesto = scanner.nextInt();

        double subtotal = precioUnitario * cantidad;

        double valorDescuento = subtotal * porcentajeDescuento / 100;

        double baseDespuesDescuento = subtotal - valorDescuento;

        double valorImpuesto = baseDespuesDescuento * porcentajeImpuesto / 100;

        double totalFinal = baseDespuesDescuento + valorImpuesto;

        System.out.println();
        System.out.println("========== COTIZACIÓN ==========");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Base después del descuento: $" + baseDespuesDescuento);
        System.out.println("Impuesto: $" + valorImpuesto);
        System.out.println("Total final: $" + totalFinal);

        scanner.close();
    }
}