/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVenta;
import java.sql.Date;
import java.text.DateFormat;
import modelo.Venta;

/**
 *
 * @author Alfonso
 */
public class ModificarVenta extends javax.swing.JFrame {

    /**
     * Creates new form VentaDiaria
     */
    public ModificarVenta() {
        initComponents();
        txt_boletas.setValue((long)0);
        txt_transbank.setValue((long)0);
        txt_total.setValue((long)0);
        
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
        jLabel1 = new javax.swing.JLabel();
        fecha = new datechooser.beans.DateChooserCombo();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        txt_boletas = new javax.swing.JFormattedTextField();
        txt_transbank = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_total = new javax.swing.JFormattedTextField();
        btn_obtenerDatos = new javax.swing.JButton();
        btn_editarBoletas = new javax.swing.JButton();
        btn_editarTransbank = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pili's Coffe | Venta diaria");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar venta diaria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Fecha:");

        fecha.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    fecha.setNothingAllowed(false);
    fecha.setFormat(2);
    fecha.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);
    fecha.setFieldFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 14));
    try {
        fecha.setForbiddenPeriods(new datechooser.model.multiple.PeriodSet());
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    fecha.setNavigateFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 14));

    jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    jLabel2.setText("Boletas:");

    jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    jLabel3.setText("Transbank:");

    btn_ingresar.setText("Ingresar");
    btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_ingresarActionPerformed(evt);
        }
    });

    btn_salir.setText("Salir");
    btn_salir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_salirActionPerformed(evt);
        }
    });

    txt_boletas.setEditable(false);
    txt_boletas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
    txt_boletas.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txt_boletasFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txt_boletasFocusLost(evt);
        }
    });
    txt_boletas.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txt_boletasMouseClicked(evt);
        }
    });
    txt_boletas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_boletasActionPerformed(evt);
        }
    });

    txt_transbank.setEditable(false);
    txt_transbank.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
    txt_transbank.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txt_transbankFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txt_transbankFocusLost(evt);
        }
    });
    txt_transbank.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txt_transbankMouseClicked(evt);
        }
    });

    jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jLabel5.setText("Total:");

    txt_total.setEditable(false);
    txt_total.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
    txt_total.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            txt_totalFocusLost(evt);
        }
    });

    btn_obtenerDatos.setText("Obtener datos");
    btn_obtenerDatos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_obtenerDatosActionPerformed(evt);
        }
    });

    btn_editarBoletas.setText("Editar");
    btn_editarBoletas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_editarBoletasActionPerformed(evt);
        }
    });

    btn_editarTransbank.setText("Editar");
    btn_editarTransbank.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_editarTransbankActionPerformed(evt);
        }
    });

    btn_calcular.setText("Calcular");
    btn_calcular.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_calcularActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3)
                .addComponent(jLabel1)
                .addComponent(jLabel2)
                .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(txt_boletas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_editarBoletas))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(txt_transbank, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_editarTransbank))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_calcular))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_ingresar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_salir))
                        .addComponent(btn_obtenerDatos))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(btn_obtenerDatos))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_boletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarBoletas))
                .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_transbank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarTransbank)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_calcular))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_salir)
                .addComponent(btn_ingresar))
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        Venta venta = new Venta();
        int primero = Math.toIntExact((long) txt_boletas.getValue());
        int segundo = Math.toIntExact((long) txt_transbank.getValue());
        int total = primero + segundo;
        txt_total.setValue(total);
        venta.setBoleta(Math.toIntExact((long) txt_boletas.getValue()));
        venta.setTransbank(Math.toIntExact((long) txt_transbank.getValue()));
        venta.setTotal(venta.getBoleta()+venta.getTransbank());
        venta.setFecha(fecha.getText());
        ControladorVenta ctrlVenta = new ControladorVenta();
        int confirmar =ctrlVenta.modificarVenta(venta);
        if(confirmar == 1)
            this.dispose();
        
            
        
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_boletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_boletasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_boletasActionPerformed

    private void txt_boletasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_boletasFocusLost
      
    }//GEN-LAST:event_txt_boletasFocusLost

    private void txt_totalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_totalFocusLost
        
    }//GEN-LAST:event_txt_totalFocusLost

    private void txt_transbankFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_transbankFocusLost
     
    }//GEN-LAST:event_txt_transbankFocusLost

    private void txt_transbankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_transbankMouseClicked
    
    }//GEN-LAST:event_txt_transbankMouseClicked

    private void txt_boletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_boletasMouseClicked
       
    }//GEN-LAST:event_txt_boletasMouseClicked

    private void txt_boletasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_boletasFocusGained
        
    }//GEN-LAST:event_txt_boletasFocusGained

    private void txt_transbankFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_transbankFocusGained
        
    }//GEN-LAST:event_txt_transbankFocusGained

    private void btn_obtenerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_obtenerDatosActionPerformed
        ControladorVenta ctrlVenta = new ControladorVenta();
        Venta datos=ctrlVenta.obtenerVentaPorFecha(fecha.getText());
        txt_boletas.setValue((long)datos.getBoleta());
        txt_transbank.setValue((long)datos.getTransbank());
        txt_total.setValue((long)datos.getTotal());
    }//GEN-LAST:event_btn_obtenerDatosActionPerformed

    private void btn_editarBoletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarBoletasActionPerformed
        txt_boletas.setEditable(true);
    }//GEN-LAST:event_btn_editarBoletasActionPerformed

    private void btn_editarTransbankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarTransbankActionPerformed
        txt_transbank.setEditable(true);
    }//GEN-LAST:event_btn_editarTransbankActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        int primero = Math.toIntExact((long) txt_boletas.getValue());
        int segundo = Math.toIntExact((long) txt_transbank.getValue());
        int total = primero + segundo;
        txt_total.setValue(total);
        btn_ingresar.setEnabled(true);
    }//GEN-LAST:event_btn_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_editarBoletas;
    private javax.swing.JButton btn_editarTransbank;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_obtenerDatos;
    private javax.swing.JButton btn_salir;
    private datechooser.beans.DateChooserCombo fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txt_boletas;
    private javax.swing.JFormattedTextField txt_total;
    private javax.swing.JFormattedTextField txt_transbank;
    // End of variables declaration//GEN-END:variables
}
