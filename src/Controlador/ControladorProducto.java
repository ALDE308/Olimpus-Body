package controlador;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import Vista.EditarProducto;
import java.sql.SQLException;


public class ControladorProducto {
    public ControladorProducto(){       
    }
    
    public String buscarPro (int busqueda, String estado){
       
       Modelo.DAOProducto objetoProducto = new Modelo.DAOProducto();
       objetoProducto.setCodigoPro(busqueda);
       objetoProducto.setEstadoProd(estado);
       String resultado = "";
       resultado = objetoProducto.consultarProducto();
      
        if(resultado.equals("No se encontró")){
         
        }
        return resultado;
    }
    
    public void guardarProducto(String nombre, int codigo, double precio, String descripcion, 
                                int cantidad, int proveedor, String estado ){
        
        Modelo.DAOProducto objProducto = new Modelo.DAOProducto();
        Modelo.DAOProveedor objproveedor = new Modelo.DAOProveedor();
        
        String resultado = verificarExitencia(codigo);
        String resultado1 = verificarExitenciaProveedor(proveedor,estado);
        
        if(resultado.equals("")){
            System.out.print("aqui");
        }else {
            objProducto.setNombrePro(nombre);
            objProducto.setCodigoPro(codigo);
            objProducto.setPrecioPro(codigo);
            objProducto.setDescripcionPro(descripcion);
            objProducto.setCantidadPro(cantidad);
            objProducto.setEstadoProd(estado);
            objProducto.setProveedorPro(proveedor);
            objProducto.insertar();
            
            JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");
        }
    }
           
    public void eliminarPro (int codePro,String estado){
        Modelo.DAOProducto objetoPro =new Modelo.DAOProducto();
        objetoPro.setCodigoPro(codePro);
        objetoPro.setEstadoProd(estado);
        String resultado = "";
        resultado = objetoPro.eliminar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "No", "se Elimino",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "CORRECTO","Se Elimino correctamente",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    public void editProducto(int codePro) {
        Modelo.DAOProducto objetoProducto = new Modelo.DAOProducto();
        objetoProducto.setCodigoPro(codePro);
      
       String resultado = "";
       resultado = objetoProducto.consultarProducto();

        if(resultado.equals("No esta")){
            JOptionPane.showMessageDialog(null, "El producto no esta registrado");
           
        }else{
            
            EditarProducto editar = new EditarProducto();
            
            editar.setVisible(true);

        }
    }
    
    public String verificarExitencia (int datoBuscar){
       Modelo.DAOProducto objetoProducto = new Modelo.DAOProducto();
       objetoProducto.setCodigoPro(datoBuscar);
    
       String resultado = "";
       resultado = objetoProducto.consultarExitencia();
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "EL PRODUCTO YA EXISTE");
        }
        return resultado;
    }
    
    public String verificarExitenciaProveedor (int datoBuscar, String estado){
       Modelo.DAOProveedor objetoProveedor = new Modelo.DAOProveedor();
       objetoProveedor.setNitProv(datoBuscar);
    
       String resultado = "";
       resultado = objetoProveedor.consultarExitencia(estado);
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "");
        }
        return resultado;
    }
      
}

