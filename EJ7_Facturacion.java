public class EJ7_Facturacion {
     
    public static class Factura { 
        double precioUnitario; 
        int    cantidad; 
        double impuesto;  

        double calcularSubtotal() { 
            double subtotal = precioUnitario * cantidad; 
            return subtotal; 
        } 
     
        double calcularValorImpuesto() { 
            double subtotal = calcularSubtotal(); 
            double valorImpuesto = subtotal * (impuesto / 100); 
            return valorImpuesto; 
        } 
     
        double calcularTotal() { 
            double subtotal = calcularSubtotal(); 
            double valorImpuesto = calcularValorImpuesto(); 
            double total = subtotal + valorImpuesto; 
            return total; 
        } 
     
        void mostrarDetalle() { 
            double subtotal = calcularSubtotal(); 
            double valorImpuesto = calcularValorImpuesto(); 
            double total = calcularTotal(); 
            System.out.println("=== Factura de Compra ==="); 
            System.out.println("Precio unitario : " + precioUnitario); 
            System.out.println("Cantidad : " + cantidad); 
            System.out.println("Subtotal  $: " + subtotal); 
            System.out.println("Impuesto (" + impuesto + "%) : " + valorImpuesto); 
            System.out.println("TOTAL A PAGAR  $: " + total); 
        } 
    }

    public static class Facturacion4 { 
        public static void main(String[] args) { 
            Factura factura = new Factura();
            factura.precioUnitario = 50000; 
            factura.cantidad = 3; 
            factura.impuesto = 19; 
            factura.mostrarDetalle(); 
        } 
    } 
}
