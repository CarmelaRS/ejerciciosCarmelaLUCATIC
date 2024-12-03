package sinensia.listacompra;
import java.util.ArrayList;
public class mainlistacompra {
        // Cremos una clase principal para la lista de la compra con los métodos
    // necesarios

    public static void main(String[] args) {
        
        // Creamos una lista con los productos
        ArrayList<Alimento> listaMercadona = new Arraylist<>();

        // Añadimos alimentos a la lista
        listaMercadona.add(new Alimento("Manzanas", 0.5, 6, "Fresco", "2024-12-15"));
        listaMercadona.add(new Alimento("Carne", 4.57, 1, "Fresco", "2024-12-09"));
        listaMercadona.add(new Alimento("Lubina", 4.57, 1, "Congelado", "2025-12-29"));

        // Variable para sumar el precio total
        double PrecioIVA = 0;

        System.out.println("Lista de la compra:");
        for (Producto producto : listaMercadona) {
            producto.mostrarDetalles();
            // Guardamos el valor del precio del producto SIN IVA en una variable
            double precioSinIVA = producto.calcularPrecio();
            double precioConIVA = PrecioFinal.calcularPrecioFinal(precioSinIVA); // Calculamos el precio con IVA

            // Mostramos el precio con IVA
            System.out.println("Precio con IVA: " + precioConIVA);
            System.out.println("-------------------------");

            // Sumatorio de todos los precios para mostrar el precio final.
            PrecioIVA += precioConIVA;

        }

        System.out.println("Total (con IVA): $" + PrecioIVA);

    }
}

