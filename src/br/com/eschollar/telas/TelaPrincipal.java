/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eschollar.telas;

import br.com.eschollar.classes.GerenciadorDeJanelas;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Tarciso Nascimento
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    GerenciadorDeJanelas gerenciadorDeJanelas; //variavel para trabalhar com o gerenciador de janelas

    static void lblPerfil(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        this.gerenciadorDeJanelas = new GerenciadorDeJanelas(DesktopPrincipal);
        
        setExtendedState(MAXIMIZED_BOTH);//inicia com a tela inteira
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPrincipal = new javax.swing.JDesktopPane();
        btnSair = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnlInferior = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem46 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenuItem61 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão Escolar e Ensalamento - Escholla");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        DesktopPrincipal.setBackground(new java.awt.Color(208, 239, 234));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/exit40x40.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setHideActionText(true);
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DesktopPrincipal.add(btnSair);
        btnSair.setBounds(1180, 520, 180, 49);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/alterarDados.png"))); // NOI18N
        jButton2.setText("Configurações");
        jButton2.setHideActionText(true);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        DesktopPrincipal.add(jButton2);
        jButton2.setBounds(10, 370, 186, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/prova40x40.png"))); // NOI18N
        jButton4.setText("Provas");
        jButton4.setHideActionText(true);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        DesktopPrincipal.add(jButton4);
        jButton4.setBounds(10, 70, 186, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/vender40x40.png"))); // NOI18N
        jButton5.setText("Vendas");
        jButton5.setHideActionText(true);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DesktopPrincipal.add(jButton5);
        jButton5.setBounds(10, 310, 186, 50);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/payment40x40.png"))); // NOI18N
        jButton6.setText("Financeiro");
        jButton6.setHideActionText(true);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        DesktopPrincipal.add(jButton6);
        jButton6.setBounds(10, 250, 186, 50);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/matricula40x40.png"))); // NOI18N
        jButton7.setText("Alunos");
        jButton7.setHideActionText(true);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        DesktopPrincipal.add(jButton7);
        jButton7.setBounds(10, 10, 186, 49);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/funcionario40x40.png"))); // NOI18N
        jButton3.setText("Funcionários");
        jButton3.setHideActionText(true);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        DesktopPrincipal.add(jButton3);
        jButton3.setBounds(10, 190, 186, 50);

        lblNome.setText("Aqui vai o nome de quem ta usando o sistema");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Usuário:");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Data:");

        lblData.setText("00/00/0000");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Perfil:");

        lblPerfil.setText("Tipo de Perfil");

        javax.swing.GroupLayout pnlInferiorLayout = new javax.swing.GroupLayout(pnlInferior);
        pnlInferior.setLayout(pnlInferiorLayout);
        pnlInferiorLayout.setHorizontalGroup(
            pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(757, Short.MAX_VALUE))
        );
        pnlInferiorLayout.setVerticalGroup(
            pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator6)
            .addComponent(lblPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DesktopPrincipal.add(pnlInferior);
        pnlInferior.setBounds(0, 580, 1370, 30);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/polo40x40.png"))); // NOI18N
        jButton8.setText("Polo");
        jButton8.setHideActionText(true);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        DesktopPrincipal.add(jButton8);
        jButton8.setBounds(10, 130, 186, 50);

        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(386, 35));

        jMenu1.setText("Arquivo");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setText("Funcionários");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setText("Documentos");
        jMenu1.add(jMenuItem4);

        jMenuItem56.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem56.setText("Configurações");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem56);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Pedagógico");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem5.setText("Aluno");
        jMenu3.add(jMenuItem5);

        jMenu12.setText("Cursos");

        jMenuItem21.setText("Listar Cursos");
        jMenu12.add(jMenuItem21);

        jMenuItem22.setText("Cadastrar Cursos");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem22);

        jMenu3.add(jMenu12);

        jMenu10.setText("Polo");

        jMenuItem23.setText("Turmas");
        jMenu10.add(jMenuItem23);

        jMenuItem24.setText("Salas de Aula");
        jMenu10.add(jMenuItem24);

        jMenuItem25.setText("Alunos");
        jMenu10.add(jMenuItem25);

        jMenu3.add(jMenu10);

        jMenu11.setText("Provas");

        jMenuItem27.setText("Ensalamento");
        jMenu11.add(jMenuItem27);

        jMenuItem28.setText("Imprimir Provas");
        jMenu11.add(jMenuItem28);

        jMenuItem29.setText("Polo/Prova");
        jMenu11.add(jMenuItem29);

        jMenu13.setText("Cadastrar");

        jMenuItem30.setText("Prova");
        jMenu13.add(jMenuItem30);

        jMenuItem31.setText("Sala");
        jMenu13.add(jMenuItem31);

        jMenu11.add(jMenu13);
        jMenu11.add(jSeparator3);

        jMenuItem18.setText("Gerar Prova");
        jMenu11.add(jMenuItem18);

        jMenuItem43.setText("Provas Geradas");
        jMenu11.add(jMenuItem43);

        jMenu3.add(jMenu11);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Financeiro");

        jMenuItem33.setText("Caixa");
        jMenu4.add(jMenuItem33);

        jMenuItem35.setText("Contas a pagar");
        jMenu4.add(jMenuItem35);

        jMenuItem36.setText("Contas a receber");
        jMenu4.add(jMenuItem36);

        jMenuItem38.setText("Estornar");
        jMenu4.add(jMenuItem38);

        jMenuItem34.setText("Fornecedores");
        jMenu4.add(jMenuItem34);
        jMenu4.add(jSeparator1);

        jMenuItem40.setText("Abrir Caixa");
        jMenu4.add(jMenuItem40);

        jMenuItem39.setText("Fechar Caixa");
        jMenu4.add(jMenuItem39);
        jMenu4.add(jSeparator2);

        jMenuItem37.setText("Receber mensalidade");
        jMenu4.add(jMenuItem37);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Banco de Questões");

        jMenuItem45.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem45.setText("Questões cadastradas");
        jMenu5.add(jMenuItem45);

        jMenu16.setText("Novo");
        jMenu16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu16ActionPerformed(evt);
            }
        });

        jMenuItem46.setText("Questão");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem46);

        jMenu5.add(jMenu16);
        jMenu5.add(jSeparator4);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Relatórios");

        jMenuItem50.setText("Relatório de Provas");
        jMenu6.add(jMenuItem50);

        jMenuItem51.setText("Relatório de Alunos");
        jMenu6.add(jMenuItem51);

        jMenuItem52.setText("Relatório de Polos");
        jMenu6.add(jMenuItem52);

        jMenuItem54.setText("Relatorio de Cancelamentos");
        jMenu6.add(jMenuItem54);

        jMenuItem55.setText("Relatório de Matrículas");
        jMenu6.add(jMenuItem55);

        jMenuItem10.setText("Relatório de Documentos");
        jMenu6.add(jMenuItem10);

        jMenuItem17.setText("Relatório de Questões");
        jMenu6.add(jMenuItem17);

        jMenuBar1.add(jMenu6);

        jMenu18.setText("Sobre");

        jMenuItem60.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem60.setText("Informações");
        jMenu18.add(jMenuItem60);

        jMenuItem61.setText("Versão 1.0.0");
        jMenu18.add(jMenuItem61);

        jMenuBar1.add(jMenu18);

        jMenu17.setText("Ajuda");

        jMenu9.setText("Cadastrar");

        jMenuItem19.setText("Aluno");
        jMenu9.add(jMenuItem19);

        jMenuItem1.setText("Cidade");
        jMenu9.add(jMenuItem1);

        jMenuItem49.setText("Documentos");
        jMenu9.add(jMenuItem49);

        jMenuItem20.setText("Funcionário");
        jMenu9.add(jMenuItem20);

        jMenuItem41.setText("Questões");
        jMenu9.add(jMenuItem41);

        jMenuItem2.setText("Polo");
        jMenu9.add(jMenuItem2);

        jMenuItem44.setText("Provas");
        jMenu9.add(jMenuItem44);

        jMenu17.add(jMenu9);

        jMenu14.setText("Imprimir");

        jMenuItem59.setText("Ensalamento");
        jMenu14.add(jMenuItem59);

        jMenuItem57.setText("Declarações");
        jMenu14.add(jMenuItem57);

        jMenuItem58.setText("Provas");
        jMenu14.add(jMenuItem58);

        jMenu17.add(jMenu14);

        jMenuBar1.add(jMenu17);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1386, 689);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        pnlInferior.setSize(DesktopPrincipal.getWidth(), 30); //deixa a barra do tamanho certo mesmo que for maximizado
        pnlInferior.setLocation(0, DesktopPrincipal.getHeight() - 30);// TODO add your handling code here:
        btnSair.setLocation(DesktopPrincipal.getWidth() - 200, DesktopPrincipal.getHeight() - 95);
        
        JPanel fundojanela = (JPanel) getContentPane();
        int largura = fundojanela.getWidth();
        int altura = fundojanela.getHeight();
        
        System.out.println(largura + "/" + altura);
        DesktopPrincipal.setSize(new Dimension(largura, altura));
    }//GEN-LAST:event_formWindowActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        gerenciadorDeJanelas.AbrirJanelas(TelaUsuarios.getInstancia());//chamando a tela 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        gerenciadorDeJanelas.AbrirJanelas(TelaAluno.getInstancia());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        gerenciadorDeJanelas.AbrirJanelas(TelaProva.getInstancia());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
        gerenciadorDeJanelas.AbrirJanelas(TelaConfiguracoes.getInstancia());        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        gerenciadorDeJanelas.AbrirJanelas(TelaConfiguracoes.getInstancia());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu16ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        gerenciadorDeJanelas.AbrirJanelas(TelaQuestoes.getInstancia());
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        gerenciadorDeJanelas.AbrirJanelas(TelaPolo.getInstancia());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        gerenciadorDeJanelas.AbrirJanelas(TelaFinanceiro.getInstancia());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPrincipal;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public static javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblNome;
    public static javax.swing.JLabel lblPerfil;
    private javax.swing.JPanel pnlInferior;
    // End of variables declaration//GEN-END:variables
}
