
package Modelo;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DAOEmpleado extends Empleado{
    Controlador.ControladorConectarDB objConecta;
    DefaultTableModel modeloTabla;
    
    public DAOEmpleado() {
        objConecta = new Controlador.ControladorConectarDB();
    }
    public void insertar(){
        String sql = "INSERT INTO Empleado(usuarioEmpleado,contrasenaEmpleado,nombreEmpleado,apellidoEmpleado,"
                + "cedulaEmpleado,telefonoEmpleado,direccionEmpleado,sueldo,cargo,estadoempl) VALUES('"
                + super.getUsuarioEmpleado() +"', '"+ super.getContrasenaEmpleado() + "', '"+super.getNombreEmpleado()
                +"','"+super.getApellidoEmpleado()+"',"+super.getCedulaEmpleado()+","+super.getTelefonoEmpleado()
                +",'"+super.getDireccionEmpleado()+"',"+super.getSueldo()+",'"
                +super.getCargo() +"','"+ super.getEstadoEmpl()+"')";
        objConecta.insertar(sql);
    }
    
    public String consultarEmpleado(){
        String SQL = "SELECT * FROM Empleado WHERE cedulaEmpleado = " + super.getCedulaEmpleado()+ " AND estadoEmpl = '" + super.getEstadoEmpl()+"';";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        
        try{
            
            if(rs.next()){
                String usuarioEmple = rs.getString(1);
                String nombreEmple = rs.getString(3);
                String apellidoEmple = rs.getString(4);
                String cedulaEmple = rs.getString(5);
                String telefonoEmple = rs.getString(6);
                String direccionEmple = rs.getString(7);
                String sueldoEmple = rs.getString(8);
                String cargoEmple = rs.getString(9);
                
                return ("USUARIO:    "+ usuarioEmple +"\n "+"NOMBRE:     "+ nombreEmple +"\n "+ "APELLIDO:   "+ apellidoEmple +
                        " \n"+"CEDULA:        "+cedulaEmple +" \n"+ "TELEFONO:   "+ telefonoEmple+" \n"+"DIRECCION:  "+direccionEmple+
                        " \n"+"SUELDO:      "+sueldoEmple+" \n"+ "CARGO:        "+cargoEmple );
            }else{
                JOptionPane.showMessageDialog(null, "El Empleado no esta registrado");
                return "";
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public String eliminar(){
        String SQL = "UPDATE Empleado SET estadoEmpl = '" + super.getEstadoEmpl()
                +"'  WHERE cedulaEmpleado = "+ super.getCedulaEmpleado();
        String resultado = "";
        resultado = objConecta.eliminar(SQL);
        return resultado;
    }
    
    public String modificar(){
        String SQL = "UPDATE  Empleado SET nombreEmpleado = '"+super.getNombreEmpleado()+ "', apellidoEmpleado = '"
                +super.getApellidoEmpleado()+"', telefonoEmpleado = "+ super.getTelefonoEmpleado()+", direccionEmpleado = '"
                +super.getDireccionEmpleado()+"',sueldo = '"+super.getSueldo()
                +"' WHERE cedulaEmpleado = " + super.getCedulaEmpleado() + " AND estadoEmpl = '" + super.getEstadoEmpl()+"';";
       
        String resultado = "";
        resultado = objConecta.modifica(SQL);
        return resultado;
    }
    
    public boolean valide(){
        String SQL ="SELECT usuarioEmpleado, contrasenaEmpleado FROM Empleado where usuarioEmpleado='"+ super.getUsuarioEmpleado()
                                               +"' and contrasenaEmpleado='"+ super.getContrasenaEmpleado()+"'";
        if(objConecta.validar(SQL)==false){
            return false;
        }else{
            return true;
        }
    }
    
    public String consultarCargo(){
        String SQL = "SELECT * FROM empleado WHERE usuarioempleado = '" + super.getUsuarioEmpleado()+"'";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        
        try{
            if(rs.next()){
                return rs.getString(9);
            }else{
                JOptionPane.showMessageDialog(null, "Error Elemento no Encontrado");
                return "No esta";
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public String nombreEmple(){
        String SQL = "SELECT * FROM empleado WHERE usuarioEmpleado = '" + super.getUsuarioEmpleado()+"'";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
            if(rs.next()){  
                String nombre = rs.getString(3);
                return (nombre);
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public String consultarExitencia (String estado){
        String SQL = "SELECT * FROM empleado WHERE cedulaEmpleado = " + super.getCedulaEmpleado()+" AND estadoEmpl = '"+estado+"';";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
        
            if(rs.next()){  
                return ("");
            }else {
                return ("No esta");
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public void listarEmpl(String valor, String filtro, JTable tabla,  String estado) {
        String[] columnas = {"nombre", "apellido", "cedula", "telefono", "direccion", "sueldo","cargo"};
        String[] registros = new String[7];
        modeloTabla = new DefaultTableModel(null, columnas);
        String SQL;
        
        if (filtro.equals("Nombre")) {
            SQL = "SELECT *"
                    + "FROM empleado WHERE nombreEmpleado LIKE '%" + valor + "%'"+" AND estadoEmpl = '"+estado+"';";
        } else if (filtro.endsWith("Apellido")){
            SQL = "SELECT *"
                    + "FROM empleado WHERE apellidoEmpleado LIKE '%" + valor + "%'"+" AND estadoEmpl = '"+estado+"';";
        }else if(filtro.equals("Cargo")){
            SQL = "SELECT *"
                    + "FROM empleado WHERE cargo LIKE '%" + valor + "%'"+" AND estadoEmpl = '"+estado+"';";
        }else {
           
            SQL = "SELECT * FROM empleado WHERE sueldo = " + super.getSueldo()+" AND estadoEmpl = '"+estado+"';";
        }
        try {
            java.sql.ResultSet rs = null;
            rs = objConecta.consulta(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("nombreEmpleado");
                registros[1] = rs.getString("apellidoEmpleado");
                registros[2] = rs.getString("cedulaEmpleado");
                registros[3] = rs.getString("telefonoEmpleado");
                registros[4] = rs.getString("direccionEmpleado");
                registros[5] = rs.getString("Sueldo");
                registros[6] = rs.getString("Cargo");
                modeloTabla.addRow(registros);
            }
            tabla.setModel(modeloTabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al cargar datos", JOptionPane.ERROR_MESSAGE);
        }
    }
}
