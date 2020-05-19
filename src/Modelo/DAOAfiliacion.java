package Modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAOAfiliacion extends Afiliacion{
    Controlador.ControladorConectarDB objConecta = new Controlador.ControladorConectarDB();

    public DAOAfiliacion() {
    } 
    
    public void insertar(){
        String sql = "INSERT INTO Plan(cedula,planC,estadoPlan) VALUES(" + super.getCedulaC() 
                    + ",'" + super.getPlanC() +"','" + super.getEstadoPlan()+ "');";
        objConecta.insertar(sql);
    }
    
    
    public String eliminar(){
        String SQL = "UPDATE Plan SET estadoAfi = '"+super.getEstadoAfi()
                +"' WHERE cedula = "+super.getCedulaC();
        String resultado = "";
        resultado = objConecta.eliminar(SQL);
        return resultado;
    }
    
    public String modificar(){
        String estado = "Activo";
        String SQL = "UPDATE Plan SET planC = '" + super.getPlanC() + "', estadoPlan = '"
                     + super.getEstadoPlan() + "' WHERE cedula = " + super.getCedulaC()
                     +"AND estadoAfi = '"+estado+"';";
        String resultado = ""; 
        resultado = objConecta.modifica(SQL);
        return resultado;
    }
    
    public String consultaAfiliacion(){
        String estado ="Activo";
        String SQL = "SELECT * FROM Plan WHERE cedula = " +super.getCedulaC() + "AND estadoAfi = '" + estado+"';";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        
        try{
            
            if(rs.next()){
                String planC = rs.getString(2);
                String fechaAfi = rs.getString(3);
                String estadoPlan = rs.getString(4);
                
                return ("PLAN: " + planC + "\n" + "\n" +  "FECHA: " +fechaAfi + "\n" + "\n"
                       +"ESTADO: " +estadoPlan);
            }else{
                JOptionPane.showMessageDialog(null, "Error el ciente no esta registrado");
                return "No esta";
            }
        }catch(SQLException ex){
         ex.getMessage();
            System.out.println("Error exception Clase DAOAfiliacion");
        }
        return null;
    }
    
    public String consultarExistencia(String estado){
        String SQL = "SELECT * FROM Plan WHERE cedula = " + super.getCedulaC()+" AND estadoAfi = '"+estado+"';";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
            if(rs.next()){
                return "";
            }else{
                return "No esta";
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error en el metodo consultarExistencia clase DAOCliente");
        }
        return null;
    }
}
