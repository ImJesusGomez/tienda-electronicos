
package tiendaelectronicos;

public class Computadora extends Producto{

    
    //Atributos
    private double tamPantalla;
    private String nombreProcesador;
    private int cantidadRam;
    private int capacidadAlmacenamiento;
    
    //Contructor
    public Computadora(double tamPantalla, String nombreProcesador, int cantidadRam, int capacidadAlmacenamiento, String marca, String modelo, double precio){
        super(marca, modelo, precio);
        this.tamPantalla = tamPantalla;
        this.nombreProcesador = nombreProcesador;
        this.cantidadRam = cantidadRam;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
    
    //Metodos
    public double getTamPantalla() {
        return tamPantalla;
    }
    
    public void setTamPantalla(double tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    public String getNombreProcesador() {
        return nombreProcesador;
    }

    public void setNombreProcesador(String nombreProcesador) {
        this.nombreProcesador = nombreProcesador;
    }

    public int getCantidadRam() {
        return cantidadRam;
    }

    public void setCantidadRam(int cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
    
}
