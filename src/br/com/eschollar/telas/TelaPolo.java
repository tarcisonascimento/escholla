/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eschollar.telas;

/**
 *
 * @author Tarciso Nascimento
 */
public class TelaPolo extends javax.swing.JInternalFrame {

// o metodo abaixo abre a janela 
    public static TelaPolo telaPolo;

    public static TelaPolo getInstancia() {
        if (telaPolo == null) {

            telaPolo = new TelaPolo();
        }
        return telaPolo;
    }

    public TelaPolo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jComboBox21 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox22 = new javax.swing.JComboBox<>();
        jComboBox23 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jComboBox24 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        btnSalvar4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jComboBox28 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnSalvar7 = new javax.swing.JButton();
        jComboBox34 = new javax.swing.JComboBox<>();
        jComboBox35 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jComboBox25 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jComboBox26 = new javax.swing.JComboBox<>();
        jComboBox27 = new javax.swing.JComboBox<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        btnSalvar5 = new javax.swing.JButton();
        jComboBox29 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        btnSalvar6 = new javax.swing.JButton();
        jComboBox33 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jLabel48 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(249, 251, 233));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Arlindo dos Santos", "Engenharia de Software", "30", "Ativo"},
                {"2", "Paulo Sérgio", "Ensino Médio", "28", "Ativo"},
                {"3", "Tatiane de Morais", "Educação Física", "5", "Inativo"},
                {"4", null, null, null, null},
                {"5", null, null, null, null},
                {"6", null, null, null, null},
                {"7", null, null, null, null},
                {"8", null, null, null, null},
                {"9", null, null, null, null},
                {"10", null, null, null, null},
                {"11", null, null, null, null},
                {"12", null, null, null, null},
                {"13", null, null, null, null},
                {"14", null, null, null, null},
                {"15", null, null, null, null},
                {"16", null, null, null, null},
                {"17", null, null, null, null},
                {"18", null, null, null, null},
                {"19", null, null, null, null},
                {"20", null, null, null, null},
                {"21", null, null, null, null},
                {"22", null, null, null, null},
                {"23", null, null, null, null},
                {"24", null, null, null, null},
                {"25", null, null, null, null},
                {"26", null, null, null, null},
                {"27", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome do Aluno", "Curso", "Sala", "Situação"
            }
        ));
        jScrollPane7.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setMinWidth(30);
            jTable8.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable8.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable8.getColumnModel().getColumn(1).setMinWidth(105);
            jTable8.getColumnModel().getColumn(1).setPreferredWidth(105);
            jTable8.getColumnModel().getColumn(1).setMaxWidth(105);
            jTable8.getColumnModel().getColumn(2).setMinWidth(150);
            jTable8.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable8.getColumnModel().getColumn(2).setMaxWidth(150);
            jTable8.getColumnModel().getColumn(3).setMinWidth(150);
            jTable8.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable8.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable8.getColumnModel().getColumn(4).setMinWidth(85);
            jTable8.getColumnModel().getColumn(4).setPreferredWidth(85);
            jTable8.getColumnModel().getColumn(4).setMaxWidth(85);
        }

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AM", "RO", "DF" }));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Estado:");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Cidade:");

        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ariquemes", "Chupinguaia", "Humaitá", "Monte Negro", "Lago Sul" }));

        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Polo de Ariquemes", "Polo de Chupinguaia", "Polo de Humaitá", "Polo de Monte Negro", "Polo de Lago Sul" }));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Polo:");

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Sala:");

        jButton9.setText("Listar Todos");

        btnSalvar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/printer40x40.png"))); // NOI18N
        btnSalvar4.setText("Imprimir Lista");
        btnSalvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox22, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox21, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvar4, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox24, 0, 197, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane2.addTab("Lista de Alunos/Matricula", jPanel13);

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Ensino Fundamental", "1", "21/02/2021", "21/03/2021", "Polo de Ariquemes,Polo de Buritis", "Tarciso", "Concluído"},
                {"2", "Ensino Médio", "2", "25/07/2021", "29/07/2021", "Polo de Ceregeiras", "Tarciso", "Ativo"},
                {"3", "Informática Básica", "2", "29/04/2021", "29/12/2021", "Polo de Caceres", "Tarciso", "Inativo"},
                {"4", null, null, null, null, null, null, null},
                {"5", null, null, null, null, null, null, null},
                {"6", null, null, null, null, null, null, null},
                {"7", null, null, null, null, null, null, null},
                {"8", null, null, null, null, null, null, null},
                {"9", null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null},
                {"16", null, null, null, null, null, null, null},
                {"17", null, null, null, null, null, null, null},
                {"18", null, null, null, null, null, null, null},
                {"19", null, null, null, null, null, null, null},
                {"20", null, null, null, null, null, null, null},
                {"21", null, null, null, null, null, null, null},
                {"22", null, null, null, null, null, null, null},
                {"23", null, null, null, null, null, null, null},
                {"24", null, null, null, null, null, null, null},
                {"25", null, null, null, null, null, null, null},
                {"26", null, null, null, null, null, null, null},
                {"27", null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Prova", "Sala", "Data Distribuição", "Data Realização", "Polo", "Responsável", "Situação"
            }
        ));
        jScrollPane13.setViewportView(jTable13);
        if (jTable13.getColumnModel().getColumnCount() > 0) {
            jTable13.getColumnModel().getColumn(0).setMinWidth(30);
            jTable13.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable13.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable13.getColumnModel().getColumn(1).setMinWidth(105);
            jTable13.getColumnModel().getColumn(1).setPreferredWidth(105);
            jTable13.getColumnModel().getColumn(1).setMaxWidth(105);
            jTable13.getColumnModel().getColumn(2).setMinWidth(30);
            jTable13.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable13.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable13.getColumnModel().getColumn(3).setMinWidth(150);
            jTable13.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable13.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable13.getColumnModel().getColumn(4).setMinWidth(150);
            jTable13.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable13.getColumnModel().getColumn(4).setMaxWidth(150);
            jTable13.getColumnModel().getColumn(5).setMinWidth(150);
            jTable13.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable13.getColumnModel().getColumn(5).setMaxWidth(150);
            jTable13.getColumnModel().getColumn(6).setMinWidth(100);
            jTable13.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable13.getColumnModel().getColumn(6).setMaxWidth(100);
            jTable13.getColumnModel().getColumn(7).setMinWidth(85);
            jTable13.getColumnModel().getColumn(7).setPreferredWidth(85);
            jTable13.getColumnModel().getColumn(7).setMaxWidth(85);
        }

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AM", "RO", "DF" }));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Estado:");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Cidade:");

        btnSalvar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/distribuir30x30.png"))); // NOI18N
        btnSalvar7.setText("Realizar Ensalamento");
        btnSalvar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar7ActionPerformed(evt);
            }
        });

        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ariquemes", "Chupinguaia", "Humaitá", "Monte Negro", "Lago Sul" }));

        jComboBox35.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Polo de Ariquemes", "Polo de Chupinguaia", "Polo de Humaitá", "Polo de Monte Negro", "Polo de Lago Sul" }));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Polo:");

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Arlindo dos Santos", null},
                {"2", "Paulo Sérgio", null},
                {"3", "Tatiane de Morais", null},
                {"4", null, null},
                {"5", null, null},
                {"6", null, null},
                {"7", null, null},
                {"8", null, null},
                {"9", null, null},
                {"10", null, null},
                {"11", null, null},
                {"12", null, null},
                {"13", null, null},
                {"14", null, null},
                {"15", null, null},
                {"16", null, null},
                {"17", null, null},
                {"18", null, null},
                {"19", null, null},
                {"20", null, null}
            },
            new String [] {
                "ID", "Prova Disponível", "Distribuir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(jTable14);
        if (jTable14.getColumnModel().getColumnCount() > 0) {
            jTable14.getColumnModel().getColumn(0).setMinWidth(30);
            jTable14.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable14.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable14.getColumnModel().getColumn(1).setMinWidth(105);
            jTable14.getColumnModel().getColumn(1).setPreferredWidth(105);
            jTable14.getColumnModel().getColumn(1).setMaxWidth(105);
            jTable14.getColumnModel().getColumn(2).setMinWidth(60);
            jTable14.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable14.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("jPasswordField1");

        jLabel1.setText("Senha:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jComboBox34, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox28, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox35, 0, 197, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPasswordField1))
                        .addComponent(btnSalvar7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Ensalar", jPanel4);

        jButton19.setText("Mostrar todas");

        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AM", "RO", "DF" }));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Estado:");

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Cidade:");

        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ariquemes", "Chupinguaia", "Humaitá", "Monte Negro", "Lago Sul" }));

        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Polo de Ariquemes", "Polo de Chupinguaia", "Polo de Humaitá", "Polo de Monte Negro", "Polo de Lago Sul" }));

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Prova de Nivelamento Fundamental", "21/02/2021", null, "Realizada"},
                {"2", "Prova de Nivelamento Médio", "21/09/2021", null, "Pronto"},
                {"3", "Prova de Informática", "12/12/2021", null, "Inativo"},
                {"4", null, null, null, null},
                {"5", null, null, null, null},
                {"6", null, null, null, null},
                {"7", null, null, null, null},
                {"8", null, null, null, null},
                {"9", null, null, null, null},
                {"10", null, null, null, null},
                {"11", null, null, null, null},
                {"12", null, null, null, null},
                {"13", null, null, null, null},
                {"14", null, null, null, null},
                {"15", null, null, null, null},
                {"16", null, null, null, null},
                {"17", null, null, null, null},
                {"18", null, null, null, null},
                {"19", null, null, null, null},
                {"20", null, null, null, null},
                {"21", null, null, null, null},
                {"22", null, null, null, null},
                {"23", null, null, null, null},
                {"24", null, null, null, null},
                {"25", null, null, null, null},
                {"26", null, null, null, null},
                {"27", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Prova", "Data", "Imprimir", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable11);
        if (jTable11.getColumnModel().getColumnCount() > 0) {
            jTable11.getColumnModel().getColumn(0).setMinWidth(30);
            jTable11.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable11.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable11.getColumnModel().getColumn(1).setMinWidth(105);
            jTable11.getColumnModel().getColumn(1).setPreferredWidth(105);
            jTable11.getColumnModel().getColumn(1).setMaxWidth(105);
            jTable11.getColumnModel().getColumn(2).setMinWidth(150);
            jTable11.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable11.getColumnModel().getColumn(2).setMaxWidth(150);
            jTable11.getColumnModel().getColumn(3).setMinWidth(150);
            jTable11.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable11.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable11.getColumnModel().getColumn(4).setMinWidth(85);
            jTable11.getColumnModel().getColumn(4).setPreferredWidth(85);
            jTable11.getColumnModel().getColumn(4).setMaxWidth(85);
        }

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Polo:");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Ordenar por sala");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Remover Inativos");

        btnSalvar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/printer40x40.png"))); // NOI18N
        btnSalvar5.setText("Imprimir Ensalamento");

        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Polo de Ariquemes", "Polo de Chupinguaia", "Polo de Humaitá", "Polo de Monte Negro", "Polo de Lago Sul" }));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Prova:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox26, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox25, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))
                        .addGap(18, 18, 18)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane2.addTab("Ensalamento/Prova", jPanel9);

        jButton20.setText("Mostrar todas");

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Arlindo dos Santos", null, "Engenharia de Software", "Ativo"},
                {"2", "Paulo Sérgio", null, "Ensino Médio", "Ativo"},
                {"3", "Tatiane de Morais", null, "Educação Física", "Inativo"},
                {"4", null, null, null, null},
                {"5", null, null, null, null},
                {"6", null, null, null, null},
                {"7", null, null, null, null},
                {"8", null, null, null, null},
                {"9", null, null, null, null},
                {"10", null, null, null, null},
                {"11", null, null, null, null},
                {"12", null, null, null, null},
                {"13", null, null, null, null},
                {"14", null, null, null, null},
                {"15", null, null, null, null},
                {"16", null, null, null, null},
                {"17", null, null, null, null},
                {"18", null, null, null, null},
                {"19", null, null, null, null},
                {"20", null, null, null, null},
                {"21", null, null, null, null},
                {"22", null, null, null, null},
                {"23", null, null, null, null},
                {"24", null, null, null, null},
                {"25", null, null, null, null},
                {"26", null, null, null, null},
                {"27", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Aluno", "Sala", "Curso", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable12);
        if (jTable12.getColumnModel().getColumnCount() > 0) {
            jTable12.getColumnModel().getColumn(0).setMinWidth(30);
            jTable12.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable12.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable12.getColumnModel().getColumn(1).setMinWidth(105);
            jTable12.getColumnModel().getColumn(1).setPreferredWidth(105);
            jTable12.getColumnModel().getColumn(1).setMaxWidth(105);
            jTable12.getColumnModel().getColumn(2).setMinWidth(45);
            jTable12.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable12.getColumnModel().getColumn(2).setMaxWidth(45);
            jTable12.getColumnModel().getColumn(3).setMinWidth(150);
            jTable12.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable12.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable12.getColumnModel().getColumn(4).setMinWidth(85);
            jTable12.getColumnModel().getColumn(4).setPreferredWidth(85);
            jTable12.getColumnModel().getColumn(4).setMaxWidth(85);
        }

        btnSalvar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/eschollar/icones/printer40x40.png"))); // NOI18N
        btnSalvar6.setText("Imprimir Ensalamento");

        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Polo de Ariquemes", "Polo de Chupinguaia", "Polo de Humaitá", "Polo de Monte Negro", "Polo de Lago Sul" }));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Prova:");

        try {
            jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Data:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextField7)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane2.addTab("Ensalamento/Aluno", jPanel10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1318, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar4ActionPerformed

    private void btnSalvar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar4;
    private javax.swing.JButton btnSalvar5;
    private javax.swing.JButton btnSalvar6;
    private javax.swing.JButton btnSalvar7;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable8;
    // End of variables declaration//GEN-END:variables
}
