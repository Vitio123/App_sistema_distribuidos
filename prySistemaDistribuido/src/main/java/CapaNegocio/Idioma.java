package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadIdioma;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class Idioma extends EntidadIdioma {

    conexion objC;
    String SQL;
    ResultSet rs = null;

    public Idioma() {
        objC = new conexion();
    }

    public EntidadIdioma consultarIdioma() throws Exception {
        try {
            EntidadIdioma objEI = null;
            SQL = "select * from dbo.Idiomas_postulante where idioma_id = " + super.getIdioma_id();
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                objEI.setIdioma_id(rs.getInt(1));
                objEI.setIdioma(rs.getString(2));
                objEI.setNivel(rs.getString(3));
                objEI.setLink_archivo(rs.getString(4));
                objEI.setPostulante_id(rs.getInt(5));
            }
            return objEI;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void insertarIdioma() throws Exception {
        try {
            SQL = "";
            objC.ejecutarBD(SQL);
            objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void modificarIdioma() throws Exception {
        try {
            SQL = "";
            objC.ejecutarBD(SQL);
            objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void eliminarIdioma() throws Exception {
        try {
            SQL = "";
            objC.ejecutarBD(SQL);
            objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void listarIdioma() throws Exception {
        try {
            SQL = "";
            objC.ejecutarBD(SQL);
            objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void llenarIdiomas() throws Exception {
        try {
            SQL = "";
            objC.ejecutarBD(SQL);
            objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
