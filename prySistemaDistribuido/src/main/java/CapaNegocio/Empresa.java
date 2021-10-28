package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadEmpresa;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class Empresa extends EntidadEmpresa{
    conexion objC;
    String SQL;
    ResultSet rs = null;
    
    public Empresa() {
        objC = new conexion();
    }
    
    public int verificarLogin(String ruc, String contraseña) throws Exception {
        int rpt=0;
        try {
            
            SQL = "select * from empresa where ruc = '"+ruc+"' and contraseña='"+contraseña+"'";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                rpt=1;
            }
           objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return rpt;
    }
    

}
