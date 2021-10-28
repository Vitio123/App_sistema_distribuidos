package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadPostulante;
import java.sql.ResultSet;
import javax.swing.JTable;

/**
 *
 * @author Rodrigo Ruidias
 */
public class Postulante extends EntidadPostulante {

    conexion objC;
    String SQL;
    ResultSet rs = null;

    public Postulante() {
        objC = new conexion();
    }

    public void consultarPostulante() throws Exception {
        try {
            SQL = "select * from postulante where postulante_id = " + super.getPostulante_id();
            rs = objC.consultarBD(SQL);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void insertarPostulante() throws Exception {
        try {

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void modificarPostulante() throws Exception {
        try {

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void eliminarPostulante() throws Exception {
        try {

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void listarPostulante(JTable tblListado) throws Exception {
        try {

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
