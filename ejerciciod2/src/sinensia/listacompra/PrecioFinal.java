package sinensia.listacompra;

public final class PrecioFinal {

    //Creamos esta clase para sobreescribir el precio y añadirle el IVA

    private static final double IVA = 0.16; // el IVA sera del 16%

    // Instanciamos la clase 
    private PrecioFinal(){

    }

    public static double calcularPrecioFinal(double precioSinIVA) {
        return precioSinIVA * (1+ IVA); 
    }
}
