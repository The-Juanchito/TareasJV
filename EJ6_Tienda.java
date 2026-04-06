 public class EJ6_Tienda {    

 public class Factura {
        double precio;
        int cantidad;

        public Factura(double precio, int cantidad) {
            this.precio = precio;
            this.cantidad = cantidad;
    }                                   
        public void calcularTotal() {
        double total = precio * cantidad;
        System.out.println("El total de la factura a pagar es: $" + total);
    }
}
 public static void main(String[] args) {
        EJ6_Tienda tienda = new EJ6_Tienda();
        Factura factura = tienda.new Factura(10.0, 5);
        factura.calcularTotal();

}
    }
