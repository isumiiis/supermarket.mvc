/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket.mvc.view;

/**
 *
 * @author USER
 */
public class customerView extends javax.swing.JFrame {

    /**
     * Creates new form customerView
     */
    public customerView() {
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

        Basepanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        DOBLabel = new javax.swing.JLabel();
        DOBField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        ProvinceLabel = new javax.swing.JLabel();
        provinceField = new javax.swing.JTextField();
        zipcodeLabel = new javax.swing.JLabel();
        zipcodeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setToolTipText("");

        jLabel1.setText("Customer Manage");

        javax.swing.GroupLayout headerLabelLayout = new javax.swing.GroupLayout(headerLabel);
        headerLabel.setLayout(headerLabelLayout);
        headerLabelLayout.setHorizontalGroup(
            headerLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLabelLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        headerLabelLayout.setVerticalGroup(
            headerLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLabelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        idLabel.setText("Customer ID");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        titleLabel.setText("Title");

        titleField.setText("jTextField1");

        DOBLabel.setText("cust DOB");

        DOBField.setText("jTextField1");

        jLabel2.setText("Salary");

        salaryField.setText("jTextField1");

        addressLabel.setText("Address ");

        addressField.setText("jTextField1");

        ProvinceLabel.setText("Province");

        provinceField.setText("jTextField1");

        zipcodeLabel.setText("Zip Code");

        zipcodeField.setText("jTextField1");

        javax.swing.GroupLayout BasepanelLayout = new javax.swing.GroupLayout(Basepanel);
        Basepanel.setLayout(BasepanelLayout);
        BasepanelLayout.setHorizontalGroup(
            BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BasepanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DOBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                            .addComponent(addressLabel)
                            .addComponent(ProvinceLabel)
                            .addComponent(zipcodeLabel))
                        .addGap(46, 46, 46)
                        .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idField)
                            .addComponent(titleField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(DOBField)
                            .addComponent(salaryField)
                            .addComponent(addressField)
                            .addComponent(provinceField)
                            .addComponent(zipcodeField))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BasepanelLayout.setVerticalGroup(
            BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasepanelLayout.createSequentialGroup()
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BasepanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(DOBLabel))
                    .addGroup(BasepanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(DOBField)))
                .addGap(18, 18, 18)
                .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BasepanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(ProvinceLabel))
                    .addGroup(BasepanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(provinceField)))
                .addGap(18, 18, 18)
                .addGroup(BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcodeLabel)
                    .addComponent(zipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

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
            java.util.logging.Logger.getLogger(customerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Basepanel;
    private javax.swing.JTextField DOBField;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel ProvinceLabel;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel headerLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField provinceField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField zipcodeField;
    private javax.swing.JLabel zipcodeLabel;
    // End of variables declaration//GEN-END:variables
}
