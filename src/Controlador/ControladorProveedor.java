
package Controlador;

import java.sql.SQLException;
import Vista.EditarProveedor;
import javax.swing.JOptionPane;

public class ControladorProveedor {
    public ControladorProveedor(){       
    }
    
    public String buscarProv (int busqueda, String estado){
       Modelo.DAOProveedor objetoProveedor = new Modelo.DAOProveedor();
       objetoProveedor.setNitProv(busqueda);
       objetoProveedor.setEstadoProv(estado);
       String resultado = "";
       resultado = objetoProveedor.consultarProveedor();
      
        if(resultado.equals("No se encontró")){
            JOptionPane.showMessageDialog(null, "No esta");
      
        }
        return resultado;
    }
    public void eliminarProv (int nitPro,String estado){
        Modelo.DAOProveedor objetoProv =new Modelo.DAOProveedor();
        objetoProv.setNitProv(nitPro);
        objetoProv.setEstadoProv(estado);
        String resultado = "";
        resultado = objetoProv.eliminar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "No se elimino el proveedor", "PROBLEMA",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Se Elimino correctamente","Estado de la eliminacion",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void editProveedor(int nitPro) {
        Modelo.DAOProveedor objetoProveedor = new Modelo.DAOProveedor();
        objetoProveedor.setNitProv(nitPro);
      
       String resultado = "";
       resultado = objetoProveedor.consultarProveedor();

        if(resultado.equals("No esta")){
            JOptionPane.showMessageDialog(null, "El proveedor no esta registrado");
           
        }else{
            
            EditarProveedor editar = new EditarProveedor();
            
            editar.setVisible(true);

        }
    }
    
    public String verificarExitencia (int datoBuscar, String estado){
       Modelo.DAOProveedor objetoProveedor = new Modelo.DAOProveedor();
       objetoProveedor.setNitProv(datoBuscar);
    
       String resultado = "";
       resultado = objetoProveedor.consultarExitencia(estado);
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "EL PROVEEDOR YA EXISTE");
        }
        return resultado;
    }
    
    public void guardarProveedor (String nombre, int nit, int telefon, String direccion, 
        int precio, String nombreproducto,String estado){
        Modelo.DAOProveedor  objProveedor;
        objProveedor = new Modelo.DAOProveedor();
        
        String resultado = verificarExitencia(nit,estado);
        
        if(resultado.equals("")){
            
        }else{
            
            objProveedor.setNombreProv(nombre);
            objProveedor.setNitProv(nit);
            objProveedor.setTelefonoProv(telefon);
            objProveedor.setDireccionProv(direccion);
            objProveedor.setProductoProv(nombreproducto);
            objProveedor.setPrecioProdProv(precio);
            objProveedor.setEstadoProv(estado);
            objProveedor.insertar();
        }     
    }
}
