
package Modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAOProveedor extends Proveedor{
    Controlador.ControladorConectarDB conexionProv;
    DefaultTableModel modeloTabla;
    
    public DAOProveedor(){
    conexionProv = new Controlador.ControladorConectarDB();
    }
    
    public void insertar(){
      String sql = "INSERT INTO proveedor (nombreProv, nitProv, telefonoProv, direccionProv, precioProdprov, ProductoProv,estadoProv) VALUES('"
                   + super.getNombreProv() +"', "+ super.getNitProv() +", "+ super.getTelefonoProv() +", '"
                   + super.getDireccionProv() +"', "+ super.getPrecioProdProv() +", '"+ super.getProductoProv()+"','" + super.getEstadoProv()+"')";
      conexionProv.insertar(sql);

    }
    
    public String consultarProveedor(){
      String SQL = "SELECT * FROM proveedor WHERE nitprov = " + super.getNitProv() +" AND estadoProv = '" + super.getEstadoProv()+"';";
      java.sql.ResultSet rs = null;
      rs = conexionProv.consulta(SQL);
      
      try{
          if(rs.next()){
              String nombreprov = rs.getString(1);
              String telprov = rs.getString(3);
              String dirprov = rs.getString(4);
              String nombreproducprov = rs.getString(6);
              String precioproducrov = rs.getString(5);
              
              return ("NOMBRE: " + nombreprov + "\n" + "TELEFONO: " + telprov + "\n" + "DIRECCION: " + dirprov + "\n" + "NOMBRE PRODUCTO: " + nombreproducprov + "\n" + "PRECIO DEL PRODUCTO: " + precioproducrov);
          }else{
              JOptionPane.showMessageDialog(null, "El Proveedor no esta registrado");
              return " ";
          }
      }catch(SQLException ex){
              System.out.println("Error");
      }
      return null;
    }
    
    public String eliminar(){
        String SQL = "UPDATE proveedor SET estadoProv = '" + super.getEstadoProv()
                +"'  WHERE nitprov = "+ super.getNitProv();
        String resultado = "";
        resultado = conexionProv.eliminar(SQL);
        return resultado;
    }
    
    public String modificar(){
        String SQL = "UPDATE  proveedor SET nombreprov = '"+super.getNombreProv()+ "', telefonoprov = "
                +super.getTelefonoProv()+", direccionprov = '"+ super.getDireccionProv()+"', precioprodprov = "
                +super.getPrecioProdProv()+", productoprov = '"+ super.getProductoProv()
                +"' WHERE nitprov = " + super.getNitProv()+" AND estadoProv = '" + super.getEstadoProv()+"';";
        String resultado = "";
        resultado = conexionProv.modifica(SQL);
        return resultado;
    }
    
    public String consultarExitencia (String estado){
        String SQL = "SELECT * FROM proveedor WHERE nitprov = " + super.getNitProv()+" AND estadoProv = '"+estado+"';";
        java.sql.ResultSet rs = null;
        rs = conexionProv.consulta(SQL);
        try{
        
            if(rs.next()){  
                return ("");
            }else {
                return ("El proveedor no esta registrado");
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public void listarProve(String valor, String filtro, JTable tabla,String estado) {
        String[] columnas = {"nombre", "nit", "telefono", "direccion", "Producto", "Producto"};
        String[] registros = new String[6];
        modeloTabla = new DefaultTableModel(null, columnas);
        String SQL;
        
        if (filtro.equals("Nombre")) {
            SQL = "SELECT *"
                    + "FROM proveedor WHERE nombreprov LIKE '%" + valor + "%'"+" AND estadoProv = '"+estado+"';";
        } else if (filtro.equals("Precio")) {
            SQL = "SELECT * FROM proveedor WHERE precioprodprov = " + super.getPrecioProdProv()+" AND estadoProv = '"+estado+"';";
        } else {
            SQL = "SELECT *"
                    + "FROM proveedor WHERE productoprov LIKE '%" + valor + "%'"+" AND estadoProv = '"+estado+"';";
        }
        try {
            java.sql.ResultSet rs = null;
            rs = conexionProv.consulta(SQL);
            System.out.print(rs);
            
            while (rs.next()) {
            registros[0] = rs.getString("nombreprov");
            registros[1] = rs.getString("nitprov");
            registros[2] = rs.getString("telefonoprov");
            registros[3] = rs.getString("direccionprov");
            registros[4] = rs.getString("precioprodprov");
            registros[5] = rs.getString("productoprov");
            modeloTabla.addRow(registros);
            }
            
            tabla.setModel(modeloTabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al cargar datos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
}
