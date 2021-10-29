package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadUbigeo;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class Ubigeo extends EntidadUbigeo{
    
    conexion objC;
    String SQL;
    ResultSet rs = null;
    
    public Ubigeo() {
        objC = new conexion();
    }
    
    public void datosUbigeo(){
        
    }
    
}
