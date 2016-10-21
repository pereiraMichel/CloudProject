/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cloudproject.view;

import br.com.cloudproject.constantes.constantes;

/**
 *
 * @author Debug
 */
public class dAProjeto extends javax.swing.JDialog {

    /**
     * Creates new form dAProjeto
     */
    public dAProjeto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencheTextos();//Preenche os nomes nos label's
    }

    public void preencheTextos(){
        btSalvar.setText(constantes.BTSALVAR);
        btCancelar.setText(constantes.BTCANCELAR);
        labelCronograma.setText(constantes.PCRONOGRAMA);
        labelCliente.setText(constantes.FCLIENTE);
        labelContato.setText(constantes.PCONTATO);
        labelDataFinal.setText(constantes.FDATAFINAL);
        labelDataInicial.setText(constantes.FDATAINICIO);
        labelDescricao.setText(constantes.FDESCRICAO);
        labelGestor.setText(constantes.PGESTOR);
        labelNome.setText(constantes.PNPROJETO);
        labelTelefone.setText(constantes.PTELEFONE);
        labelUsuario.setText(constantes.PUSUARIO);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCronograma = new javax.swing.JPanel();
        sliderCronograma = new javax.swing.JSlider();
        progressCronograma = new javax.swing.JProgressBar();
        textCronograma = new javax.swing.JTextField();
        labelCronograma = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        scrollAnalise = new javax.swing.JScrollPane();
        tabelaAnalise = new javax.swing.JTable();
        labelNome = new javax.swing.JLabel();
        labelDataInicial = new javax.swing.JLabel();
        labelDataFinal = new javax.swing.JLabel();
        labelGestor = new javax.swing.JLabel();
        labelContato = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCronograma.setBackground(new java.awt.Color(255, 255, 255));

        sliderCronograma.setValue(0);

        labelCronograma.setText("jLabel1");

        javax.swing.GroupLayout panelCronogramaLayout = new javax.swing.GroupLayout(panelCronograma);
        panelCronograma.setLayout(panelCronogramaLayout);
        panelCronogramaLayout.setHorizontalGroup(
            panelCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCronogramaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCronograma)
                .addGap(18, 18, 18)
                .addComponent(sliderCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(progressCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCronogramaLayout.setVerticalGroup(
            panelCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCronogramaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCronograma)
                    .addComponent(sliderCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cloudproject/images/save.png"))); // NOI18N
        btSalvar.setText("jButton1");

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cloudproject/images/cancelar.png"))); // NOI18N
        btCancelar.setText("jButton2");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        tabelaAnalise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scrollAnalise.setViewportView(tabelaAnalise);

        labelNome.setText("jLabel1");

        labelDataInicial.setText("jLabel1");

        labelDataFinal.setText("jLabel1");

        labelGestor.setText("jLabel1");

        labelContato.setText("jLabel1");

        labelTelefone.setText("jLabel1");

        labelCliente.setText("jLabel1");

        labelUsuario.setText("jLabel1");

        labelDescricao.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(btSalvar)
                .addGap(74, 74, 74)
                .addComponent(btCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollAnalise)
                    .addComponent(panelCronograma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelGestor)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelContato)
                                    .addComponent(labelCliente))
                                .addGap(232, 232, 232)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelUsuario)
                                    .addComponent(labelTelefone)))
                            .addComponent(labelDataFinal)
                            .addComponent(labelDataInicial))
                        .addGap(139, 139, 139)
                        .addComponent(labelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollAnalise, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescricao)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addGap(18, 18, 18)
                        .addComponent(labelDataInicial)
                        .addGap(18, 18, 18)
                        .addComponent(labelDataFinal)
                        .addGap(24, 24, 24)
                        .addComponent(labelGestor)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelContato)
                            .addComponent(labelTelefone))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCliente)
                            .addComponent(labelUsuario))))
                .addGap(18, 18, 18)
                .addComponent(panelCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        sair();
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed

    public void sair(){
        dispose();
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
            java.util.logging.Logger.getLogger(dAProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dAProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dAProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dAProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dAProjeto dialog = new dAProjeto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelCronograma;
    private javax.swing.JLabel labelDataFinal;
    private javax.swing.JLabel labelDataInicial;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelGestor;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelCronograma;
    private javax.swing.JProgressBar progressCronograma;
    private javax.swing.JScrollPane scrollAnalise;
    private javax.swing.JSlider sliderCronograma;
    private javax.swing.JTable tabelaAnalise;
    private javax.swing.JTextField textCronograma;
    // End of variables declaration//GEN-END:variables
}