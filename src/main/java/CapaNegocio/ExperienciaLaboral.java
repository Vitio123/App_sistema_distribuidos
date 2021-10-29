package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadExperienciaLaboral;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class ExperienciaLaboral extends EntidadExperienciaLaboral{
    
    conexion objC;
    String SQL;
    ResultSet rs = null;
    
    public ExperienciaLaboral(){
        objC = new conexion();
    }
    
    public void consultarExperiencia(){
        
    }
    
    public void insertarExperiencia(){
        
    }
    
    public void modificarExperiencia(){
        
    }
    
    public void eliminarExperiencia(){
        
    }
    
    public void listarExperiencia(){
        
    }
}
