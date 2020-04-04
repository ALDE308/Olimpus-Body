
package Modelo;

public class Empleado {
    private String usuarioEmpleado;
    private String contrasenaEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private int cedulaEmpleado;
    private double telefonoEmpleado;
    private String direccionEmpleado;
    private double sueldo;
    private String cargo;
    private int codigoProductoE;
    private String estadoEmpl;
    
    public Empleado() {
    }

    public Empleado(String usuarioEmpleado, String contrasenaEmpleado, String nombreEmpleado, String apellidoEmpleado, int cedulaEmpleado, double telefonoEmpleado, String direccionEmpleado, double sueldo, String cargo, int codigoProductoE, String estadoEmpl) {
        this.usuarioEmpleado = usuarioEmpleado;
        this.contrasenaEmpleado = contrasenaEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.codigoProductoE = codigoProductoE;
        this.estadoEmpl = estadoEmpl;
    }

    public String getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public String getContrasenaEmpleado() {
        return contrasenaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public double getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public int getCodigoProductoE() {
        return codigoProductoE;
    }

    public String getEstadoEmpl() {
        return estadoEmpl;
    }

    public void setUsuarioEmpleado(String usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public void setContrasenaEmpleado(String contrasenaEmpleado) {
        this.contrasenaEmpleado = contrasenaEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public void setTelefonoEmpleado(double telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCodigoProductoE(int codigoProductoE) {
        this.codigoProductoE = codigoProductoE;
    }

    public void setEstadoEmpl(String estadoEmpl) {
        this.estadoEmpl = estadoEmpl;
    }
    
    
}
