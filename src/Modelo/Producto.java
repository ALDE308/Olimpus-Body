
package Modelo;

public class Producto {
    private String nombrePro;
    private int codigoPro; 
    private int precioPro;
    private String descripcionPro;
    private int cantidadPro;
    private int nitproveedor;
    private String estadoProd;
    
    public Producto(){
   }

    public Producto(String nombrePro, int codigoPro, int precioPro, String descripcionPro, int cantidadPro, int nitproveedor, String estadoProd) {
        this.nombrePro = nombrePro;
        this.codigoPro = codigoPro;
        this.precioPro = precioPro;
        this.descripcionPro = descripcionPro;
        this.cantidadPro = cantidadPro;
        this.nitproveedor = nitproveedor;
        this.estadoProd = estadoProd;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public int getCodigoPro() {
        return codigoPro;
    }

    public int getPrecioPro() {
        return precioPro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public int getCantidadPro() {
        return cantidadPro;
    }

    public int getNitproveedor() {
        return nitproveedor;
    }

    public String getEstadoProd() {
        return estadoProd;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public void setCodigoPro(int codigoPro) {
        this.codigoPro = codigoPro;
    }

    public void setPrecioPro(int precioPro) {
        this.precioPro = precioPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public void setCantidadPro(int cantidadPro) {
        this.cantidadPro = cantidadPro;
    }

    public void setNitproveedor(int nitproveedor) {
        this.nitproveedor = nitproveedor;
    }

    public void setEstadoProd(String estadoProd) {
        this.estadoProd = estadoProd;
    }
    
    
}
