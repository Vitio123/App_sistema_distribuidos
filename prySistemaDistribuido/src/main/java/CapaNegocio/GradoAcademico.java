package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadGradoAcademico;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class GradoAcademico extends EntidadGradoAcademico{
    
    conexion objC;
    String SQL;
    ResultSet rs = null;
    
    public GradoAcademico() {
        objC = new conexion();
    }
    
}
