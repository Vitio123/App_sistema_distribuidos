package CapaNegocio;

import CapaNegocio.Entidades.EntidadPais;
import CapaDatos.conexion;
import java.sql.ResultSet;

public class Pais extends EntidadPais{
    conexion objConexion = new conexion();
    ResultSet resultado;
    String query;
    
    public ResultSet listarPaises() throws Exception{
        query = "SELECT * FROM PAIS";
        try {
            return objConexion.consultarBD(query);
        } catch (Exception e) {
            throw new Exception("Ocurrio un error al listar los paises");
        }
    }
    
    public int getPos(String nombre) throws Exception
    {
        query = "SELECT pais_id FROM PAIS WHERE nombre_pais = '"+ nombre + "' ";
        try {
            resultado = objConexion.consultarBD(query);
            if(resultado.next())
                return resultado.getInt("pais_id");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return -1;
    }
}
