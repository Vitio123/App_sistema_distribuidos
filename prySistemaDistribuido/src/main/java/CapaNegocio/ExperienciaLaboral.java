package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadExperienciaLaboral;
import java.sql.ResultSet;

/**
 *
 * @author Rodrigo Ruidias
 */
public class ExperienciaLaboral extends EntidadExperienciaLaboral {

    conexion objC;
    String SQL;
    ResultSet rs = null;

    public ExperienciaLaboral() {
        objC = new conexion();
    }

    public EntidadExperienciaLaboral consultarExperiencia() throws Exception {
        try {
            EntidadExperienciaLaboral objEE = null;
            SQL = "select * from dbo.Experiencia_laboral where experiencia_id = " + super.getExperiencia_id();
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                objEE = new EntidadExperienciaLaboral();
                objEE.setExperiencia_id(rs.getInt(1));
                objEE.setFecha_inicio(rs.getDate(2));
                objEE.setFecha_final(rs.getDate(3));
                objEE.setLink_archivo(rs.getString(4));
                objEE.setPostulante_id(rs.getInt(5));
                objEE.setEmpresa_id(rs.getInt(6));
                objEE.setCargo(rs.getString(7));
            }
            objC.desconectarBD();
            return objEE;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void insertarExperiencia(String fechaI, String fechaS) throws Exception {
        try {
            
            String fechainicio = fechaI.replace("/", "-");
            String diaI = fechainicio.substring(0, 2);
            String mesI = fechainicio.substring(3, 5);
            String anoI = fechainicio.substring(6, 10);
            String fechaIni = anoI + "-" + mesI + "-" + diaI;
            
            String fechasalida = fechaS.replace("/", "-");
            String diaS = fechasalida.substring(0, 2);
            String mesS = fechasalida.substring(3, 5);
            String anoS = fechasalida.substring(6, 10);
            String fechaSal = anoS + "-" + mesS + "-" + diaS;
            
            System.out.println(fechaIni);
            System.out.println(fechaSal);
            System.out.println(super.getLink_archivo());
            System.out.println(super.getEmpresa_id());
            System.out.println(super.getCargo());
            
            SQL = "insert into dbo.Experiencia_laboral(fecha_inicio, fecha_final, link_archivo, postulante_postulante_id, empresa_empresa_id, cargo) values('" + fechaIni + "', '" + fechaSal + "', '" + super.getLink_archivo() + "', " + super.getPostulante_id() + ", " + super.getEmpresa_id() + ", '" + super.getCargo() + "')";
            objC.ejecutarBD(SQL);
            objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void modificarExperiencia() throws Exception {
        try {
            SQL = "update dbo.Experiencia_laboral set fecha_inicio = '" + super.getFecha_inicio() + "', fecha_final = '" + super.getFecha_final() + "', link_archivo = '" + super.getLink_archivo() + "', postulante_postulante_id = '" + super.getPostulante_id() + ", empresa_empresa_id = " + super.getEmpresa_id() + ", cargo = '" + super.getCargo() + "' where experiencia_id = " + super.getExperiencia_id();
            objC.ejecutarBD(SQL);
            objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void eliminarExperiencia() throws Exception {
        try {
            SQL = "delete from dbo.Experiencia_laboral where experiencia_id = " + super.getExperiencia_id();
            objC.ejecutarBD(SQL);
            objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
