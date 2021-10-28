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

    public EntidadPostulante consultarPostulante() throws Exception {
        try {
            EntidadPostulante objEP = null;
            SQL = "select * from postulante where postulante_id = " + super.getPostulante_id();
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                objEP = new EntidadPostulante();
            }
            return objEP;
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

    public int verificarLogin(String dni, String contraseña) throws Exception {
        int rpt=0;
        try {
            
            SQL = "select * from postulante where numero_documento = '"+dni+"' and contraseña='"+contraseña+"'";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                rpt=1;
            }objC.desconectarBD();
           
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return rpt;
    }
    

}
