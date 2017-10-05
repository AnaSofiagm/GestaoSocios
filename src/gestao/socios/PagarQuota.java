/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao.socios;

import java.awt.event.WindowEvent;

/**
 *
 * @author Pedro Mendes
 */
public class PagarQuota extends javax.swing.JFrame {

    private final GestaoSocios gestao;
    private final String numero;
    /**
     * Creates new form PagarQuota
     * @param gestao
     * @param numero
     */
    public PagarQuota(String numero, GestaoSocios gestao) {
        initComponents();
        this.gestao = gestao;
        this.numero = numero;
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogError = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jButtonErrorDialogOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneValor = new javax.swing.JTextPane();
        jButtonPagar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        jDialogError.setSize(new java.awt.Dimension(230, 150));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please insert a number");

        jButtonErrorDialogOk.setText("Ok");
        jButtonErrorDialogOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonErrorDialogOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogErrorLayout = new javax.swing.GroupLayout(jDialogError.getContentPane());
        jDialogError.getContentPane().setLayout(jDialogErrorLayout);
        jDialogErrorLayout.setHorizontalGroup(
            jDialogErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialogErrorLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButtonErrorDialogOk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jDialogErrorLayout.setVerticalGroup(
            jDialogErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonErrorDialogOk)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.setText("Valor");

        jScrollPane1.setViewportView(jTextPaneValor);

        jButtonPagar.setText("Pagar");
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPagar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        Float valor;
        
        try{
            valor = Float.parseFloat(this.jTextPaneValor.getText());
            this.gestao.pagar(this.numero,valor);
            this.setVisible(false);
        }catch(NumberFormatException e){
            this.jDialogError.setVisible(true);
        }
    }//GEN-LAST:event_jButtonPagarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonErrorDialogOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonErrorDialogOkActionPerformed
        this.jDialogError.setVisible(false);
        this.jTextPaneValor.requestFocus();
    }//GEN-LAST:event_jButtonErrorDialogOkActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonErrorDialogOk;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JDialog jDialogError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPaneValor;
    // End of variables declaration//GEN-END:variables
}
