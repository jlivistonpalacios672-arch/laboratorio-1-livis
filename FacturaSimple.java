public class FacturaSimple {
    public static void main(String[] args) {

        String nombreProducto = "Mouse inalámbrico";
        double precioUnitario = 100000.0;
        int cantidad = 2;
        double porcentajeDescuento = 0.10;

        double subtotal = precioUnitario * cantidad;
        double valorDescuento = subtotal * porcentajeDescuento;
        double total = subtotal - valorDescuento;

        System.out.println("Producto: " + nombreProducto);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Total: $" + total);
    }
}
