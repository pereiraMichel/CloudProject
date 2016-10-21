/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cloudproject.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import br.com.cloudproject.view.*;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Window;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;


/**
 *
 * @author Debug
 */
public class telaPrincipal extends javax.swing.JFrame {

    dialogLogin login;
    dClientes clientes;
    private String usuario;
    Boolean autoriza;
    dOClientes opcaoCliente;
    dProjeto projetos;
    Date data;
    Calendar cal;
    Locale locale;
    SimpleDateFormat horaReal;
    DefaultListModel lista = new DefaultListModel();

    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Creates new form telaPrincipal
     */
    public telaPrincipal() {
        initComponents();
        tamanhoMenus();
        logomarcaProject();
        bloqueiaLogoff();
        sistemaBloqueado();
        preencheLabels();
//        tempoReal();
    }
    
    public void tempoReal(){
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                horaReal = new SimpleDateFormat("HH:mm:ss");
                System.out.println(horaReal.format(new Date()));
            }
        };
        new Timer().scheduleAtFixedRate(task, 0, 1000);
        try{
            wait();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void preencheLabels(){
        locale = new Locale("pt", "BR");
        data = new Date();
        cal = Calendar.getInstance(locale);
        
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);
        
        String dataFormada = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
        
        labelSistema.setText("Cloud Project - Versão 1.0");
        labelAutor.setText("MAP TI - Michel Pereira");
        labelData.setText(dataFormada);
    }
    
    public void projetos(){
        projetos = new dProjeto(this, true);
        projetos.setTitle("Selecione a operação");
        projetos.setLocationRelativeTo(projetos);
        projetos.setVisible(true);
    }
    
    public void bloqueiaLogin(){
        
        if(!"".equals(this.usuario)){
            System.out.println("Fiz a comparação... OK");
//            if(!labelUsuario.equals(this.usuario)){
//                System.out.println("Por que não preencheu?");
//            }
        }
        
    }
    
    public void bloqueiaLogoff(){
        subMenuLogoff.setEnabled(false);
        subMenuLogin.setEnabled(true);
    }
    
    public void sair(){
        
        if (JOptionPane.showConfirmDialog(null, "Confirma saida?", "SAIR", JOptionPane.YES_NO_OPTION) == 0){
            System.gc();
            System.exit(0);
            this.dispose();
        }
        else{
            this.setDefaultCloseOperation(telaPrincipal.DO_NOTHING_ON_CLOSE);

        }
    }
    
    public void tamanhoMenus(){
        Dimension dimensao = new Dimension();
        dimensao.setSize(150, 30);
        
        menuArquivo.setPreferredSize(dimensao);
        menuFerramentas.setPreferredSize(dimensao);
        menuProjetos.setPreferredSize(dimensao);
        
        subMenuLogin.setPreferredSize(dimensao);
        subMenuLogoff.setPreferredSize(dimensao);
        subMenuSair.setPreferredSize(dimensao);
        
        subMenuAnaliseProjeto.setPreferredSize(dimensao);
        subMenuClientes.setPreferredSize(dimensao);
        subMenuTarefas.setPreferredSize(dimensao);
        
        subMenuUsuarios.setPreferredSize(dimensao);
        subMenuServicos.setPreferredSize(dimensao);
        subMenuProdutividade.setPreferredSize(dimensao);
    }
    
    public void adicionaElementos(String texto){
        lista.addElement("\n" + texto);
        listaAtividade.setModel(lista);
    }
    
    public void telaLogin(){

        login = new dialogLogin(this, true);//rootPaneCheckingEnabled
        login.setLocationRelativeTo(login);
        login.setTitle("LOGIN");
        login.setVisible(true);

        if(login.isActive()){
            adicionaElementos(login.getUsuario());
            ativaGrupoLogoff();
            sistemaDesbloqueado();
            
//            editUsuario.setText(login.getUsuario());
//            editUsuario.setVisible(true);
//            editUsuario.repaint();
        }            
    }
    
    public void telaOpcaoCliente(){
        opcaoCliente = new dOClientes(this, true);
        opcaoCliente.setTitle("Selecione a opção");
        opcaoCliente.setLocationRelativeTo(opcaoCliente);
        opcaoCliente.setVisible(true);
    }
    
    public void sistemaBloqueado(){
        menuProjetos.setEnabled(false);
        menuFerramentas.setEnabled(false);
    }
    
    public void sistemaDesbloqueado(){
        menuProjetos.setEnabled(true);
        menuFerramentas.setEnabled(true);
    }

    public void ativaGrupoLogoff(){
        subMenuLogin.setEnabled(false);
        subMenuLogoff.setEnabled(true);
    }
    
    public void autorizaDados(Boolean concluido, String user){
        
        if(concluido){
            this.autoriza = true;
            adicionaElementos("Usuário logado: " + user);
//            editUsuario.setText(user);
            
//            String usuarioLogado = user;
//            System.out.println("O concluído é true");
//            System.out.println(usuarioLogado);
//            System.out.println("Variável: " + user);
        }else{
            this.autoriza = false;
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFundo = new javax.swing.JPanel();
        panelTelas = new javax.swing.JScrollPane();
        scrollAtividade = new javax.swing.JScrollPane();
        listaAtividade = new javax.swing.JList();
        toolBar = new javax.swing.JToolBar();
        btTarefa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelSistema = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        subMenuLogin = new javax.swing.JMenuItem();
        subMenuLogoff = new javax.swing.JMenuItem();
        separadorArquivo = new javax.swing.JPopupMenu.Separator();
        subMenuSair = new javax.swing.JMenuItem();
        menuProjetos = new javax.swing.JMenu();
        subMenuAnaliseProjeto = new javax.swing.JMenuItem();
        subMenuClientes = new javax.swing.JMenuItem();
        subMenuTarefas = new javax.swing.JMenuItem();
        menuFerramentas = new javax.swing.JMenu();
        subMenuUsuarios = new javax.swing.JMenuItem();
        subMenuServicos = new javax.swing.JMenuItem();
        subMenuProdutividade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelFundo.setBackground(new java.awt.Color(255, 255, 255));
        panelFundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        panelTelas.setBackground(new java.awt.Color(255, 255, 255));
        panelTelas.setBorder(null);
        panelTelas.setMaximumSize(new java.awt.Dimension(400, 230));
        panelTelas.setMinimumSize(new java.awt.Dimension(400, 230));
        panelTelas.setPreferredSize(new java.awt.Dimension(400, 230));

        scrollAtividade.setBorder(null);

        listaAtividade.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        scrollAtividade.setViewportView(listaAtividade);

        javax.swing.GroupLayout panelFundoLayout = new javax.swing.GroupLayout(panelFundo);
        panelFundo.setLayout(panelFundoLayout);
        panelFundoLayout.setHorizontalGroup(
            panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTelas, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFundoLayout.setVerticalGroup(
            panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFundoLayout.createSequentialGroup()
                        .addComponent(panelTelas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 216, Short.MAX_VALUE))
                    .addComponent(scrollAtividade))
                .addContainerGap())
        );

        toolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        toolBar.setRollover(true);

        btTarefa.setText("Tarefas");
        btTarefa.setFocusable(false);
        btTarefa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTarefa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btTarefa);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        labelSistema.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelSistema.setText("jLabel1");

        labelData.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelData.setText("jLabel1");

        labelAutor.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelAutor.setText("jLabel1");

        menu.setPreferredSize(new java.awt.Dimension(219, 20));

        menuArquivo.setText("Arquivo");
        menuArquivo.setMaximumSize(new java.awt.Dimension(71, 32767));
        menuArquivo.setName(""); // NOI18N
        menuArquivo.setPreferredSize(new java.awt.Dimension(73, 19));

        subMenuLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        subMenuLogin.setText("Login");
        subMenuLogin.setToolTipText("");
        subMenuLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subMenuLogin.setName(""); // NOI18N
        subMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuLoginActionPerformed(evt);
            }
        });
        menuArquivo.add(subMenuLogin);

        subMenuLogoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        subMenuLogoff.setText("Logoff");
        subMenuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuLogoffActionPerformed(evt);
            }
        });
        menuArquivo.add(subMenuLogoff);
        menuArquivo.add(separadorArquivo);

        subMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        subMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cloudproject/images/site_icon-16x16.png"))); // NOI18N
        subMenuSair.setText("Sair");
        subMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(subMenuSair);

        menu.add(menuArquivo);

        menuProjetos.setText("Projetos");
        menuProjetos.setMaximumSize(new java.awt.Dimension(71, 32767));
        menuProjetos.setPreferredSize(new java.awt.Dimension(73, 19));

        subMenuAnaliseProjeto.setText("Análise");
        subMenuAnaliseProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAnaliseProjetoActionPerformed(evt);
            }
        });
        menuProjetos.add(subMenuAnaliseProjeto);

        subMenuClientes.setText("Clientes");
        subMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuClientesActionPerformed(evt);
            }
        });
        menuProjetos.add(subMenuClientes);

        subMenuTarefas.setText("Tarefas");
        subMenuTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuTarefasActionPerformed(evt);
            }
        });
        menuProjetos.add(subMenuTarefas);

        menu.add(menuProjetos);

        menuFerramentas.setText("Ferramentas");

        subMenuUsuarios.setText("Usuários");
        menuFerramentas.add(subMenuUsuarios);

        subMenuServicos.setText("Serviços");
        menuFerramentas.add(subMenuServicos);

        subMenuProdutividade.setText("Produtividade");
        subMenuProdutividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProdutividadeActionPerformed(evt);
            }
        });
        menuFerramentas.add(subMenuProdutividade);

        menu.add(menuFerramentas);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSistema)
                        .addGap(230, 230, 230)
                        .addComponent(labelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                        .addComponent(labelAutor)
                        .addGap(80, 80, 80)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSistema)
                    .addComponent(labelData)
                    .addComponent(labelAutor))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSairActionPerformed
        this.sair();
        
// TODO add your handling code here:
    }//GEN-LAST:event_subMenuSairActionPerformed

    private void subMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuLoginActionPerformed
        this.telaLogin();

    }//GEN-LAST:event_subMenuLoginActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sair();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void subMenuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuLogoffActionPerformed
        this.autoriza = false;
        bloqueiaLogoff();
        sistemaBloqueado();
        adicionaElementos("Logoff efetuado com sucesso!");
//        JOptionPane.showMessageDialog(null, "Logoff efetuado com sucesso !");
// TODO add your handling code here:
    }//GEN-LAST:event_subMenuLogoffActionPerformed

    private void subMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuClientesActionPerformed
        telaOpcaoCliente();
        
// TODO add your handling code here:
    }//GEN-LAST:event_subMenuClientesActionPerformed

    private void subMenuAnaliseProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAnaliseProjetoActionPerformed
        projetos();
    }//GEN-LAST:event_subMenuAnaliseProjetoActionPerformed

    private void subMenuTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuTarefasActionPerformed
        Tarefa tarefa = new Tarefa(this, true);
        
        tarefa.setTitle("Tarefas");
        tarefa.setLocationRelativeTo(tarefa);
        tarefa.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_subMenuTarefasActionPerformed

    private void subMenuProdutividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProdutividadeActionPerformed
        Produtividade prod = new Produtividade(this, true);
        
        prod.setTitle("Produtividade");
        prod.setLocationRelativeTo(prod);
        prod.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_subMenuProdutividadeActionPerformed

    public void logomarcaProject(){
        panelLogomarca logo = new panelLogomarca();
        panelTelas.add(logo);
        panelTelas.setViewportView(logo);
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
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTarefa;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelSistema;
    private javax.swing.JList listaAtividade;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuFerramentas;
    private javax.swing.JMenu menuProjetos;
    private javax.swing.JPanel panelFundo;
    private javax.swing.JScrollPane panelTelas;
    private javax.swing.JScrollPane scrollAtividade;
    private javax.swing.JPopupMenu.Separator separadorArquivo;
    private javax.swing.JMenuItem subMenuAnaliseProjeto;
    private javax.swing.JMenuItem subMenuClientes;
    private javax.swing.JMenuItem subMenuLogin;
    private javax.swing.JMenuItem subMenuLogoff;
    private javax.swing.JMenuItem subMenuProdutividade;
    private javax.swing.JMenuItem subMenuSair;
    private javax.swing.JMenuItem subMenuServicos;
    private javax.swing.JMenuItem subMenuTarefas;
    private javax.swing.JMenuItem subMenuUsuarios;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
