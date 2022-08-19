package Ventanas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import java.awt.HeadlessException;
import java.io.IOException;
       
public class Planilla extends javax.swing.JFrame {

    public static DefaultTableModel model;
    String[] NA= new String[3];
    int con = 0, hrs,val,bruto, ROW;
    double por, bono,SPN, neto;
    Character c;
    
    
    public Planilla() {
        initComponents();
        this.getContentPane().setBackground(new Color(54,141,199) );
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
        this.setTitle("PLANILLA DE TRABAJADORES");  
        model = (DefaultTableModel)tblPlanilla.getModel();  
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbtnSoltero = new javax.swing.JRadioButton();
        rbtnCasado = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVal_Hrs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCant_Hrs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlanilla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(34, 87, 122));
        setMaximumSize(new java.awt.Dimension(1076, 577));
        setMinimumSize(new java.awt.Dimension(1076, 577));
        setResizable(false);
        setSize(new java.awt.Dimension(1076, 577));

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COMOLSA S.A.C");

        jPanel1.setBackground(new java.awt.Color(54, 141, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), "Datos del trabajador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 3, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");

        txtNom.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomMousePressed(evt);
            }
        });
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");

        txtApe.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtApe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApeMousePressed(evt);
            }
        });
        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado civil:");

        rbtnSoltero.setBackground(new java.awt.Color(54, 141, 199));
        buttonGroup1.add(rbtnSoltero);
        rbtnSoltero.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        rbtnSoltero.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSoltero.setSelected(true);
        rbtnSoltero.setText("Soltero(a)");
        rbtnSoltero.setEnabled(false);
        rbtnSoltero.setFocusPainted(false);
        rbtnSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSolteroActionPerformed(evt);
            }
        });

        rbtnCasado.setBackground(new java.awt.Color(54, 141, 199));
        buttonGroup1.add(rbtnCasado);
        rbtnCasado.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        rbtnCasado.setForeground(new java.awt.Color(255, 255, 255));
        rbtnCasado.setText("Casado(a)");
        rbtnCasado.setEnabled(false);
        rbtnCasado.setFocusPainted(false);
        rbtnCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCasadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnSoltero)
                    .addComponent(rbtnCasado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(rbtnSoltero))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(rbtnCasado)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(54, 141, 199));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), "Información de trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 3, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(533, 123));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de horas trabajadas:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor de hora:");

        txtVal_Hrs.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtVal_Hrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtVal_HrsMousePressed(evt);
            }
        });
        txtVal_Hrs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVal_HrsKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("S/");

        txtCant_Hrs.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtCant_Hrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCant_HrsMousePressed(evt);
            }
        });
        txtCant_Hrs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCant_HrsKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVal_Hrs, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(txtCant_Hrs))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCant_Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVal_Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PLANILLA DE REMUNERACIONES");

        jPanel3.setBackground(new java.awt.Color(54, 141, 199));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        tblPlanilla.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        tblPlanilla.getTableHeader().setFont(new java.awt.Font("TW Cen MT", 0, 14));
        tblPlanilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellidos", "Est. Civil", "Hrs. Trabajadas", "Valor de hora", "Sueldo Bruto", "SNP", "Bono", "Sueldo Neto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPlanilla.setInheritsPopupMenu(true);
        tblPlanilla.setRowHeight(20);
        tblPlanilla.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblPlanilla.setShowGrid(true);
        tblPlanilla.getTableHeader().setReorderingAllowed(false);
        tblPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlanillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPlanilla);
        if (tblPlanilla.getColumnModel().getColumnCount() > 0) {
            tblPlanilla.getColumnModel().getColumn(0).setResizable(false);
            tblPlanilla.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblPlanilla.getColumnModel().getColumn(1).setResizable(false);
            tblPlanilla.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblPlanilla.getColumnModel().getColumn(2).setResizable(false);
            tblPlanilla.getColumnModel().getColumn(3).setResizable(false);
            tblPlanilla.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblPlanilla.getColumnModel().getColumn(4).setResizable(false);
            tblPlanilla.getColumnModel().getColumn(5).setResizable(false);
            tblPlanilla.getColumnModel().getColumn(6).setResizable(false);
            tblPlanilla.getColumnModel().getColumn(6).setPreferredWidth(50);
            tblPlanilla.getColumnModel().getColumn(7).setResizable(false);
            tblPlanilla.getColumnModel().getColumn(7).setPreferredWidth(50);
            tblPlanilla.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(54, 141, 199));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        btnAgregar.setBackground(new java.awt.Color(34, 87, 122));
        btnAgregar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("");
        btnAgregar.setAutoscrolls(true);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setEnabled(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAgregarMouseReleased(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(34, 87, 122));
        btnEliminar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setAutoscrolls(true);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setEnabled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEliminarMouseReleased(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(34, 87, 122));
        btnEditar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.setEnabled(false);
        btnEditar.setFocusPainted(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditarMouseReleased(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(34, 87, 122));
        btnImprimir.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorderPainted(false);
        btnImprimir.setEnabled(false);
        btnImprimir.setFocusPainted(false);
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImprimirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnImprimirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnImprimirMouseReleased(evt);
            }
        });
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(394, 394, 394))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(173, 173, 173)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSolteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSolteroActionPerformed

    private void rbtnCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCasadoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        try{
            if ( !txtVal_Hrs.getText().isEmpty() && !txtCant_Hrs.getText().isEmpty() && Integer.parseInt(txtCant_Hrs.getText()) <= 48 && Integer.parseInt(txtCant_Hrs.getText()) > 0) {
                NA[0] = txtNom.getText();
                NA[1] = txtApe.getText();

                if (rbtnSoltero.isSelected()) {
                    NA[2] = rbtnSoltero.getText();
                    por = 0;
                }else if (rbtnCasado.isSelected()) {
                    NA[2] = rbtnCasado.getText();
                    por = 0.07;
                }


                hrs = Integer.parseInt(txtCant_Hrs.getText());
                val = Integer.parseInt(txtVal_Hrs.getText());
                bruto = hrs*val;
                SPN = bruto*0.13;
                bono = bruto*por;
                neto = (bruto-SPN)+bono;
                double rpor = Math.round(por*100.0)/100.0;
                double rSPN = Math.round(SPN*100.0)/100.0;
                double rbono = Math.round(bono*100.0)/100.0;
                double rneto = Math.round(neto*100.0)/100.0;
                
                model.addRow(NA);
                model.setValueAt(hrs,con,3);
                model.setValueAt(val,con,4);
                model.setValueAt(bruto,con,5);
                model.setValueAt(rSPN,con,6);
                model.setValueAt(rbono,con,7);
                model.setValueAt(rneto,con,8);
                
                con++;
                txtNom.setText("");
                txtApe.setText("");
                txtVal_Hrs.setText("");
                txtCant_Hrs.setText("");
                btnAgregar.setEnabled(false);
                rbtnSoltero.setEnabled(false);
                rbtnCasado.setEnabled(false);
            }else if (Integer.parseInt(txtCant_Hrs.getText()) > 48){
                JOptionPane.showMessageDialog(null, "La cantidad de horas no puede exceder a 48hrs ", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Por favor, ingrese correctamente los datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese correctamente los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblPlanillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlanillaMouseClicked
        btnEliminar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnImprimir.setEnabled(true);
    }//GEN-LAST:event_tblPlanillaMouseClicked

    private void txtNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyReleased
        if (!txtNom.getText().isEmpty() && !txtApe.getText().isEmpty()) {
            btnAgregar.setEnabled(true);
            rbtnSoltero.setEnabled(true);
            rbtnCasado.setEnabled(true);
        }else{
            btnAgregar.setEnabled(false);
            rbtnSoltero.setEnabled(false);
            rbtnCasado.setEnabled(false);
        }
    }//GEN-LAST:event_txtNomKeyReleased

    private void txtApeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyReleased
        if (!txtNom.getText().isEmpty() && !txtApe.getText().isEmpty()) {
            btnAgregar.setEnabled(true);
            rbtnSoltero.setEnabled(true);
            rbtnCasado.setEnabled(true);
        }else{
            btnAgregar.setEnabled(false);
            rbtnSoltero.setEnabled(false);
            rbtnCasado.setEnabled(false);
        }
        
    }//GEN-LAST:event_txtApeKeyReleased

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        c = evt.getKeyChar();
        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_txtNomKeyTyped

    private void txtVal_HrsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVal_HrsKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
                evt.consume();
        }
    }//GEN-LAST:event_txtVal_HrsKeyTyped

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        if (btnAgregar.isEnabled()) {
            btnAgregar.setBackground(new java.awt.Color(15,125,197));
        }
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        if (btnAgregar.isEnabled()) {
            btnAgregar.setBackground(new java.awt.Color(169,221,255));
        }
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnAgregarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseReleased
        btnAgregar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnAgregarMouseReleased

    
    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        if (btnEliminar.isEnabled()) {
            btnEliminar.setBackground(new java.awt.Color(15,125,197));
        }
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        if (btnEliminar.isEnabled()) {
            btnEliminar.setBackground(new java.awt.Color(169,221,255));
        }
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        btnEliminar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnEliminarMouseReleased

    
    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        if (btnEditar.isEnabled()) {
            btnEditar.setBackground(new java.awt.Color(15,125,197));
        }
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        if (btnEditar.isEnabled()) {
            btnEditar.setBackground(new java.awt.Color(169,221,255));
        }
    }//GEN-LAST:event_btnEditarMousePressed

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
        btnEditar.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnEditarMouseReleased

    
    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        if (btnImprimir.isEnabled()) {
            btnImprimir.setBackground(new java.awt.Color(15,125,197));
        }
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        btnImprimir.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnImprimirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMousePressed
        if (btnImprimir.isEnabled()) {
            btnImprimir.setBackground(new java.awt.Color(169,221,255));
        }
    }//GEN-LAST:event_btnImprimirMousePressed

    private void btnImprimirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseReleased
        btnImprimir.setBackground(new java.awt.Color(34,87,122));
    }//GEN-LAST:event_btnImprimirMouseReleased

    private void txtCant_HrsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCant_HrsKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        if (txtCant_Hrs.getText().length()>=2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCant_HrsKeyTyped

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Document documento = new Document();
        int n = tblPlanilla.getSelectedRow();
        try{
            String ruta =System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Boleta_Trabajador"+String.valueOf(model.getValueAt(n,0))+".pdf"));
            
            Image header = Image.getInstance("src/Imagenes/Head.png");
            header.scaleToFit(200, 300);
            header.setAlignment(Chunk.ALIGN_LEFT);
            
            Font fuente= new Font();
            fuente.setSize(30);
            fuente.setColor(BaseColor.DARK_GRAY);
            
            Font fuente1 = new Font();
            fuente1.setSize(18);
            fuente1.setColor(BaseColor.BLACK);
            
            Font fuente2 = new Font();
            fuente2.setSize(22);
            fuente2.setColor(BaseColor.BLACK);
            
            Paragraph parrafo = new Paragraph("\nBOLETA DE PAGO\n\n", fuente);
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            
            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell("Horas Trabajadas");            
            tabla.addCell("Valor de Horas");
            tabla.addCell("Sueldo Bruto");
            tabla.addCell("SNP");
            tabla.addCell("Bono");
            tabla.addCell("Sueldo Neto ");
            tabla.addCell(String.valueOf(model.getValueAt(n,3)));
            tabla.addCell(String.valueOf(model.getValueAt(n,4)));
            tabla.addCell(String.valueOf(model.getValueAt(n,5)));
            tabla.addCell(String.valueOf(model.getValueAt(n,6)));
            tabla.addCell(String.valueOf(model.getValueAt(n,7)));
            tabla.addCell(String.valueOf(model.getValueAt(n,8)));
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            documento.add(new Paragraph("DATOS DEL TRABAJADOR\n", fuente2));
            documento.add(new Paragraph("Nombre:  "+ String.valueOf(model.getValueAt(n,0)) +"\n", fuente1));
            documento.add(new Paragraph("Apellido:  "+ String.valueOf(model.getValueAt(n,1)) +"\n", fuente1));
            documento.add(new Paragraph("Estado Civil:  "+ String.valueOf(model.getValueAt(n,2)) +"\n\n\n", fuente1));
            documento.add(tabla);
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Boleta generada con éxito");
        }catch (DocumentException | HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar la boleta");
        }
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnImprimir.setEnabled(false);
        tblPlanilla.clearSelection();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tblPlanilla.getSelectedRow() >=0){
            model.removeRow(tblPlanilla.getSelectedRow());
            btnEliminar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnImprimir.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
        tblPlanilla.clearSelection(); 
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblPlanilla.getSelectedRow() >= 0){
            Editar edit = new Editar();
            edit.setVisible(true);
            btnEliminar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnImprimir.setEnabled(false);
            int selec = tblPlanilla.getSelectedRow();
            edit.selected = selec;
            edit.setTxtNewNom(String.valueOf(model.getValueAt(selec,0)));
            edit.setTxtNewApe(String.valueOf(model.getValueAt(selec,1)));
            if (rbtnSoltero.isSelected()) {
                edit.setRbtnNewSoltero(true);
            }else if(rbtnCasado.isSelected()){
                edit.setRbtnNewCasado(true);
            }
            edit.setTxtNewCant_Hrs(String.valueOf(model.getValueAt(selec,3)));
            edit.setTxtNewVal_Hrs(String.valueOf(model.getValueAt(selec,3)));
            
        }else{
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
        tblPlanilla.clearSelection();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtApeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApeMousePressed
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnImprimir.setEnabled(false);
        tblPlanilla.clearSelection();
    }//GEN-LAST:event_txtApeMousePressed

    private void txtNomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomMousePressed
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnImprimir.setEnabled(false);
        tblPlanilla.clearSelection();
    }//GEN-LAST:event_txtNomMousePressed

    private void txtCant_HrsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCant_HrsMousePressed
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnImprimir.setEnabled(false);
        tblPlanilla.clearSelection();
    }//GEN-LAST:event_txtCant_HrsMousePressed

    private void txtVal_HrsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVal_HrsMousePressed
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnImprimir.setEnabled(false);
        tblPlanilla.clearSelection();
    }//GEN-LAST:event_txtVal_HrsMousePressed

    private void txtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyTyped
        c = evt.getKeyChar();
        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_txtApeKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnCasado;
    private javax.swing.JRadioButton rbtnSoltero;
    private javax.swing.JTable tblPlanilla;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCant_Hrs;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtVal_Hrs;
    // End of variables declaration//GEN-END:variables
}
