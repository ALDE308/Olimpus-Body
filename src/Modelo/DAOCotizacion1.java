package Modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAOCotizacion1 extends Cotizacion{
    Controlador.ControladorConectarDB objconecta;
    DefaultTableModel modeloTabla;
    
    public DAOCotizacion1(){
        objconecta = new Controlador.ControladorConectarDB();
    }
    
    public String codigoCotizacion(){
        String SQL = "SELECT MAX(codigocotizacion) FROM Cotizacion;";
        java.sql.ResultSet rs = null;
        rs = objconecta.consulta(SQL);
        
        try{
            if(rs.next()){
                String codigo = rs.getString(1);
                int code = Integer.parseInt(codigo) + 1;
                String codigoProximo = Integer.toString(code);
                return (codigoProximo);
            }
        }catch(SQLException ex){
            System.out.println("Error en DAOCotizacion1");
        }
        return null;
    }
    
    public void insertarCotizacion(){
        String sql = "INSERT INTO Cotizacion(cedulaClien,cedulaEmple) VALUES("
                +super.getCedulaClien() +"," +super.getCedulaEmple()+ ");";
        objconecta.insertar(sql);
    }
    
    public void insertarDetalleCotizacion(){
        String sql = "INSERT INTO DetalleCotizacion(idCotizacion,codigoproduc,cantidad,valorunitario,iva,totalD) VALUES("
                + super.getIdCotizacion() + ", "+super.getCodigoProduc() + ", " + super.getCantida()
                + ", " + super.getValorUnitario() + ", " + super.getIva() + ", " + super.getTotalD() + ");";
        objconecta.insertar(sql);
    }
    
    public String updateTotal(){
        String SQL = "UPDATE Cotizacion SET totalC = " + super.getTotalC() + "WHERE codigocotizacion = "
                + super.getIdCotizacion() + ";";
        String resultado = "";
        resultado = objconecta.modifica(SQL);
        return resultado;
    }
    
    public String cancelaCotizacion(){
        String SQL = "DELETE FROM Cotizacion WHERE codigocotizacion =  " + super.getIdCotizacion();
        String resultado = "";
        resultado = objconecta.eliminar(SQL);
        return resultado;
    }
    
    public String cancelaProductoC(){
        String SQL = "DELETE FROM DetalleCotizacion WHERE idCotizacion = " + super.getCodigoProduc();
        String resultado = "";
        resultado = objconecta.eliminar(SQL);
        return resultado;
    }
    
    public String consultarCotizacion(){
        String SQL = "SELECT * FROM Cotizacion WHERE codigocotizacion = " + super.getIdCotizacion();
        java.sql.ResultSet rs = null;
        rs = objconecta.consulta(SQL);
        try{
            if(rs.next()){
                String idCotizacion = rs.getString(1);
                String cedulaClien = rs.getString(2);
                String cedulaEmple = rs.getString(3);
                String fecha = rs.getString(4);
                String totalC = rs.getString(5);
                
                return ("NUMERO COTIZACION: " + idCotizacion + "\n" + "\n" + "CLIENTE: " + cedulaClien 
                        + "\n" + "\n" + "VENDEDOR: " + cedulaEmple + "\n" + "\n" + "FECHA: " +fecha
                        + "\n" + "\n" + "TOTAL COMPRA: "+totalC + "\n" + "\n");
            }else{
                JOptionPane.showMessageDialog(null,"Error Elemento no Encontrado");
                return "No esta";
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error en DAOCotizacion1");
        }
        return null;
    }
    
    public String consultarDetalleCotizacion(){
        String SQL = "SELECT * FROM DetalleCotizacion WHERE idCotizacion = " + super.getIdCotizacion();
        java.sql.ResultSet rs = null;
        rs = objconecta.consulta(SQL);
        
        try{
            if(rs.next()){
                String iddetalle = rs.getString(1);
                String codigoprod = rs.getString(3);
                String cantida = rs.getString(4);
                String valorUnitario = rs.getString(5);
                String iva = rs.getString(6);
                String totalD = rs.getString(7);
                
                return "IDENTIFICADOR: " + iddetalle + "\n" + "\n" + "CODIGO PRODUCTO: " + codigoprod
                        + "\n" + "\n" + "CANTIDAD: " + cantida + "\n" + "\n" + "VALOR UNITARIO: "
                        + valorUnitario + "\n" + "\n" + "IVA" + iva + "\n" + "\n" + "TOTAL: "
                        +totalD + "\n" + "\n";
            }else{
                JOptionPane.showMessageDialog(null,"Error Elemento no Encontrado");
                return "No esta";
            }
        }catch(SQLException ex ){
            ex.toString();
            System.out.println("Error DAOCotizacion1");
        }
        return null;
    }
    
    public void ConsultarCotizacionCompleta(int busqueda, JTable tabla) {
        String[] columnas = {"Numero Cotización", "Cliente", "Vendedor", "Fecha", "Identificador", "Codigo Producto",
            "Cantidad", "Valor Unitario", "Iva", "Total Producto", "Total Compra"};
        String[] registros = new String[11];
        modeloTabla = new DefaultTableModel(null, columnas);
        String SQL = "";
        System.out.println(busqueda);
        SQL = "SELECT * FROM Cotizacion INNER JOIN DetalleCotizacion ON DetalleCotizacion.idCotizacion = Cotizacion.codigocotizacion WHERE codigocotizacion =" + busqueda+";";
        /*if (filtro.equals("NOMBRE")) {
            //NOTA: Si se separa la instrucción sql la consulta no se hace completa
            SQL = "SELECT * FROM Cliente INNER JOIN Plan ON plan.cedula = Cliente.cedulaCli WHERE nombreCli LIKE '%"+valor+"%' AND estadoClie = '" + estado + "';";
        } else if (filtro.equals("PLAN")) {
            SQL = "SELECT * FROM Cliente INNER JOIN Plan ON plan.cedula = Cliente.cedulaCli WHERE planC LIKE '%"+valor+"%' AND estadoClie = '" + estado + "';";
        } else if (filtro.equals("SEXO")) {
            SQL = "SELECT * FROM Cliente INNER JOIN Plan ON plan.cedula = Cliente.cedulaCli WHERE sexoCli LIKE '%"+valor+"%' AND estadoClie = '" + estado + "';";
        }*/
        try {
            java.sql.ResultSet rs = null;
            rs = objconecta.consulta(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("codigocotizacion");
                registros[1] = rs.getString("cedulaClien");
                registros[2] = rs.getString("cedulaEmple");
                registros[3] = rs.getString("fecha");
                registros[4] = rs.getString("idDetalle");
                registros[5] = rs.getString("codigoProduc");
                registros[6] = rs.getString("cantidad");
                registros[7] = rs.getString("valorunitario");
                registros[8] = rs.getString("iva");
                registros[9] = rs.getString("totalD");
                registros[10] = rs.getString("totalC");
                System.out.println(rs.getString("codigocotizacion") + "\n"
                + rs.getString("cedulaClien"));
                modeloTabla.addRow(registros);
            }
            tabla.setModel(modeloTabla);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error al cargar los daots", JOptionPane.ERROR_MESSAGE);
        }

    }
}
