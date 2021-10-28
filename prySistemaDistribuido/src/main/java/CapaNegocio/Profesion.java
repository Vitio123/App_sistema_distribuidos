package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadProfesion;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class Profesion extends EntidadProfesion{
    
    conexion objC;
    String SQL;
    ResultSet rs = null;
    
    public Profesion(){
        objC = new conexion();
    }
    
    public void consultarProfesion(){
        SQL = "select * from postulante where profesion_id = " + super.getProfesion_id();
    }
    
    public void insertarProfesion(){
        
    }
    
    public void modificarProfesion(){
        
    }
    
    public void eliminarProfesion(){
        
    }
    
    public void listarProfesion(){
        
    }
    
    
}
