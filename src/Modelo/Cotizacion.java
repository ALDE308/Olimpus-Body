
package Modelo;

public class Cotizacion {
    private int codigocotizacion;
    private int cedulaClien;
    private int cedulaEmple;
    private String fecha;
    private int codigoProducto;
    private double total;
    
    public Cotizacion() {
    }

    public Cotizacion(int codigocotizacion, int cedulaClien, int cedulaEmple, String fecha, int codigoProducto, double total) {
        this.codigocotizacion = codigocotizacion;
        this.cedulaClien = cedulaClien;
        this.cedulaEmple = cedulaEmple;
        this.fecha = fecha;
        this.codigoProducto = codigoProducto;
        this.total = total;
    }

    public int getCodigocotizacion() {
        return codigocotizacion;
    }

    public int getCedulaClien() {
        return cedulaClien;
    }

    public int getCedulaEmple() {
        return cedulaEmple;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public double getTotal() {
        return total;
    }

    public void setCodigocotizacion(int codigocotizacion) {
        this.codigocotizacion = codigocotizacion;
    }

    public void setCedulaClien(int cedulaClien) {
        this.cedulaClien = cedulaClien;
    }

    public void setCedulaEmple(int cedulaEmple) {
        this.cedulaEmple = cedulaEmple;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
