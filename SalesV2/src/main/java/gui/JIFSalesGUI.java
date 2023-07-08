/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Client;
import entities.DetailSales;
import entities.Producto;
import entities.Sales;
import implement.ImplPerson;
import implement.ImplSales;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import resources.Resources;

/**
 *
 * @author LAB REDES
 */
public class JIFSalesGUI extends javax.swing.JInternalFrame {
DefaultTableModel modelo;
    FondoPanel fondo = new FondoPanel();
    Resources r = new Resources();
    Resources re= new Resources();
    ImplSales ims= new ImplSales();
    
    reporteventas reporte = new reporteventas();
    
    public JIFSalesGUI() {        
        this.setContentPane(fondo);
        initComponents();
        
        ReporteDataDB();
        
        instrumentosCombobox();
        
        jButton_Buscar.setVisible(false);
        
    }

    
    public void ReporteDataDB(){
        System.out.println("Reporte de desde db");
                
            modelo = new DefaultTableModel();
            modelo.addColumn("CANTIDAD");
            modelo.addColumn("DESCRIPCION");
            modelo.addColumn("PRECIO UNIT");
            modelo.addColumn("PRECIO TOTAL");
            
                
            jTable1_Sales.setModel(modelo); 
        
           
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Sales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Total_Sales = new javax.swing.JTextField();
        jComboBox_Productos_Sales = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1_Agregar_Sales = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSpinner_cantidad_Sales = new javax.swing.JSpinner();
        jButton_ConfirmarVenta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_NomCliente_Sales = new javax.swing.JTextField();
        jTextField_DireccionSales = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_PrecioUnitario_Sales = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox_Boleta_o_Factura = new javax.swing.JComboBox<>();
        jButton_Buscar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton_limpiartabla = new javax.swing.JButton();
        jButton_limpiartextfield = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ventas de instrumentos musicales");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CANTIDAD", "DESCRIPCION", "PRECIO UNIT", "PRECIO TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1_Sales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1060, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, -1));

        jTextField_Total_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Total_SalesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Total_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 440, 130, 30));

        jComboBox_Productos_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Productos_SalesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_Productos_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 290, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Productos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jButton1_Agregar_Sales.setText("Agregar");
        jButton1_Agregar_Sales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_Agregar_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_Agregar_SalesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_Agregar_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 90, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, 30));
        getContentPane().add(jSpinner_cantidad_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        jButton_ConfirmarVenta.setText("Confirmar Venta");
        jButton_ConfirmarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ConfirmarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConfirmarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Tienda de Repuesto de Autos \"Aros de oro\"");

        jLabel12.setBackground(new java.awt.Color(153, 153, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagTiendInstrumentos/log2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 760, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Total:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagTiendInstrumentos/marc4.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagTiendInstrumentos/marc4.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagTiendInstrumentos/marc4.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagTiendInstrumentos/dew9.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 300, 30));

        jTextField_NomCliente_Sales.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_NomCliente_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NomCliente_SalesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_NomCliente_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 297, 45));

        jTextField_DireccionSales.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_DireccionSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DireccionSalesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_DireccionSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 297, 45));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, 130, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagTiendInstrumentos/log3.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 130, 60));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 10, 20));

        jTextField_PrecioUnitario_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PrecioUnitario_SalesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_PrecioUnitario_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, 120, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Precio Unitario:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagTiendInstrumentos/dew9.jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 140, -1));

        jComboBox_Boleta_o_Factura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura" }));
        getContentPane().add(jComboBox_Boleta_o_Factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 210, 50));

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagTiendInstrumentos/dew9.jpg"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Comprobante:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagTiendInstrumentos/dew9.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 10, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 300, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 120, 30));

        jButton_limpiartabla.setText("Limpiar Tabla");
        jButton_limpiartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiartablaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_limpiartabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, -1, -1));

        jButton_limpiartextfield.setText("Limpiar");
        jButton_limpiartextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiartextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_limpiartextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Total_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Total_SalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Total_SalesActionPerformed

    private void jComboBox_Productos_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Productos_SalesActionPerformed
        
        
    }//GEN-LAST:event_jComboBox_Productos_SalesActionPerformed

    public void instrumentosCombobox(){
        
        for (Producto pr : ims.reporteProducto()){
            
            jComboBox_Productos_Sales.addItem(pr.getProd_nombre());
            
        }
     
    }
    
    
    private void jTextField_NomCliente_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NomCliente_SalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NomCliente_SalesActionPerformed

    private void jTextField_DireccionSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DireccionSalesActionPerformed
        
       
        
    }//GEN-LAST:event_jTextField_DireccionSalesActionPerformed

    private void jButton1_Agregar_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_Agregar_SalesActionPerformed

        if(jSpinner_cantidad_Sales.getValue().equals(0)||
           jTextField_PrecioUnitario_Sales.getText().equals("")){
        
            JOptionPane.showMessageDialog(null, "Ingrese datos completos y/o validos");
        }else{
            
            
        Object[] fila = new Object[4];
        fila[0]= jSpinner_cantidad_Sales.getValue().toString();
        fila[1]= jComboBox_Productos_Sales.getSelectedItem().toString();
        fila[2]= jTextField_PrecioUnitario_Sales.getText();
        fila[3]= Double.parseDouble(jSpinner_cantidad_Sales.getValue().toString()) * Double.parseDouble(jTextField_PrecioUnitario_Sales.getText());
           
    modelo.addRow(fila);
    
    jTable1_Sales.setModel(modelo);
    
    sumarvaloresmetodo();
        
        }
        
        
    
    }//GEN-LAST:event_jButton1_Agregar_SalesActionPerformed

    public void sumarvaloresmetodo(){
        
        Double sumatotalvalores = 0.0;
        for (int i = 0; i < jTable1_Sales.getRowCount(); i++) {
           
            Double valores = Double.parseDouble(jTable1_Sales.getValueAt(i, 3).toString());
            
            
            sumatotalvalores = sumatotalvalores+valores;

        }
        
         jTextField_Total_Sales.setText(sumatotalvalores.toString());
        
    }
    
    private void jButton_ConfirmarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmarVentaActionPerformed
            if(jTextField_NomCliente_Sales.getText().equals("")||
               jTextField_DireccionSales.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
            
            }else{
                
            String detalle_id="";
            Sales sales= new Sales();            
            Client cl= new Client();
            ArrayList<DetailSales> ld= new ArrayList<>();
            double total=0;  
            
            for (int i = 0; i < jTable1_Sales.getRowCount(); i++) {
                System.out.println("dsd"+i);
                r= new Resources();
                DetailSales ds= new DetailSales();
                ds.setDetailsales_id(i+""+r.generaID());
                ds.setDetailsales_cantidad( Double.parseDouble(   jTable1_Sales.getValueAt(i, 0).toString()   ));  
                ds.setDetailsales_descripcion(jTable1_Sales.getValueAt(i, 1).toString() );                
                ds.setDetailsales_preciounitario(Double.parseDouble(jTable1_Sales.getValueAt(i, 2).toString() ));                
                ds.setDetailsales_precioitem(Double.parseDouble( jTable1_Sales.getValueAt(i,3).toString() ));
                
                total= total+ds.getDetailsales_precioitem();
                ld.add(ds);
                
            }
            ImplSales is= new ImplSales();
            Resources reso = new Resources();
            cl.setPerson_nombres(jTextField_NomCliente_Sales.getText());
            
            sales.setSales_id(reso.generaID());
            sales.setSales_importetotal(total);
            sales.setSales_client(cl);            
            sales.setSales_tipocomprobante(jComboBox_Boleta_o_Factura.getSelectedItem().toString());
            
            String boletaofacturaBF = "";
            if(jComboBox_Boleta_o_Factura.getSelectedItem().toString().equals("Boleta")){
            boletaofacturaBF = "B";
            }
            if(jComboBox_Boleta_o_Factura.getSelectedItem().toString().equals("Factura")){
            boletaofacturaBF = "F";
            }
            
            sales.setSales_serie(boletaofacturaBF);
            sales.setListDetailSales(ld);
            sales.setSales_numeroventa(""+is.numeroVta("B"));
            
                  
            is.registrarSales(sales);
            
            limpiartodo();
            
            JOptionPane.showMessageDialog(null, "Se confirmo la venta");
            
            reporte.setLocation(400, 100);          
            reporte.show();
            
          /*  
            for(DetailSales d :ld){
                System.out.println("ld cargado datos :"+d.getDetailsales_id());
                System.out.println("ld cargado datos :"+d.getDetailsales_cantidad());
                System.out.println(" :"+d.getDetailsales_descripcion());
                System.out.println(" :"+d.getDetailsales_preciounitario());
                System.out.println(" :"+d.getDetailsales_precioitem());
            }   
        System.out.println("total"+total);
        
        */

            }
            
            
    }//GEN-LAST:event_jButton_ConfirmarVentaActionPerformed

    public void limpiartodo(){
        
        modelo.getDataVector().removeAllElements();
        jTable1_Sales.updateUI();
        jTextField_PrecioUnitario_Sales.setText("");
        jTextField_Total_Sales.setText("");
        
        jTextField_NomCliente_Sales.setText("");
        jTextField_DireccionSales.setText("");
    }
    
    public void limpiarTablaYtextfieldtotal(){
    
        modelo.getDataVector().removeAllElements();
        jTable1_Sales.updateUI();
        jTextField_PrecioUnitario_Sales.setText("");
        jTextField_Total_Sales.setText("");
       
    }
    
    public void limpiarsolotextfielddatoscliente(){
    
        jTextField_NomCliente_Sales.setText("");
        jTextField_DireccionSales.setText("");
        
    }
    
    private void jTextField_PrecioUnitario_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PrecioUnitario_SalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PrecioUnitario_SalesActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
      
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_limpiartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiartablaActionPerformed
       
        limpiarTablaYtextfieldtotal();
        
    }//GEN-LAST:event_jButton_limpiartablaActionPerformed

    private void jButton_limpiartextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiartextfieldActionPerformed
        limpiarsolotextfielddatoscliente();
    }//GEN-LAST:event_jButton_limpiartextfieldActionPerformed

    
   
    class FondoPanel extends JPanel{
    
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/ImagTiendInstrumentos/back sales.jpeg")).getImage();
        
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
        
            setOpaque(false);
            
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Agregar_Sales;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_ConfirmarVenta;
    private javax.swing.JButton jButton_limpiartabla;
    private javax.swing.JButton jButton_limpiartextfield;
    private javax.swing.JComboBox<String> jComboBox_Boleta_o_Factura;
    public javax.swing.JComboBox<String> jComboBox_Productos_Sales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner jSpinner_cantidad_Sales;
    private javax.swing.JTable jTable1_Sales;
    private javax.swing.JTextField jTextField_DireccionSales;
    private javax.swing.JTextField jTextField_NomCliente_Sales;
    private javax.swing.JTextField jTextField_PrecioUnitario_Sales;
    private javax.swing.JTextField jTextField_Total_Sales;
    // End of variables declaration//GEN-END:variables
}
