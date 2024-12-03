package sinensia.listacompra;

public class Producto {

    protected String nombre;
    protected double precio;
    protected int cantidad; 
    
    // Damos valor a cada una de las variables
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Calculamos el precio total 
    public double calcularPrecio() {
        return precio * cantidad;
    }

    // Mostramos los detalles del producto
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre); 
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + calcularPrecio());
    }


}
