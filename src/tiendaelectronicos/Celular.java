
package tiendaelectronicos;

public class Celular extends Computadora{

    
    //Atributos
    private int cantidadCamaras;
    private String proveedorAntena;
    private boolean admite5G;
    
    //Constructor
    public Celular(int cantidadCamaras, String proveedorAntena, boolean admite5G, double tamPantalla, String nombreProcesador, 
            int cantidadRam, int capacidadAlmacenamiento, String marca, String modelo, double precio){
        super(tamPantalla, nombreProcesador, cantidadRam, capacidadAlmacenamiento, marca, modelo, precio);
        this.cantidadCamaras = cantidadCamaras;
        this.proveedorAntena = proveedorAntena;
        this.admite5G = admite5G;
    }
    
    //Metodos
    public int getCantidadCamaras() {
        return cantidadCamaras;
    }

    public void setCantidadCamaras(int cantidadCamaras) {
        this.cantidadCamaras = cantidadCamaras;
    }

    public String getProveedorAntena() {
        return proveedorAntena;
    }

    public void setProveedorAntena(String proveedorAntena) {
        this.proveedorAntena = proveedorAntena;
    }

    public boolean isAdmite5G() {
        return admite5G;
    }

    public void setAdmite5G(boolean admite5G) {
        this.admite5G = admite5G;
    }
    
    
}
