package Modelo;

public class Cotizacion {
    //Variables para la tabla cotizzacion
    private int codigoCotizacion;
    private int cedulaClien;
    private int cedulaEmple;
    private String fecha;
    private double totalC;
    //Variables para la tabla DetalleCotizacion
    private int idDetalle;
    private int idCotizacion;
    private int codigoProduc;
    private int cantida;
    private double iva;
    private double valorUnitario;
    private double totalD;

    public Cotizacion() {
    }

    public Cotizacion(int codigoCotizacion, int cedulaClien, int cedulaEmple, String fecha, double totalC, int idDetalle, int idCotizacion, int codigoProduc, int cantida, double iva, double valorUnitario, double totalD) {
        this.codigoCotizacion = codigoCotizacion;
        this.cedulaClien = cedulaClien;
        this.cedulaEmple = cedulaEmple;
        this.fecha = fecha;
        this.totalC = totalC;
        this.idDetalle = idDetalle;
        this.idCotizacion = idCotizacion;
        this.codigoProduc = codigoProduc;
        this.cantida = cantida;
        this.iva = iva;
        this.valorUnitario = valorUnitario;
        this.totalD = totalD;
    }

    public int getCodigoCotizacion() {
        return codigoCotizacion;
    }

    public void setCodigoCotizacion(int codigoCotizacion) {
        this.codigoCotizacion = codigoCotizacion;
    }

    public int getCedulaClien() {
        return cedulaClien;
    }

    public void setCedulaClien(int cedulaClien) {
        this.cedulaClien = cedulaClien;
    }

    public int getCedulaEmple() {
        return cedulaEmple;
    }

    public void setCedulaEmple(int cedulaEmple) {
        this.cedulaEmple = cedulaEmple;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotalC() {
        return totalC;
    }

    public void setTotalC(double totalC) {
        this.totalC = totalC;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public int getCodigoProduc() {
        return codigoProduc;
    }

    public void setCodigoProduc(int codigoProduc) {
        this.codigoProduc = codigoProduc;
    }

    public int getCantida() {
        return cantida;
    }

    public void setCantida(int cantida) {
        this.cantida = cantida;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getTotalD() {
        return totalD;
    }

    public void setTotalD(double totalD) {
        this.totalD = totalD;
    }
    
    
}
