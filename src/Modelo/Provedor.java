
package Modelo;


public class Provedor {
    private String nombreProv;
    private int nitProv; 
    private int telefonoProv;
    private String direccionProv;
    private int precioProdProv;
    private String productoProv;
    private String estadoProv;
    
    public Provedor(){
   }

    public Provedor(String nombreProv, int nitProv, int telefonoProv, String direccionProv, int precioProdProv, String productoProv, String estadoProv) {
        this.nombreProv = nombreProv;
        this.nitProv = nitProv;
        this.telefonoProv = telefonoProv;
        this.direccionProv = direccionProv;
        this.precioProdProv = precioProdProv;
        this.productoProv = productoProv;
        this.estadoProv = estadoProv;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public int getNitProv() {
        return nitProv;
    }

    public int getTelefonoProv() {
        return telefonoProv;
    }

    public String getDireccionProv() {
        return direccionProv;
    }

    public int getPrecioProdProv() {
        return precioProdProv;
    }

    public String getProductoProv() {
        return productoProv;
    }

    public String getEstadoProv() {
        return estadoProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public void setNitProv(int nitProv) {
        this.nitProv = nitProv;
    }

    public void setTelefonoProv(int telefonoProv) {
        this.telefonoProv = telefonoProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }

    public void setPrecioProdProv(int precioProdProv) {
        this.precioProdProv = precioProdProv;
    }

    public void setProductoProv(String productoProv) {
        this.productoProv = productoProv;
    }

    public void setEstadoProv(String estadoProv) {
        this.estadoProv = estadoProv;
    }
   
    
    
}
