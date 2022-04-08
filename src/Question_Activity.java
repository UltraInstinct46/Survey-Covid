/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author killua
 */
public class Question_Activity extends javax.swing.JFrame {

    /**
     * Creates new form Question_Activity
     */
    public Question_Activity() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        yes_rb = new javax.swing.JRadioButton();
        no_rb = new javax.swing.JRadioButton();
        question_label = new javax.swing.JLabel();
        next_button = new javax.swing.JButton();

        yes_rb.setText("Yes");
        yes_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes_rbActionPerformed(evt);
            }
        });

        no_rb.setText("No");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 580));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        question_label.setFont(new java.awt.Font("sansserif", 0, 38)); // NOI18N
        question_label.setText("Saya tidak memakai masker pada saat berkumpul dengan orang lain");
        question_label.setMaximumSize(new java.awt.Dimension(610, 92));
        question_label.setMinimumSize(new java.awt.Dimension(610, 92));
        question_label.setPreferredSize(new java.awt.Dimension(610, 92));

        next_button.setText("Next");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(question_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next_button)
                .addGap(339, 339, 339))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(question_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(next_button)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_next_buttonActionPerformed

    private void yes_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes_rbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yes_rbActionPerformed

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
            java.util.logging.Logger.getLogger(Question_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question_Activity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton next_button;
    private javax.swing.JRadioButton no_rb;
    private javax.swing.JLabel question_label;
    private javax.swing.JRadioButton yes_rb;
    // End of variables declaration//GEN-END:variables
}
