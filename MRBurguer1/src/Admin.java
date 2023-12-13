/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import com.mysql.jdbc.Connection;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.*;
import java.awt.print.PrinterJob;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Locale;

public class Admin extends javax.swing.JFrame implements Printable {

    String url;
    String user;
    String pass;
    Connection conectar;
    Statement sentencia;
    DefaultTableModel modelo;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Admin() {
        initComponents();
        setLocationRelativeTo(null);
        url = "jdbc:mysql://127.0.0.1:3607/prueba";
        user = "root";
        pass = "";      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnDia = new javax.swing.JButton();
        btnMes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        lblMarcaDia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMarcaMes = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        recibo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar1 = new javax.swing.JButton();
        btnPDFDia = new javax.swing.JButton();
        btnAbrirPDFDia = new javax.swing.JButton();
        btnPDFMes = new javax.swing.JButton();
        btnAbrirPDFMes = new javax.swing.JButton();
        txtAño = new javax.swing.JTextField();
        lblAño = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mr BurguerJ: Ventana de Administrador");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 6));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-1.png"))); // NOI18N

        btnDia.setBackground(new java.awt.Color(0, 0, 0));
        btnDia.setForeground(new java.awt.Color(255, 255, 0));
        btnDia.setText("BUSCAR");
        btnDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        btnDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiaMouseClicked(evt);
            }
        });
        btnDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiaActionPerformed(evt);
            }
        });

        btnMes.setBackground(new java.awt.Color(0, 0, 0));
        btnMes.setForeground(new java.awt.Color(255, 255, 0));
        btnMes.setText("BUSCAR");
        btnMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        btnMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMesMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("REPORTES DE FECHA");

        txtDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiaMouseClicked(evt);
            }
        });
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        lblMarcaDia.setForeground(new java.awt.Color(255, 255, 0));
        lblMarcaDia.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("REPORTE DEL MES");

        lblMarcaMes.setForeground(new java.awt.Color(255, 255, 0));
        lblMarcaMes.setEnabled(false);

        txtMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMesMouseClicked(evt);
            }
        });

        btnConectar.setBackground(new java.awt.Color(0, 0, 0));
        btnConectar.setForeground(new java.awt.Color(255, 255, 0));
        btnConectar.setText("CONECTAR CON LA BASE DE DATOS");
        btnConectar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 0));
        btnLimpiar.setText("LIMPIAR CONTENIDO");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        recibo.setBackground(new java.awt.Color(0, 0, 0,80));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO. ORDEN", "FECHA", "NOMBRE DEL CLIENTE", "PLATILLO", "CANTIDAD", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("REPORTE DEL PEDIDO ");

        javax.swing.GroupLayout reciboLayout = new javax.swing.GroupLayout(recibo);
        recibo.setLayout(reciboLayout);
        reciboLayout.setHorizontalGroup(
            reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reciboLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reciboLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        reciboLayout.setVerticalGroup(
            reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reciboLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRegresar1.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar1.setForeground(new java.awt.Color(255, 255, 0));
        btnRegresar1.setText("REGRESAR AL INICIO");
        btnRegresar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnRegresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresar1MouseClicked(evt);
            }
        });

        btnPDFDia.setBackground(new java.awt.Color(0, 0, 0));
        btnPDFDia.setForeground(new java.awt.Color(255, 255, 0));
        btnPDFDia.setText("Generar PDF");
        btnPDFDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        btnPDFDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPDFDiaMouseClicked(evt);
            }
        });

        btnAbrirPDFDia.setBackground(new java.awt.Color(0, 0, 0));
        btnAbrirPDFDia.setForeground(new java.awt.Color(255, 255, 0));
        btnAbrirPDFDia.setText("Abrir PDF");
        btnAbrirPDFDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        btnAbrirPDFDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirPDFDiaMouseClicked(evt);
            }
        });

        btnPDFMes.setBackground(new java.awt.Color(0, 0, 0));
        btnPDFMes.setForeground(new java.awt.Color(255, 255, 0));
        btnPDFMes.setText("Generar PDF");
        btnPDFMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        btnPDFMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPDFMesMouseClicked(evt);
            }
        });

        btnAbrirPDFMes.setBackground(new java.awt.Color(0, 0, 0));
        btnAbrirPDFMes.setForeground(new java.awt.Color(255, 255, 0));
        btnAbrirPDFMes.setText("Abrir PDF");
        btnAbrirPDFMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        btnAbrirPDFMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirPDFMesMouseClicked(evt);
            }
        });

        txtAño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAñoMouseClicked(evt);
            }
        });

        lblAño.setForeground(new java.awt.Color(255, 255, 0));
        lblAño.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDia)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPDFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnAbrirPDFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPDFMes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAbrirPDFMes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMarcaMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMes)
                            .addComponent(lblMarcaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAño)
                            .addComponent(lblAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnConectar)
                        .addGap(138, 138, 138)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMarcaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAbrirPDFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPDFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMarcaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAño, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPDFMes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbrirPDFMes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
static void mensaje(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }
    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        mensaje("Conectando...");
        try {
            conectar = (Connection) DriverManager.getConnection(url, user, pass);
            mensaje("Conección exitosa");
            sentencia = conectar.createStatement();
        } catch (SQLException e) {
            mensaje("ERROR..." + e.getMessage());
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void txtDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaMouseClicked
        // TODO add your handling code here:
        //cuando el Administrador de click en la caja de texto se mostrará en un label el siguiente texto
              lblMarcaDia.setText("INGRESE lA FECHA YYYY/MM/DD");
               txtDia.setText("");
        //borrar todas las filas de la Tabla
                modelo.getDataVector().removeAllElements();
                //Actualizar la interfaz grafica de la Tabla
                Tabla.updateUI();
    }//GEN-LAST:event_txtDiaMouseClicked

    private void txtMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMesMouseClicked
        // TODO add your handling code here:
        //cuando el Administrador de click en la caja de texto se mostrará en un label el siguiente texto
        lblMarcaMes.setText("INGRESE LA FECHA MONTH(MES)");
        txtMes.setText("");
        //borrar todas las filas de la Tabla
                modelo.getDataVector().removeAllElements();
                //Actualizar la interfaz grafica de la Tabla
                Tabla.updateUI();
    }//GEN-LAST:event_txtMesMouseClicked

    private void btnDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiaMouseClicked
        // TODO add your handling code here:
        String qrySelect;
        ResultSet resultado;
        qrySelect = "select *from pedido where fecha=" + "'" + txtDia.getText() + "'";

        try {
        
            //Extraemos los datos de la tabla en la base de datos y los metemos en el jTable
            resultado = sentencia.executeQuery(qrySelect);
            Object[] pedido = new Object[6];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (resultado.next()) {
                pedido[0] = resultado.getString("num_orden");
                pedido[1] = resultado.getString("fecha");
                pedido[2] = resultado.getString("nombre_cliente");
                pedido[3] = resultado.getString("platillo");
                pedido[4] = resultado.getString("cantidad");
                pedido[5] = resultado.getString("precio");
                //cambiar el ancho de la columna
                Tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
                Tabla.getColumnModel().getColumn(1).setPreferredWidth(1);
                Tabla.getColumnModel().getColumn(2).setPreferredWidth(160);
                Tabla.getColumnModel().getColumn(4).setPreferredWidth(60);
                Tabla.getColumnModel().getColumn(5).setPreferredWidth(1);
                //hacer que algunas columnas no se puedan modificar su ancho
                Tabla.getColumnModel().getColumn(1).setResizable(false);
                Tabla.getColumnModel().getColumn(2).setResizable(false);
                Tabla.getColumnModel().getColumn(3).setResizable(false);
                Tabla.getColumnModel().getColumn(5).setResizable(false);
                //ajustar en el centro la columna
                DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
                cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                Tabla.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
                Tabla.getColumnModel().getColumn(5).setCellRenderer(cellRenderer);
                modelo.addRow(pedido);
                
            }
            Tabla.setModel(modelo);
        } catch (SQLException e) {
            mensaje("ERROR..." + e.getMessage());
        }

    }//GEN-LAST:event_btnDiaMouseClicked

    private void btnMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesMouseClicked
        // TODO add your handling code here:
        String qrySelect;
        ResultSet resultado;
        qrySelect = "select *from pedido where month(fecha)=" + "'" + txtMes.getText() + "'"+" and year(fecha)="+ "'" +txtAño.getText()+"'";
        try {
            resultado = sentencia.executeQuery(qrySelect);
            Object[] pedido = new Object[6];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (resultado.next()) {
                pedido[0] = resultado.getString("num_orden");
                pedido[1] = resultado.getString("fecha");
                pedido[2] = resultado.getString("nombre_cliente");
                pedido[3] = resultado.getString("platillo");
                pedido[4] = resultado.getString("cantidad");
                pedido[5] = resultado.getString("precio");
                //cambiar el ancho de la columna
                Tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
                Tabla.getColumnModel().getColumn(1).setPreferredWidth(1);
                Tabla.getColumnModel().getColumn(2).setPreferredWidth(160);
                Tabla.getColumnModel().getColumn(4).setPreferredWidth(60);
                Tabla.getColumnModel().getColumn(5).setPreferredWidth(1);
                //hacer que algunas columnas no se puedan modificar su ancho
                Tabla.getColumnModel().getColumn(1).setResizable(false);
                Tabla.getColumnModel().getColumn(2).setResizable(false);
                Tabla.getColumnModel().getColumn(3).setResizable(false);
                Tabla.getColumnModel().getColumn(5).setResizable(false);
                //ajustar en el centro la columna
                DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
                cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                Tabla.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
                Tabla.getColumnModel().getColumn(5).setCellRenderer(cellRenderer);
                modelo.addRow(pedido);
            }
            Tabla.setModel(modelo);
       
        } catch (SQLException e) {
            mensaje("ERROR..." + e.getMessage());
        }
    }//GEN-LAST:event_btnMesMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        //borrar todas las filas de la Tabla
        modelo.getDataVector().removeAllElements();
        //Actualizar la interfaz grafica de la Tabla
        Tabla.updateUI();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnRegresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresar1MouseClicked
        // TODO add your handling code here:
        inicioDesesionGeneral inicio = new inicioDesesionGeneral();
        inicio.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnRegresar1MouseClicked

    private void btnPDFDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFDiaMouseClicked
        // TODO add your handling code here:   
        GenerarPDFDia();       
    }//GEN-LAST:event_btnPDFDiaMouseClicked

    private void btnAbrirPDFDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirPDFDiaMouseClicked
        // TODO add your handling code here:
       AbrirPDFDia();
    }//GEN-LAST:event_btnAbrirPDFDiaMouseClicked

    private void btnPDFMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMesMouseClicked
        // TODO add your handling code here:
        GenerarPDFMes();
    }//GEN-LAST:event_btnPDFMesMouseClicked

    private void btnAbrirPDFMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirPDFMesMouseClicked
        // TODO add your handling code here:
       AbrirPDFMes();
    }//GEN-LAST:event_btnAbrirPDFMesMouseClicked

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void btnDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDiaActionPerformed

    private void txtAñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAñoMouseClicked
        // TODO add your handling code here:
        lblAño.setText("INGRESE LA FECHA EN YEAR(AÑO)");
        txtAño.setText("");
        //borrar todas las filas de la Tabla
                modelo.getDataVector().removeAllElements();
                //Actualizar la interfaz grafica de la Tabla
                Tabla.updateUI();
    }//GEN-LAST:event_txtAñoMouseClicked
    public void GenerarPDFDia(){
    String qrySelect = "select *from pedido where fecha=" + "'" + txtDia.getText() + "'";
        ResultSet resultado;

        documento = new Document();
        titulo = new Paragraph("REPORTE DE PEDIDOS DE LA FECHA "+ txtDia.getText());
        try {
            resultado = sentencia.executeQuery(qrySelect);
            Object[] pedido = new Object[6];
            archivo = new FileOutputStream("PedidoDia.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(6);
            tabla.setWidthPercentage(100);
            PdfPCell num_orden = new PdfPCell(new Phrase("No.Orden"));
            num_orden.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell fecha = new PdfPCell(new Phrase("fecha"));
            fecha.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell nombre_cli = new PdfPCell(new Phrase("nombre cliente"));
            nombre_cli.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell platillo = new PdfPCell(new Phrase("platillo"));
            platillo.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell cantidad = new PdfPCell(new Phrase("cantidad"));
            cantidad.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell precio = new PdfPCell(new Phrase("precio"));
            precio.setBackgroundColor(BaseColor.ORANGE);

            tabla.addCell(num_orden);
            tabla.addCell(fecha);
            tabla.addCell(nombre_cli);
            tabla.addCell(platillo);
            tabla.addCell(cantidad);
            tabla.addCell(precio);
            documento.add(Chunk.NEWLINE);
            while (resultado.next()) {
                tabla.addCell(resultado.getString("num_orden"));
                tabla.addCell(resultado.getString("fecha"));
                tabla.addCell(resultado.getString("nombre_cliente"));
                tabla.addCell(resultado.getString("platillo"));
                tabla.addCell(resultado.getString("cantidad"));
                tabla.addCell(resultado.getString("precio"));
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "Archivo creado correctamente");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
}
    public void GenerarPDFMes(){
         String qrySelect = "select *from pedido where month(fecha)=" + "'" + txtMes.getText() + "'";
        ResultSet resultado;

        documento = new Document();
        titulo = new Paragraph("REPORTE DE PEDIDOS DEL MES "+txtMes.getText());
        try {
            resultado = sentencia.executeQuery(qrySelect);
            Object[] pedido = new Object[6];
            archivo = new FileOutputStream("PedidoMes.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(6);
            tabla.setWidthPercentage(100);
            PdfPCell num_orden = new PdfPCell(new Phrase("No.Orden"));
            num_orden.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell fecha = new PdfPCell(new Phrase("fecha"));
            fecha.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell nombre_cli = new PdfPCell(new Phrase("nombre cliente"));
            nombre_cli.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell platillo = new PdfPCell(new Phrase("platillo"));
            platillo.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell cantidad = new PdfPCell(new Phrase("cantidad"));
            cantidad.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell precio = new PdfPCell(new Phrase("precio"));
            precio.setBackgroundColor(BaseColor.ORANGE);

            tabla.addCell(num_orden);
            tabla.addCell(fecha);
            tabla.addCell(nombre_cli);
            tabla.addCell(platillo);
            tabla.addCell(cantidad);
            tabla.addCell(precio);
            documento.add(Chunk.NEWLINE);
            while (resultado.next()) {
                tabla.addCell(resultado.getString("num_orden"));
                tabla.addCell(resultado.getString("fecha"));
                tabla.addCell(resultado.getString("nombre_cliente"));
                tabla.addCell(resultado.getString("platillo"));
                tabla.addCell(resultado.getString("cantidad"));
                tabla.addCell(resultado.getString("precio"));
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "Archivo creado correctamente");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void AbrirPDFDia(){
         try {
            File path = new File("PedidoDia.pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Atención", 2);
        }
    }
    public void AbrirPDFMes(){
         try {
            File path = new File("PedidoMes.pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Atención", 2);
        }
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAbrirPDFDia;
    private javax.swing.JButton btnAbrirPDFMes;
    private javax.swing.JButton btnConectar;
    public static javax.swing.JButton btnDia;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMes;
    private javax.swing.JButton btnPDFDia;
    private javax.swing.JButton btnPDFMes;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblMarcaDia;
    private javax.swing.JLabel lblMarcaMes;
    private javax.swing.JPanel recibo;
    private javax.swing.JTextField txtAño;
    public static javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if (index > 0) {
            return NO_SUCH_PAGE;
        }
        
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX() + 20, pagfor.getImageableY() + 20);
        hub.scale(0.6, 0.6);
        
        jScrollPane2.paintAll(graf);
        return PAGE_EXISTS;
        
        
    }
}
