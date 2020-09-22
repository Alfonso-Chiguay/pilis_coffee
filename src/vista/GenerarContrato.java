/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


/**
 *
 * @author Alfonso
 */
public class GenerarContrato extends javax.swing.JFrame {

    /**
     * Creates new form GenerarContrato
     */
    public GenerarContrato() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_generarContrato = new javax.swing.JLabel();
        lbl_nombreTrabajador = new javax.swing.JLabel();
        txt_nombreTrabajador = new javax.swing.JTextField();
        lbl_apellidosTrabajador = new javax.swing.JLabel();
        txt_apellidosTrabajador = new javax.swing.JTextField();
        lbl_tipoContrato = new javax.swing.JLabel();
        cbb_tipoContrato = new javax.swing.JComboBox<>();
        lbl_dia = new javax.swing.JLabel();
        cbb_diaNacimiento = new javax.swing.JComboBox<>();
        lbl_mes = new javax.swing.JLabel();
        cbb_mesNacimiento = new javax.swing.JComboBox<>();
        lbl_anio = new javax.swing.JLabel();
        cbb_anioNacimiento = new javax.swing.JComboBox<>();
        lbl_fechaContrato = new javax.swing.JLabel();
        btn_generar = new javax.swing.JButton();
        btn_generar1 = new javax.swing.JButton();
        btn_generar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(290, 340));
        setMinimumSize(new java.awt.Dimension(290, 340));
        setResizable(false);

        lbl_generarContrato.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_generarContrato.setText("Generar Contrato");

        lbl_nombreTrabajador.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lbl_nombreTrabajador.setText("Nombres trabajador");

        txt_nombreTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreTrabajadorActionPerformed(evt);
            }
        });

        lbl_apellidosTrabajador.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lbl_apellidosTrabajador.setText("Apellidos trabajador");

        txt_apellidosTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosTrabajadorActionPerformed(evt);
            }
        });

        lbl_tipoContrato.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lbl_tipoContrato.setText("Tipo de contrato");

        cbb_tipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1 mes", "3 meses", "6 meses", "Indefinido" }));

        lbl_dia.setText("Día");

        cbb_diaNacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbb_diaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_diaNacimientoActionPerformed(evt);
            }
        });

        lbl_mes.setText("Mes");

        cbb_mesNacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbb_mesNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_mesNacimientoActionPerformed(evt);
            }
        });

        lbl_anio.setText("Año");

        cbb_anioNacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007" }));
        cbb_anioNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_anioNacimientoActionPerformed(evt);
            }
        });

        lbl_fechaContrato.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lbl_fechaContrato.setText("Fecha de Contrato");

        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        btn_generar1.setText("Limpiar");

        btn_generar2.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbb_diaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbb_mesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbb_anioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_apellidosTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_generarContrato)
                            .addComponent(txt_nombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombreTrabajador)
                            .addComponent(lbl_apellidosTrabajador)
                            .addComponent(cbb_tipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_dia)
                                .addGap(44, 44, 44)
                                .addComponent(lbl_mes)
                                .addGap(99, 99, 99)
                                .addComponent(lbl_anio))
                            .addComponent(lbl_fechaContrato)
                            .addComponent(lbl_tipoContrato)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_generar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_generar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_generarContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nombreTrabajador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_apellidosTrabajador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apellidosTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_tipoContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbb_tipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lbl_fechaContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dia)
                    .addComponent(lbl_mes)
                    .addComponent(lbl_anio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_diaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_mesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_anioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generar2)
                    .addComponent(btn_generar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_generar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreTrabajadorActionPerformed

    private void txt_apellidosTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosTrabajadorActionPerformed

    private void cbb_diaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_diaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_diaNacimientoActionPerformed

    private void cbb_mesNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_mesNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_mesNacimientoActionPerformed

    private void cbb_anioNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_anioNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_anioNacimientoActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
 
              
    }//GEN-LAST:event_btn_generarActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_generar1;
    private javax.swing.JButton btn_generar2;
    private javax.swing.JComboBox<String> cbb_anioNacimiento;
    private javax.swing.JComboBox<String> cbb_diaNacimiento;
    private javax.swing.JComboBox<String> cbb_mesNacimiento;
    private javax.swing.JComboBox<String> cbb_tipoContrato;
    private javax.swing.JLabel lbl_anio;
    private javax.swing.JLabel lbl_apellidosTrabajador;
    private javax.swing.JLabel lbl_dia;
    private javax.swing.JLabel lbl_fechaContrato;
    private javax.swing.JLabel lbl_generarContrato;
    private javax.swing.JLabel lbl_mes;
    private javax.swing.JLabel lbl_nombreTrabajador;
    private javax.swing.JLabel lbl_tipoContrato;
    private javax.swing.JTextField txt_apellidosTrabajador;
    private javax.swing.JTextField txt_nombreTrabajador;
    // End of variables declaration//GEN-END:variables
}