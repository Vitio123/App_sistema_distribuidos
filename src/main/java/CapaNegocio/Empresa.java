package CapaNegocio;

import CapaNegocio.Entidades.EntidadEmpresa;
import CapaDatos.*;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class Empresa extends EntidadEmpresa {

    String query;
    ResultSet resultado;
    conexion objConexion = new conexion();

    public boolean actualizarEmpresa(String nombre, String tipo, String pais, String ruc) throws Exception 
    {
        query = "UPDATE EMPRESA SET nombre_empresa = '@nombre', tipo_empresa = '@tipo', pais_pais_id = @id"
                + " where ruc = '@ruc' ";
        query = query.replace("@nombre", nombre)
                .replace("@tipo", tipo)
                .replace("@id", pais)
                .replace("@ruc", ruc);
        try {
            objConexion.ejecutarBD(query);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
