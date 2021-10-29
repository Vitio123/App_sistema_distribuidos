package CapaNegocio;

import CapaDatos.conexion;
import CapaNegocio.Entidades.EntidadEmpresa;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
                rpt=rs.getInt(1);
            }
           objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return rpt;
    }
    
    public void listarEmpresa(JTable tblListado) throws Exception {
        try {
            SQL = "select e.empresa_id, e.nombre_empresa, e.tipo_empresa, e.ruc, pa.nombre_pais from dbo.Empresa as e inner join dbo.Pais as pa on pa.pais_id = e.pais_pais_id order by 2, 3 asc";
            rs = objC.consultarBD(SQL);
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("RUC");
            modelo.addColumn("Pais");
            
            tblListado.setModel(modelo);
            
            while(rs.next()){
                Object datos[] = new Object[modelo.getColumnCount()];
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = rs.getString(i+1);
                }
                
                modelo.addRow(datos);
            }            
            objC.desconectarBD();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    

}
