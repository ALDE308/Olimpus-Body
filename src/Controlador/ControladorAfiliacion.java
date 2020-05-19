package Controlador;

import javax.swing.JOptionPane;

public class ControladorAfiliacion {

    public ControladorAfiliacion() {
    }
    
    public String buscarAfiliacion(int busqueda, String estado){
        Modelo.DAOAfiliacion objetoAfiliacion = new Modelo.DAOAfiliacion();
        objetoAfiliacion.setCedulaC(busqueda);
        objetoAfiliacion.setEstadoPlan(estado);
        
        String resultado = "";
        resultado = objetoAfiliacion.consultaAfiliacion();
        
        if(resultado.equals("No esta")){
            JOptionPane.showMessageDialog(null, "EL CLIENTE NO ESTA REGISTRADO");
        }
        return resultado;
    }
    
    public void eliminarAfiliacion(int cedulaClien, String estado){
        Modelo.DAOAfiliacion objetoAfiliacion = new Modelo.DAOAfiliacion();
        objetoAfiliacion.setCedulaC(cedulaClien);
        objetoAfiliacion.setEstadoAfi(estado);
        String resultado = "";
        resultado = objetoAfiliacion.eliminar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null,"Eliminación fallida","No se logro eliminar",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"CORRECTO","Se Elimino correctamente",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void guardaAfiliacion(int cedula, String plan,String estadoP){
        Modelo.DAOAfiliacion objetoAfiliacion = new Modelo.DAOAfiliacion();
        //carga la informacion en el objeto
        objetoAfiliacion.setCedulaC(cedula);
        objetoAfiliacion.setPlanC(plan);
        objetoAfiliacion.setEstadoPlan(estadoP);
        System.out.println("controladorAfiliacion" + cedula+plan+estadoP);
        objetoAfiliacion.insertar();
        JOptionPane.showMessageDialog(null,"SE AFILIO CON EXITO");
    }
    
    public void editarAfiliacion(int cedula, String plan,String estadoP){
        Modelo.DAOAfiliacion objetoAfiliacion = new Modelo.DAOAfiliacion();
        //carga la informacion en el objeto
        objetoAfiliacion.setCedulaC(cedula);
        objetoAfiliacion.setPlanC(plan);
        objetoAfiliacion.setEstadoPlan(estadoP);
        
        objetoAfiliacion.modificar();
        JOptionPane.showMessageDialog(null, "SE MODIFICO CON EXITO");
    }
    
    public String verificarExistencia(int cedula){
        Modelo.DAOAfiliacion objetoAfiliacion = new Modelo.DAOAfiliacion();
        objetoAfiliacion.setCedulaC(cedula);
        String estado = "Activo";
        String resultado = "";
        resultado = objetoAfiliacion.consultarExistencia(estado);
        
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null,"LA AFILIACIÓN YA EXISTE");
        }
        return resultado;
    }
    
}
