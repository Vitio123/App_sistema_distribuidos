package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadIdioma;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class Idioma extends EntidadIdioma{
    
    conexion objC;
    String SQL;
    ResultSet rs = null;
    
    public Idioma(){
        objC = new conexion();
    }
    
    public void consultarIdioma(){
        
    }
    
    public void insertarIdioma(){
        
    }
    
    public void modificarIdioma(){
        
    }
    
    public void eliminarIdioma(){
        
    }
    
    public void listarIdioma(){
        
    }
}
