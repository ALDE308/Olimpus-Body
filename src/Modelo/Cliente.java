
package Modelo;


public class Cliente {
    private String nombreCli;
    private String apellidoCli;
    private int cedulaCli; 
    private double telefonoCli;
    private String correoCli;
    private String sexoCli;
    private String planCli;
    private String estadoCli;
    
    public Cliente() {
    }

    public Cliente(String nombreCli, String apellidoCli, int cedulaCli, double telefonoCli, 
            String correoCli, String sexoCli, String planCli, String estadoCli) {
        this.nombreCli = nombreCli;
        this.apellidoCli = apellidoCli;
        this.cedulaCli = cedulaCli;
        this.telefonoCli = telefonoCli;
        this.correoCli = correoCli;
        this.sexoCli = sexoCli;
        this.planCli = planCli;
        this.estadoCli = estadoCli;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public int getCedulaCli() {
        return cedulaCli;
    }

    public double getTelefonoCli() {
        return telefonoCli;
    }

    public String getCorreoCli() {
        return correoCli;
    }

    public String getSexoCli() {
        return sexoCli;
    }

    public String getPlanCli() {
        return planCli;
    }

    public String getEstadoCli() {
        return estadoCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public void setCedulaCli(int cedulaCli) {
        this.cedulaCli = cedulaCli;
    }

    public void setTelefonoCli(double telefonoCli) {
        this.telefonoCli = telefonoCli;
    }

    public void setCorreoCli(String correoCli) {
        this.correoCli = correoCli;
    }

    public void setSexoCli(String sexoCli) {
        this.sexoCli = sexoCli;
    }

    public void setPlanCli(String planCli) {
        this.planCli = planCli;
    }

    public void setEstadoCli(String estadoCli) {
        this.estadoCli = estadoCli;
    }
    
    
    
}
