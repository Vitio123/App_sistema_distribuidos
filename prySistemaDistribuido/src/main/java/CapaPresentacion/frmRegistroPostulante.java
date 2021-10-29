package CapaPresentacion;

import CapaNegocio.CategoriaProfesion;
import CapaNegocio.Empresa;
import CapaNegocio.Entidades.EntidadCategoriaProfesion;
import CapaNegocio.Entidades.EntidadEmpresa;
import CapaNegocio.Entidades.EntidadGradoAcademico;
import CapaNegocio.Entidades.EntidadPais;
import CapaNegocio.Entidades.EntidadTipoDocumento;
import CapaNegocio.Entidades.EntidadUniversidad;
import CapaNegocio.GradoAcademico;
import CapaNegocio.Idioma;
import CapaNegocio.Pais;
import CapaNegocio.Postulante;
import CapaNegocio.TipoDocumento;
import CapaNegocio.Ubigeo;
import CapaNegocio.Universidad;
import java.awt.GridBagLayout;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class frmRegistroPostulante extends javax.swing.JFrame {

    public frmRegistroPostulante() {
        initComponents();
        habilitarPanelPostulante();
        this.setLocationRelativeTo(null);
        llenarCombos();
        txtID.setText(dni);
        txtID.setEditable(false);
        modeloIdioma.addColumn("Idioma");
        modeloIdioma.addColumn("Nivel");
        modeloIdioma.addColumn("Archivo");
    }

    public static String dni = "";
    public static String contraseña = "";
    public int idpostulante = 0;

    Postulante objP = null;
    Ubigeo objU = null;

    public String imagenselect = "";
    public String archivoIdiomaselect = "";

    DefaultTableModel modeloIdioma = new DefaultTableModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPostulante = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cboTipoDocumento = new javax.swing.JComboBox<>();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        cboDepartamento = new javax.swing.JComboBox<>();
        cboProvincia = new javax.swing.JComboBox<>();
        cboDistrito = new javax.swing.JComboBox<>();
        cboPais = new javax.swing.JComboBox<>();
        txtColegiatura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSeleccionarFoto = new javax.swing.JButton();
        btnVerFoto = new javax.swing.JButton();
        btnSiguientePostulante = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        cboProfesionPostulante = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        panelIdiomas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnArchivoIdioma = new javax.swing.JButton();
        btnVerIdioma = new javax.swing.JButton();
        cboIdioma = new javax.swing.JComboBox<>();
        cboNivel = new javax.swing.JComboBox<>();
        btnSiguienteIdiomas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListadoIdioma = new javax.swing.JTable();
        btnAgregarIdioma = new javax.swing.JButton();
        btnQuitarIdioma = new javax.swing.JButton();
        PanelProfesion = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cboUniversidad = new javax.swing.JComboBox<>();
        txtFechaObtencion = new javax.swing.JFormattedTextField();
        cboProfesion = new javax.swing.JComboBox<>();
        cboGradoA = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        btnSiguienteProfesion = new javax.swing.JButton();
        btnArchivoProfesion = new javax.swing.JButton();
        btnVerProfesion = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        panelExperiencia = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtFechaS = new javax.swing.JFormattedTextField();
        btnArchivoEL = new javax.swing.JButton();
        btnVerEL = new javax.swing.JButton();
        txtFechaI = new javax.swing.JFormattedTextField();
        cboEmpresa = new javax.swing.JComboBox<>();
        btnFinalizar = new javax.swing.JButton();
        btnCargo = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAgregarEL = new javax.swing.JButton();
        btnQuitarEL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        panelPostulante.setBackground(new java.awt.Color(255, 255, 255));
        panelPostulante.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel2.setText("N° documento:");

        jLabel4.setText("Apellido paterno:");

        jLabel5.setText("Apellido materno:");

        jLabel6.setText("Nombres:");

        jLabel7.setText("Departamento:");

        jLabel8.setText("Provincia:");

        jLabel9.setText("Distrito:");

        jLabel10.setText("País:");

        jLabel11.setText("Colegiatura:");

        cboTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "PASAPORTE", "RUC" }));

        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });

        cboDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDepartamentoItemStateChanged(evt);
            }
        });

        cboProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProvinciaItemStateChanged(evt);
            }
        });

        jLabel1.setText("Foto:");

        btnSeleccionarFoto.setBackground(new java.awt.Color(0, 117, 196));
        btnSeleccionarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarFoto.setText("Seleccionar foto");
        btnSeleccionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarFotoActionPerformed(evt);
            }
        });

        btnVerFoto.setBackground(new java.awt.Color(0, 117, 196));
        btnVerFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnVerFoto.setText("Ver");
        btnVerFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFotoActionPerformed(evt);
            }
        });

        btnSiguientePostulante.setBackground(new java.awt.Color(0, 117, 196));
        btnSiguientePostulante.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguientePostulante.setText("Siguiente");
        btnSiguientePostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguientePostulanteActionPerformed(evt);
            }
        });

        jLabel28.setText("Profesión:");

        jLabel29.setBackground(new java.awt.Color(0, 117, 196));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 117, 196));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Registrar postulante");

        javax.swing.GroupLayout panelPostulanteLayout = new javax.swing.GroupLayout(panelPostulante);
        panelPostulante.setLayout(panelPostulanteLayout);
        panelPostulanteLayout.setHorizontalGroup(
            panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostulanteLayout.createSequentialGroup()
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cboTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6)
                        .addGap(61, 61, 61)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel11)
                        .addGap(49, 49, 49)
                        .addComponent(txtColegiatura, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel28)
                        .addGap(60, 60, 60)
                        .addComponent(cboProfesionPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addGap(86, 86, 86)
                        .addComponent(btnSeleccionarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnVerFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel10)
                        .addGap(89, 89, 89)
                        .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel8)
                        .addGap(61, 61, 61)
                        .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel9)
                        .addGap(72, 72, 72)
                        .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnSiguientePostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPostulanteLayout.setVerticalGroup(
            panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostulanteLayout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(txtColegiatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel28))
                    .addComponent(cboProfesionPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(btnSeleccionarFoto)
                    .addComponent(btnVerFoto))
                .addGap(6, 6, 6)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSiguientePostulante)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(panelPostulante, "card5");

        panelIdiomas.setBackground(new java.awt.Color(255, 255, 255));
        panelIdiomas.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 117, 196));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccione su idioma");

        jLabel12.setText("Idioma:");

        jLabel13.setText("Nivel:");

        jLabel14.setText("Archivo:");

        btnArchivoIdioma.setBackground(new java.awt.Color(0, 117, 196));
        btnArchivoIdioma.setForeground(new java.awt.Color(255, 255, 255));
        btnArchivoIdioma.setText("Seleccionar archivo");

        btnVerIdioma.setBackground(new java.awt.Color(0, 117, 196));
        btnVerIdioma.setForeground(new java.awt.Color(255, 255, 255));
        btnVerIdioma.setText("Ver");

        cboIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingles", "Español", "Italiano", "Japones", "Alemán" }));

        cboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "A2", "B1", "B2", "C1", "C2" }));

        btnSiguienteIdiomas.setBackground(new java.awt.Color(0, 117, 196));
        btnSiguienteIdiomas.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguienteIdiomas.setText("Siguiente");
        btnSiguienteIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteIdiomasActionPerformed(evt);
            }
        });

        tblListadoIdioma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblListadoIdioma);

        btnAgregarIdioma.setBackground(new java.awt.Color(0, 117, 196));
        btnAgregarIdioma.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarIdioma.setText("Agregar");
        btnAgregarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIdiomaActionPerformed(evt);
            }
        });

        btnQuitarIdioma.setBackground(new java.awt.Color(0, 117, 196));
        btnQuitarIdioma.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarIdioma.setText("Quitar");
        btnQuitarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarIdiomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIdiomasLayout = new javax.swing.GroupLayout(panelIdiomas);
        panelIdiomas.setLayout(panelIdiomasLayout);
        panelIdiomasLayout.setHorizontalGroup(
            panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelIdiomasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel12)
                .addGap(22, 22, 22)
                .addComponent(cboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelIdiomasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel13)
                .addGap(32, 32, 32)
                .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelIdiomasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(btnArchivoIdioma)
                .addGap(6, 6, 6)
                .addComponent(btnVerIdioma))
            .addGroup(panelIdiomasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelIdiomasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnAgregarIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnQuitarIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelIdiomasLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btnSiguienteIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelIdiomasLayout.setVerticalGroup(
            panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdiomasLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIdiomasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(cboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIdiomasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIdiomasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(btnArchivoIdioma)
                    .addComponent(btnVerIdioma))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarIdioma)
                    .addComponent(btnQuitarIdioma))
                .addGap(18, 18, 18)
                .addComponent(btnSiguienteIdiomas))
        );

        getContentPane().add(panelIdiomas, "card4");

        PanelProfesion.setBackground(new java.awt.Color(255, 255, 255));
        PanelProfesion.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel15.setText("Fecha de obtención:");

        jLabel16.setText("Profesión:");

        jLabel17.setText("Universidad:");

        jLabel18.setText("Descripción:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        try {
            txtFechaObtencion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**/**/****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaObtencion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel19.setText("Grado academico:");

        btnSiguienteProfesion.setBackground(new java.awt.Color(0, 117, 196));
        btnSiguienteProfesion.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguienteProfesion.setText("Siguiente");
        btnSiguienteProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteProfesionActionPerformed(evt);
            }
        });

        btnArchivoProfesion.setBackground(new java.awt.Color(0, 117, 196));
        btnArchivoProfesion.setForeground(new java.awt.Color(255, 255, 255));
        btnArchivoProfesion.setText("Seleccionar archivo");

        btnVerProfesion.setBackground(new java.awt.Color(0, 117, 196));
        btnVerProfesion.setForeground(new java.awt.Color(255, 255, 255));
        btnVerProfesion.setText("Ver");

        jLabel20.setText("Archivo:");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 117, 196));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Registre su profesión");

        javax.swing.GroupLayout PanelProfesionLayout = new javax.swing.GroupLayout(PanelProfesion);
        PanelProfesion.setLayout(PanelProfesionLayout);
        PanelProfesionLayout.setHorizontalGroup(
            PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelProfesionLayout.createSequentialGroup()
                .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProfesionLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(cboUniversidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaObtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelProfesionLayout.createSequentialGroup()
                                .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cboGradoA, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnArchivoProfesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerProfesion))))
                    .addGroup(PanelProfesionLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnSiguienteProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        PanelProfesionLayout.setVerticalGroup(
            PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProfesionLayout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtFechaObtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cboProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cboUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGradoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(btnArchivoProfesion)
                    .addComponent(btnVerProfesion))
                .addGap(18, 18, 18)
                .addComponent(btnSiguienteProfesion)
                .addGap(101, 101, 101))
        );

        getContentPane().add(PanelProfesion, "card3");

        panelExperiencia.setBackground(new java.awt.Color(255, 255, 255));
        panelExperiencia.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel21.setText("Fecha de inicio:");

        jLabel22.setText("Fecha de salida:");

        jLabel23.setText("Archivo:");

        jLabel24.setText("Empresa:");

        jLabel25.setText("Cargo:");

        try {
            txtFechaS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**/**/****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnArchivoEL.setBackground(new java.awt.Color(0, 117, 196));
        btnArchivoEL.setForeground(new java.awt.Color(255, 255, 255));
        btnArchivoEL.setText("Seleccionar archivo");

        btnVerEL.setBackground(new java.awt.Color(0, 117, 196));
        btnVerEL.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEL.setText("Ver");

        try {
            txtFechaI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**/**/****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnFinalizar.setBackground(new java.awt.Color(0, 117, 196));
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Supervisor" }));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 117, 196));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Experiencia laboral");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable1);

        btnAgregarEL.setBackground(new java.awt.Color(0, 117, 196));
        btnAgregarEL.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEL.setText("Agregar");

        btnQuitarEL.setBackground(new java.awt.Color(0, 117, 196));
        btnQuitarEL.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarEL.setText("Quitar");

        javax.swing.GroupLayout panelExperienciaLayout = new javax.swing.GroupLayout(panelExperiencia);
        panelExperiencia.setLayout(panelExperienciaLayout);
        panelExperienciaLayout.setHorizontalGroup(
            panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelExperienciaLayout.createSequentialGroup()
                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelExperienciaLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelExperienciaLayout.createSequentialGroup()
                                .addComponent(btnAgregarEL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuitarEL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelExperienciaLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelExperienciaLayout.createSequentialGroup()
                                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelExperienciaLayout.createSequentialGroup()
                                        .addComponent(btnArchivoEL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVerEL))
                                    .addComponent(txtFechaS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(panelExperienciaLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelExperienciaLayout.setVerticalGroup(
            panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExperienciaLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtFechaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(btnArchivoEL)
                    .addComponent(btnVerEL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(btnCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEL)
                    .addComponent(btnQuitarEL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinalizar)
                .addGap(14, 14, 14))
        );

        getContentPane().add(panelExperiencia, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaternoActionPerformed

    private void btnSiguientePostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePostulanteActionPerformed
        RegistroPostulante();
        habilitarPanelIdiomas();
    }//GEN-LAST:event_btnSiguientePostulanteActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnSiguienteIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteIdiomasActionPerformed
        RegistroIdioma();
        habilitarPanelProfesion();
    }//GEN-LAST:event_btnSiguienteIdiomasActionPerformed

    private void btnSiguienteProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteProfesionActionPerformed
        habilitarPanelExperiencia();
    }//GEN-LAST:event_btnSiguienteProfesionActionPerformed

    private void cboDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDepartamentoItemStateChanged
        try {
            objU = new Ubigeo();
            objU.setDepartamento(cboDepartamento.getSelectedItem().toString());
            ArrayList<String> provincias = objU.provinciaUbigeo();
            cboProvincia.setModel(new DefaultComboBoxModel(provincias.toArray()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cboDepartamentoItemStateChanged

    private void cboProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProvinciaItemStateChanged
        try {
            objU = new Ubigeo();
            objU.setDepartamento(cboDepartamento.getSelectedItem().toString());
            objU.setProvincia(cboProvincia.getSelectedItem().toString());
            ArrayList<String> distritos = objU.distritoUbigeo();
            cboDistrito.setModel(new DefaultComboBoxModel(distritos.toArray()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cboProvinciaItemStateChanged

    private void btnSeleccionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarFotoActionPerformed
        grabarImagen();
    }//GEN-LAST:event_btnSeleccionarFotoActionPerformed

    private void btnVerFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFotoActionPerformed
        if (imagenselect.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una imagen primero");
        } else {
            JDialog jd = new JDialog(this);
            JPanel jp = new JPanel();
            jd.add(jp);
            JLabel jl = new JLabel();
            ImageIcon imagen = new ImageIcon(imagenselect);
            jl.setIcon(imagen);
            jp.setLayout(new GridBagLayout());
            jp.add(jl);
            jp.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            jd.setSize(500, 500);
            jd.setLocationRelativeTo(null);
            jd.setTitle("Previsualización de la imagen");
            jd.setVisible(true);
        }
    }//GEN-LAST:event_btnVerFotoActionPerformed

    private void btnAgregarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIdiomaActionPerformed
        Object datos[] = new Object[3];
        datos[0] = cboIdioma.getSelectedItem().toString();
        datos[1] = cboNivel.getSelectedItem().toString();
        datos[2] = archivoIdiomaselect;
        modeloIdioma.addRow(datos);
        tblListadoIdioma.setModel(modeloIdioma);

    }//GEN-LAST:event_btnAgregarIdiomaActionPerformed

    private void btnQuitarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarIdiomaActionPerformed

        int pos = tblListadoIdioma.getSelectedRow();

        if (pos >= 0) {
            modeloIdioma.removeRow(pos);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un idioma");
        }
    }//GEN-LAST:event_btnQuitarIdiomaActionPerformed

    private void RegistroPostulante() {
        try {
            if (txtApellidoPaterno.getText().isEmpty() || txtApellidoMaterno.getText().isEmpty() || txtNombres.getText().isEmpty() || txtColegiatura.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene todos los campos");
            } else {
                objP = new Postulante();

                EntidadTipoDocumento documento = (EntidadTipoDocumento) cboTipoDocumento.getSelectedItem();
                objP.setTipo_documento_id(documento.getTipo_documento_id());

                objP.setApellido_paterno(txtApellidoPaterno.getText());
                objP.setApellido_materno(txtApellidoMaterno.getText());
                objP.setNombres(txtNombres.getText());

                objP.setNumero_documento(txtID.getText());
                objP.setContra(contraseña);

                objU = new Ubigeo();
                objU.setDepartamento(cboDepartamento.getSelectedItem().toString());
                objU.setProvincia(cboProvincia.getSelectedItem().toString());
                objU.setDistrito(cboDistrito.getSelectedItem().toString());
                int idU = objU.buscarUbigeo();
                objP.setUbigeo_id(idU);

                EntidadPais pais = (EntidadPais) cboPais.getSelectedItem();
                objP.setPais_id(pais.getPais_id());

                EntidadCategoriaProfesion categoria = (EntidadCategoriaProfesion) cboProfesionPostulante.getSelectedItem();
                objP.setProfesion_categoria(categoria.getCategoria_id());

                objP.setNumero_colegiatura(Integer.parseInt(txtColegiatura.getText()));

                if (!imagenselect.isEmpty()) {
                    objP.setLink_foto(imagenselect);
                }

                idpostulante = objP.insertarPostulante();
                JOptionPane.showMessageDialog(this, "Se registró el postulante");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void RegistroIdioma() {
        try {
            if (tblListadoIdioma.getRowCount() > 0) {
                for (int i = 0; i < tblListadoIdioma.getRowCount(); i++) {
                    Idioma objI = new Idioma();
                    objI.setIdioma(tblListadoIdioma.getValueAt(i, 0).toString());
                    objI.setNivel(tblListadoIdioma.getValueAt(i, 1).toString());
                    objI.setLink_archivo(tblListadoIdioma.getValueAt(i, 2).toString());
                    System.out.println("El id del postulante: " + idpostulante);
                    objI.setPostulante_id(idpostulante);
                    objI.insertarIdioma();
                    JOptionPane.showMessageDialog(this, "Se registró el idioma");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe agregar al menos un idioma");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void RegistroProfesion() {
        try {
            if (txtFechaObtencion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene todos los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void RegistroExperiencia() {
        try {
            if (txtFechaI.getText().isEmpty() || txtFechaS.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene todos los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void llenarCombos() {
        try {

            objU = new Ubigeo();
            ArrayList<String> departamentos = objU.departamentosUbigeo();
            cboDepartamento.setModel(new DefaultComboBoxModel(departamentos.toArray()));

            Pais objPais = new Pais();
            ArrayList<EntidadPais> paises = objPais.llenarPais();
            cboPais.setModel(new DefaultComboBoxModel(paises.toArray()));

            CategoriaProfesion objCP = new CategoriaProfesion();
            ArrayList<EntidadCategoriaProfesion> categorias = objCP.llenarCategorias();
            cboProfesion.setModel(new DefaultComboBoxModel(categorias.toArray()));
            cboProfesionPostulante.setModel(new DefaultComboBoxModel(categorias.toArray()));

            TipoDocumento objTD = new TipoDocumento();
            ArrayList<EntidadTipoDocumento> documentos = objTD.llenarDocumentos();
            cboTipoDocumento.setModel(new DefaultComboBoxModel(documentos.toArray()));

            Universidad objUni = new Universidad();
            ArrayList<EntidadUniversidad> universidades = objUni.llenarUniversidad();
            cboUniversidad.setModel(new DefaultComboBoxModel(universidades.toArray()));

            GradoAcademico objGA = new GradoAcademico();
            ArrayList<EntidadGradoAcademico> grados = objGA.llenarGrados();
            cboGradoA.setModel(new DefaultComboBoxModel(grados.toArray()));

            Empresa objEm = new Empresa();
            ArrayList<EntidadEmpresa> empresas = objEm.llenarEmpresas();
            cboEmpresa.setModel(new DefaultComboBoxModel(empresas.toArray()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void grabarImagen() {
        JFileChooser imagenseleccionada = new JFileChooser();
        int seleccion = imagenseleccionada.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File imagen = imagenseleccionada.getSelectedFile();
            if (obtenerExtension(imagen).equalsIgnoreCase("png") || obtenerExtension(imagen).equalsIgnoreCase("jpg") || obtenerExtension(imagen).equalsIgnoreCase("gif")) {
                StringBuilder path = new StringBuilder();
                path.append(imagen.getAbsolutePath());
                imagenselect = path.toString();
            } else {
                JOptionPane.showMessageDialog(this, "La imagen debe ser PNG, JPG o GIF");
                imagenselect = "";
            }
        }

    }

    private void grabarArchivo() {
        JFileChooser archivoseleccionado = new JFileChooser();
        int seleccion = archivoseleccionado.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File imagen = archivoseleccionado.getSelectedFile();
            StringBuilder path = new StringBuilder();
            path.append(imagen.getAbsolutePath());
            archivoIdiomaselect = path.toString();
        }

    }

    private String obtenerExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }

    private void habilitarPanelPostulante() {
        panelPostulante.setVisible(true);
        panelIdiomas.setVisible(false);
        PanelProfesion.setVisible(false);
        panelExperiencia.setVisible(false);
    }

    private void habilitarPanelIdiomas() {
        panelPostulante.setVisible(false);
        panelIdiomas.setVisible(true);
        PanelProfesion.setVisible(false);
        panelExperiencia.setVisible(false);
    }

    private void habilitarPanelProfesion() {
        panelPostulante.setVisible(false);
        panelIdiomas.setVisible(false);
        PanelProfesion.setVisible(true);
        panelExperiencia.setVisible(false);
    }

    private void habilitarPanelExperiencia() {
        panelPostulante.setVisible(false);
        panelIdiomas.setVisible(false);
        PanelProfesion.setVisible(false);
        panelExperiencia.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRegistroPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroPostulante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelProfesion;
    private javax.swing.JButton btnAgregarEL;
    private javax.swing.JButton btnAgregarIdioma;
    private javax.swing.JButton btnArchivoEL;
    private javax.swing.JButton btnArchivoIdioma;
    private javax.swing.JButton btnArchivoProfesion;
    private javax.swing.JComboBox<String> btnCargo;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnQuitarEL;
    private javax.swing.JButton btnQuitarIdioma;
    private javax.swing.JButton btnSeleccionarFoto;
    private javax.swing.JButton btnSiguienteIdiomas;
    private javax.swing.JButton btnSiguientePostulante;
    private javax.swing.JButton btnSiguienteProfesion;
    private javax.swing.JButton btnVerEL;
    private javax.swing.JButton btnVerFoto;
    private javax.swing.JButton btnVerIdioma;
    private javax.swing.JButton btnVerProfesion;
    private javax.swing.JComboBox<String> cboDepartamento;
    private javax.swing.JComboBox<String> cboDistrito;
    private javax.swing.JComboBox<String> cboEmpresa;
    private javax.swing.JComboBox<String> cboGradoA;
    private javax.swing.JComboBox<String> cboIdioma;
    private javax.swing.JComboBox<String> cboNivel;
    private javax.swing.JComboBox<String> cboPais;
    private javax.swing.JComboBox<String> cboProfesion;
    private javax.swing.JComboBox<String> cboProfesionPostulante;
    private javax.swing.JComboBox<String> cboProvincia;
    private javax.swing.JComboBox<String> cboTipoDocumento;
    private javax.swing.JComboBox<String> cboUniversidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelExperiencia;
    private javax.swing.JPanel panelIdiomas;
    private javax.swing.JPanel panelPostulante;
    private javax.swing.JTable tblListadoIdioma;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtColegiatura;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JFormattedTextField txtFechaI;
    private javax.swing.JFormattedTextField txtFechaObtencion;
    private javax.swing.JFormattedTextField txtFechaS;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
