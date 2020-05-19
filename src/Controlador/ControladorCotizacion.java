package Controlador;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class ControladorCotizacion {
    
    public ControladorCotizacion(){
        
    }
    
    public String buscarPro(int codigoProd){
        Modelo.DAOCotizacion objetoProducto = new Modelo.DAOCotizacion();
        objetoProducto.setCodigoPro(codigoProd);
        
        String resultado = ""; 
        resultado = objetoProducto.consultarNombreProducto();
        
        return resultado;
    }
    
    public String buscarPrecio(int codigoProd){
        Modelo.DAOCotizacion objetoProducto = new Modelo.DAOCotizacion();
        objetoProducto.setCodigoPro(codigoProd);
        
        String resultado = "";
        resultado = objetoProducto.consultarPrecio();
        
        return resultado;
    }
    
    public String buscarCodigo(int codigoProduc){
        Modelo.DAOCotizacion objetoProducto = new Modelo.DAOCotizacion();
        objetoProducto.setCodigoPro(codigoProduc);
        
        String resultado = "";
        resultado = objetoProducto.consultarCodigo();
        
        return resultado;
    }
    
    public String codigoCotizacion(){
        Modelo.DAOCotizacion1 objetoCotizacion = new Modelo.DAOCotizacion1();
        objetoCotizacion.codigoCotizacion();
        
        String resultado = "";
        resultado = objetoCotizacion.codigoCotizacion();
        
        return resultado;
    }
    
    public static String fechaActual(){
        
        Date fecha1 = new Date();
        DateFormat Formato = new  SimpleDateFormat("YYYY/MM/DD");
        System.out.println("Fecha: " + Formato.format(fecha1));
        
        return Formato.format(fecha1);
        
    }
    
    public static boolean isNumeric(String cadena){
        try{
            Integer.parseInt(cadena);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public void guardarCotizacion(int cedulaCli, int cedulaEmple){
        Modelo.DAOCotizacion1 cotizacion = new Modelo.DAOCotizacion1();
        
        cotizacion.setCedulaClien(cedulaCli);
        cotizacion.setCedulaEmple(cedulaEmple);
        
        cotizacion.insertarCotizacion();
    }
    
    public void guardarDetalleC(int cotizacion, int producto, int cantidad, double valor, double iva, double total){
        Modelo.DAOCotizacion1 detalleCotizacion = new Modelo.DAOCotizacion1();
        detalleCotizacion.setIdCotizacion(cotizacion);
        detalleCotizacion.setCodigoProduc(producto);
        detalleCotizacion.setCantida(cantidad);
        detalleCotizacion.setValorUnitario(valor);
        detalleCotizacion.setIva(iva);
        detalleCotizacion.setTotalD(total);
        
        detalleCotizacion.insertarDetalleCotizacion();
        
    }
    
    public void updateCompra(double totalCompra, int idCotizacion){
        Modelo.DAOCotizacion1 update = new Modelo.DAOCotizacion1();
        update.setTotalC(totalCompra);
        update.setIdCotizacion(idCotizacion);
        
        update.setTotalC(totalCompra);
        
        update.updateTotal();
    }
    
    public void cancelarCotizacion(int cotizacion){
        Modelo.DAOCotizacion1 objeto = new Modelo.DAOCotizacion1();
        
        objeto.setIdCotizacion(cotizacion);
        String resultado = "";
        resultado = objeto.cancelaCotizacion();
    }
    
    public void cancelaProducto(int producto){
        Modelo.DAOCotizacion1 objeto = new Modelo.DAOCotizacion1();
        objeto.setCodigoProduc(producto);
        String resultado = "";
        resultado = objeto.cancelaProductoC();
    }
    
    public String buscarCotizacion(int busqueda){
        Modelo.DAOCotizacion1 objetoCotizacion = new Modelo.DAOCotizacion1();
        objetoCotizacion.setIdCotizacion(busqueda);
        
        String resultado = "";
        resultado = objetoCotizacion.consultarCotizacion();
        
        if(resultado.equals("No se encontró")){
            JOptionPane.showMessageDialog(null, "No esta");
        }
        return resultado;
    }
    
    public String buscarDetalleCotizacion(int busqueda){
        Modelo.DAOCotizacion1 objetoCotizacion = new Modelo.DAOCotizacion1();
        objetoCotizacion.setIdCotizacion(busqueda);
        
        String resultado = "";
        resultado = objetoCotizacion.consultarDetalleCotizacion();
        
        if(resultado.equals("No se encontró")){
            JOptionPane.showMessageDialog(null, "No esta");
        }
        return resultado;
    }
}
