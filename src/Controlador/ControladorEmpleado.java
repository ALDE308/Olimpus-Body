
package Controlador;

import javax.swing.JOptionPane;


public class ControladorEmpleado {
    public ControladorEmpleado() {
    }
    
    public String buscarEmple (int busqueda,String estado){
       Modelo.DAOEmpleado objetoEmpleado = new Modelo.DAOEmpleado();
       objetoEmpleado.setCedulaEmpleado(busqueda);
       objetoEmpleado.setEstadoEmpl(estado);
       
       String resultado = "";
       resultado = objetoEmpleado.consultarEmpleado();
      
        if(resultado.equals("No se encontró")){
            JOptionPane.showMessageDialog(null, "El EMPLEADO NO ESTA REGISTRADO");
        }
        return resultado;
    }
    public void eliminarEmple (int documentoEmple, String estado){
        Modelo.DAOEmpleado objeto =new Modelo.DAOEmpleado();
        objeto.setCedulaEmpleado(documentoEmple);
        objeto.setEstadoEmpl(estado);
        String resultado = "";
        resultado = objeto.eliminar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "eliminacion fallida", "No se logro eliminar",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "CORRECTO","Se Elimino correctamente",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void guardarEmpleado (String Usuario, String contrasena, String nombre, String apellido, 
        int cedula, double telefono, String direccion, double sueldo,String cargo,String estado){
        Modelo.DAOEmpleado  objEmpleado;
        objEmpleado = new Modelo.DAOEmpleado();
        
       //cargar la informacion en el objeto
       objEmpleado.setUsuarioEmpleado(Usuario);
       objEmpleado.setContrasenaEmpleado(contrasena);
       objEmpleado.setNombreEmpleado(nombre);
       objEmpleado.setApellidoEmpleado(apellido);
       objEmpleado.setCedulaEmpleado(cedula);
       objEmpleado.setTelefonoEmpleado(telefono);
       objEmpleado.setDireccionEmpleado(direccion);
       objEmpleado.setSueldo(sueldo);
       objEmpleado.setCargo(cargo);
       objEmpleado.setEstadoEmpl(estado);
       //objEmpleado.setCodigoProductoE(codigoproduc);
  
       objEmpleado.insertar();
       JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");
    }
    
    public void editarEmpleado(int cedula, String nombre, String apellido, double telefono, String direccion,int sueldo){
        Modelo.DAOEmpleado objEmpleado = new Modelo.DAOEmpleado();
        objEmpleado.setCedulaEmpleado(cedula);
        objEmpleado.setNombreEmpleado(nombre);
        objEmpleado.setApellidoEmpleado(apellido);
        objEmpleado.setTelefonoEmpleado(telefono);
        objEmpleado.setDireccionEmpleado(direccion);
        objEmpleado.setSueldo(sueldo);
    
        objEmpleado.modificar();
        JOptionPane.showMessageDialog(null,"SE MODIFICO CON EXITO");
    }
    public String verificarExitencia (int datoBuscar){
       Modelo.DAOEmpleado objetoEmpleado = new Modelo.DAOEmpleado();
       objetoEmpleado.setCedulaEmpleado(datoBuscar);
       String estado = "Activo";
       String resultado = "";
       resultado = objetoEmpleado.consultarExitencia(estado);
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "EL EMPLEADO YA EXISTE");
        }
        return resultado;
    }
}
