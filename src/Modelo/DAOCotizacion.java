package Modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAOCotizacion extends Producto{
    Controlador.ControladorConectarDB objetoConecta;
    
    public DAOCotizacion(){
        objetoConecta = new Controlador.ControladorConectarDB();
    }
    
    public String consultarNombreProducto(){
        String SQL = "SELECT * FROM Producto WHERE codigoPro = " + super.getCodigoPro();
        java.sql.ResultSet rs = null;
        rs = objetoConecta.consulta(SQL);
        try{
            if(rs.next()){
                String nombreProduc = rs.getString(1);
                return (nombreProduc);
            }else{
                JOptionPane.showMessageDialog(null,"No se encuentra el producto");
                return "";
            }
        }catch(SQLException ex){
            System.out.println("Error DAOCoticazion");
        }
        return null;
    }
    
    public String consultarPrecio(){
        String SQL = "SELECT * FROM Producto WHERE codigoPro = " + super.getCodigoPro();
        java.sql.ResultSet rs = null;
        rs = objetoConecta.consulta(SQL);
        
        try{
            if(rs.next()){
                String precioProduc = rs.getString(3);
                return (precioProduc);
            }
        }catch(SQLException ex){
            System.out.println("Error DAOCoticazion");
        }
        return null;
    }
    
    public String consultarCodigo(){
        String SQL = "SELECT * FROM Producto WHERE codigoPro = " + super.getCodigoPro();
        java.sql.ResultSet rs = null;
        rs = objetoConecta.consulta(SQL);
        
        try{
            if(rs.next()){
                String codigo = rs.getString(2);
                return (codigo);
            }
        }catch(SQLException ex){
            System.out.println("Error DAOCoticazion");
        }
        return null;
    }
}
