package sinensia.listacompra;

public class Alimento extends Producto  {
    
    private String tipo; 
    private String fechaCaducidad; 

    // Creamos el elemento teniendo en cuenta el producto 
    public Alimento(String nombre, double precio, int cantidad, String tipo, String fechaCaducidad){
        super(nombre, precio, cantidad);
        this.tipo = tipo;
        this.fechaCaducidad = fechaCaducidad;
    }

    // Mostramos el resutlado 
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Tipo: " + tipo); 
        System.out.println("Fecha de caducidad: " + fechaCaducidad); 
    }
}
