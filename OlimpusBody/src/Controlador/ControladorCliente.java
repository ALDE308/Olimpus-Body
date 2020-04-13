package Controlador;

import javax.swing.JOptionPane;

public class ControladorCliente {
    
    public ControladorCliente(){
        
    }
    
    public String buscarCliente(int busqueda, String estado){
        Modelo.DAOCliente objetoCliente = new Modelo.DAOCliente();
        objetoCliente.setCedulaCli(busqueda);
        objetoCliente.setEstadoCli(estado);
        
        String resultado = "";
        resultado = objetoCliente.consultaCliente();
        
        if(resultado.equals("No esta")){
            JOptionPane.showMessageDialog(null, "EL CLIENTE NO ESTA REGISTRADO");
        }
        return resultado;
    }
    
    public void eliminarCliente(int cedulaClien, String estado){
        Modelo.DAOCliente objetoCliente = new Modelo.DAOCliente();
        objetoCliente.setCedulaCli(cedulaClien);
        objetoCliente.setEstadoCli(estado);
        String resultado = "";
        resultado = objetoCliente.eliminar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null,"Eliminación fallida","No se logro eliminar",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"CORRECTO","Se Elimino correctamente",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void guardaCliente(String nombre,String apellido, int cedula,double telefono,
                              String correo,String sexo,String estado){
        Modelo.DAOCliente objetoCliente = new Modelo.DAOCliente();
        //carga la informacion en el objeto
        objetoCliente.setNombreCli(nombre);
        objetoCliente.setApellidoCli(apellido);
        objetoCliente.setCedulaCli(cedula);
        objetoCliente.setTelefonoCli(telefono);
        objetoCliente.setCorreoCli(correo);
        objetoCliente.setSexoCli(sexo);
        objetoCliente.setEstadoCli(estado);
        System.out.println("antes de insertar doa");
        objetoCliente.insertar();
        System.out.println("despues de insertar");
        JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");
    }
    
    public void editarCliente(String nombre,String apellido, int cedula,double telefono,
                              String correo,String plan){
        Modelo.DAOCliente objetoCliente = new Modelo.DAOCliente();
        //carga la informacion en el objeto
        objetoCliente.setNombreCli(nombre);
        objetoCliente.setApellidoCli(apellido);
        objetoCliente.setCedulaCli(cedula);
        objetoCliente.setTelefonoCli(telefono);
        objetoCliente.setCorreoCli(correo);
        objetoCliente.setEstadoCli(plan);
        
        objetoCliente.modificar();
        JOptionPane.showMessageDialog(null, "SE MODIFICO CON EXITO");
    }
    
    public String verificarExistencia(int cedula){
        Modelo.DAOCliente objetoCliente = new Modelo.DAOCliente();
        objetoCliente.setCedulaCli(cedula);
        String estado = "Activo";
        String resultado = "";
        resultado = objetoCliente.consultarExistencia(estado);
        
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null,"EL CLIENTE YA EXISTE");
        }
        return resultado;
    }
}
