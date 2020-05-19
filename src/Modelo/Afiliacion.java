package Modelo;

public class Afiliacion {
    private int cedulaC;
    private String planC;
    private String fecha;
    private String estadoPlan;
    private String  estadoAfi;

    public Afiliacion() {
    }

    public Afiliacion(int cedulaC, String planC, String fecha, String estadoPlan, String estadoAfi) {
        this.cedulaC = cedulaC;
        this.planC = planC;
        this.fecha = fecha;
        this.estadoPlan = estadoPlan;
        this.estadoAfi = estadoAfi;
    }

    public int getCedulaC() {
        return cedulaC;
    }

    public void setCedulaC(int cedulaC) {
        this.cedulaC = cedulaC;
    }

    public String getPlanC() {
        return planC;
    }

    public void setPlanC(String planC) {
        this.planC = planC;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstadoPlan() {
        return estadoPlan;
    }

    public void setEstadoPlan(String estadoPlan) {
        this.estadoPlan = estadoPlan;
    }

    public String getEstadoAfi() {
        return estadoAfi;
    }

    public void setEstadoAfi(String estadoAfi) {
        this.estadoAfi = estadoAfi;
    }

    
    
    
}
