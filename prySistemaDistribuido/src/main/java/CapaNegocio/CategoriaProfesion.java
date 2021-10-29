
package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadCategoriaProfesion;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class CategoriaProfesion extends EntidadCategoriaProfesion{
    
    conexion objC;
    String SQL;
    ResultSet rs = null;
    
    public CategoriaProfesion() {
        objC = new conexion();
    }
    
}
