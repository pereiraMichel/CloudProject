/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cloudproject.view;


import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.plaf.ProgressBarUI;
import javax.swing.text.StyleConstants;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Debug
 */
public class carrega extends javax.swing.JFrame {

    /**
     * Creates new form carrega
     */
    public carrega() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public void carrega() throws InterruptedException{
        
        DefaultListModel model = new DefaultListModel();
        
        long tempo = 5;
        
//        try{
        barraCarrega.setMinimum(0);
        barraCarrega.setMaximum(100);

        for(int i=0; i <= 100; i++){
            if(i == 15){
                model.addElement("Buscando informações do sistema...\n");
                barraCarrega.setValue(i);
            }
//            else if(i == 30){
//                model.addElement("Sistema Operacional: " + System.getProperty("os.name") + "\n");
//                barraCarrega.setValue(i);
//            }
//            else if(i == 45){
//                model.addElement("Versão Java: " + System.getProperty("java.runtime.version") + "\n");
//                barraCarrega.setValue(i);
//            }
            else if(i == 60){
                model.addElement("Carregando o banco de dados..." + "\n");
                barraCarrega.setValue(i);
            }
            else if(i == 75){
                model.addElement("Banco de dados carregado!\n");
                barraCarrega.setValue(i);
            }
            else if(i == 90){
                model.addElement("Iniciando o sistema...\n");
                barraCarrega.setValue(i);
            }
            else if(i == 100){
                model.addElement("Carregado!");
                barraCarrega.setValue(i);
            }
            
            
        }
        lista.setModel(model);   
        lista.setVisible(true);

        barraCarrega.setStringPainted(true);
        barraCarrega.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        

//        model.addElement("Java VM: " + System.getProperty("java.vm.vendor") + "\n");
//        barraCarrega.setValue(45);
//        model.addElement("País: " + System.getProperty("user.country") + "\n");
//        barraCarrega.setValue(60);
//        model.addElement("Codificação: " + System.getProperty("file.encoding") + "\n");
//        barraCarrega.setValue(75);
//        model.addElement("Versão Java: " + System.getProperty("java.runtime.version") + "\n");
//        barraCarrega.setValue(90);
//        model.addElement("Carregado!");
//        barraCarrega.setValue(100);
        
//        } catch (InterruptedException ex) {
//            Logger.getLogger(carrega.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
    
    public void preencheTexto(){
        labelCarrega.setText("Tela de Carregamento");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollList = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        labelCarrega = new javax.swing.JLabel();
        labelLogomarca = new javax.swing.JLabel();
        barraCarrega = new javax.swing.JProgressBar();
        btCarregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        scrollList.setViewportView(lista);

        labelCarrega.setText("jLabel1");

        labelLogomarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cloudproject/images/CloudProjetTelaInicial.png"))); // NOI18N

        btCarregar.setText("Carregar");
        btCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollList)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCarrega)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(barraCarrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLogomarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                        .addComponent(btCarregar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogomarca)
                    .addComponent(btCarregar))
                .addGap(18, 18, 18)
                .addComponent(labelCarrega)
                .addGap(18, 18, 18)
                .addComponent(scrollList, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraCarrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarregarActionPerformed
        try {
            this.carrega();
        } catch (InterruptedException ex) {
            Logger.getLogger(carrega.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCarregarActionPerformed

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
            java.util.logging.Logger.getLogger(carrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraCarrega;
    private javax.swing.JButton btCarregar;
    private javax.swing.JLabel labelCarrega;
    private javax.swing.JLabel labelLogomarca;
    private javax.swing.JList lista;
    private javax.swing.JScrollPane scrollList;
    // End of variables declaration//GEN-END:variables
}
