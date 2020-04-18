package Modelo;

import Controlador.ControladorConectarDB;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAOCliente extends Cliente{
    Controlador.ControladorConectarDB objConecta;
    DefaultTableModel modeloTabla;
    public DAOCliente(){
        objConecta = new ControladorConectarDB();
        
    }
    
    public void insertar(){
        String sql = "INSERT INTO Cliente(nombreCli,apellidoCli,cedulaCli,telefonoCli,correoCli,sexoCli,estadoClie)"
                + "VALUES('" + super.getNombreCli() +"', '" + super.getApellidoCli() +"',"+ super.getCedulaCli()
                +","+super.getTelefonoCli() +",'" +super.getCorreoCli() +"', '" +super.getSexoCli() +"', '"
                +super.getEstadoCli() +"');";
        objConecta.insertar(sql);
    }
    
    public String consultaCliente(){
        String SQL = "SELECT * FROM Cliente WHERE cedulaCli = " +super.getCedulaCli() + "AND estadoClie = '" + super.getEstadoCli()+"';";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        
        try{
            
            if(rs.next()){
                String nombreCli = rs.getString(1);
                String apellidoCli = rs.getString(2);
                String telefonoCli = rs.getString(4);
                String correoCli = rs.getString(5);
                String sexoCli = rs.getString(6);
                String planCli = rs.getString(7);
                
                return ("NOMBRE: " + nombreCli + "\n" + "\n" +  "APELLIDO: " +apellidoCli + "\n" + "\n"
                       +"TELEFONO: " +telefonoCli +"\n" +"\n" +"CORREO: " +correoCli +"\n" +"\n" 
                       +"SEXO: " +sexoCli +"\n" +"\n" +"PLAN: " +planCli);
            }else{
                JOptionPane.showMessageDialog(null, "Error el ciente n o esta registrado");
                return "No esta";
            }
        }catch(SQLException ex){
         ex.getMessage();
            System.out.println("Error exception Clase DAOCliente");
        }
        return null;
    }
    
    public String eliminar(){
        String SQL = "UPDATE Cliente SET estadoClie = '"+super.getEstadoCli()
                +"' WHERE cedulaCli = "+super.getCedulaCli();
        String resultado = "";
        resultado = objConecta.eliminar(SQL);
        return resultado;
    }
    
    public String modificar(){
        String SQL = "UPDATE Cliente SET nombreCli = '" + super.getNombreCli() + "', apellidoCli = '"
                     + super.getApellidoCli() + "', telefonoCli = " + super.getTelefonoCli()
                     + ", correoCli = '" + super.getCorreoCli() + "', sexoCli = '" + super.getSexoCli()
                     + "', planCli = '"+ super.getPlanCli()+"' WHERE cedulaCli = " + super.getCedulaCli();
        String resultado = ""; 
        resultado = objConecta.modifica(SQL);
        return resultado;
    }
    
    public String consutarNombre(){
        String estado = "Activo";
        String SQL = "SELECT * FROM Cliente WHERE = " + super.getCedulaCli()+"AND estadoClie = '"+estado+"';";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
            
            if(rs.next()){
                String nombreCli = rs.getString(1);
                return nombreCli;
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error en el metod consultarNombre, clase DAOCliente");
        }
        return null;
    }
    
    public String consultarExistencia(String estado){
        String SQL = "SELECT * FROM Cliente WHERE cedulaCli = " + super.getCedulaCli()+" AND estadoClie = '"+estado+"';";
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
    
    public  void listarCliente(String valor,String filtro, JTable tabla,String estado){
        String[] columnas = {"Nombre", "Apellido", "Cedula", "Telefono", "Correo", "Sexo", "Plan"};
        String[] registros = new String[7];
        modeloTabla = new DefaultTableModel(null, columnas);
        String SQL = "";
        
        if(filtro.equals("NOMBRE")){
            SQL = "SELECT * FROM Cliente WHERE nombreCli LIKE '%" + valor + "%'"
                    + "AND estadoClie = '" + estado + "';";
        }else if(filtro.equals("PLAN")){
            SQL = "SELECT * FROM Cliente WHERE apellidoCli LIKE '%" + valor + "%'"
                    + "AND estadoClie = '" + estado + "';";
        }else if(filtro.equals("SEXO")){
            SQL = "SELECT * FROM Cliente WHERE sexoCli LIKE '%" + valor + "%'"
                    + "AND estadoClie = '" + estado + "';";
        }
        try{
            java.sql.ResultSet rs = null;
            rs = objConecta.consulta(SQL);
            while(rs.next()){
                registros[0] = rs.getString("nombreCli");
                registros[1] = rs.getString("apellidoCli");
                registros[2] = rs.getString("cedulaCli");
                registros[3] = rs.getString("telefonoCli");
                registros[4] = rs.getString("correoCli");
                registros[5] = rs.getString("sexoCli");
                registros[6] = rs.getString("planCli");
                modeloTabla.addRow(registros);
            }
            tabla.setModel(modeloTabla);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex,"Error al cargar los daots",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void generarPdf(String dato, String filtro,String estado){
        Document documento = new Document();
        String SQL;
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Cliente.pdf"));
            Image header = Image.getInstance("src/Imagenes/LOGOPEQUENO2.PNG");
            //largo y dimension
            header.scaleToFit(150, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("LA FUERZA ESTA EN TUS MANOS\n\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("CLIENTES\n\n");
            documento.open();
            
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(7);
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("Cedula");
            tabla.addCell("Telefono");
            tabla.addCell("Correo");
            tabla.addCell("Sexo");
            tabla.addCell("Plan");
            
            if (filtro.equals("Nombre")) {
                SQL = "SELECT *"
                    + "FROM cliente WHERE nombreCli LIKE '%" + dato + "%'"+" AND estadoClie = '"+estado+"';";
            } else if (filtro.equals("Sexo")) {
                SQL = "SELECT *"
                    + "FROM cliente WHERE sexocli LIKE '%" + dato + "%'"+" AND estadoClie = '"+estado+"';";
            }else {
                SQL = "SELECT *"
                    + "FROM cliente WHERE estadoClie = '"+estado+"';";
            }
               
            try{
                java.sql.ResultSet rs = null;
                rs = objConecta.consulta(SQL);
                if(rs.next()){
                    do{
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        
                    }while(rs.next());
                    documento.add(tabla);
                }
                 
            }catch(DocumentException | SQLException e){
                
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        }catch(DocumentException | HeadlessException | FileNotFoundException ex){
            System.out.println("Error en PDF"+ ex);
        }catch(IOException Ex){
            System.out.println("Error en la imagen"+ Ex);
        }
    }
}
