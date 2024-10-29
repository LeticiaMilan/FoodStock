package view;

import java.awt.Color;

public class MovimentacaoView extends javax.swing.JFrame {

    public MovimentacaoView() {
        initComponents();
        
        //setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        Color backgroundDashboard = new Color(241,245,246);
        getContentPane().setBackground(backgroundDashboard);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnMenu = new javax.swing.JPanel();
        jPnLogo = new javax.swing.JPanel();
        jLbImagem = new javax.swing.JLabel();
        jPnBotoesMenu = new javax.swing.JPanel();
        jBtnHomeMenu = new javax.swing.JButton();
        jBtnClientesMenu = new javax.swing.JButton();
        jBtnProdutosMenu = new javax.swing.JButton();
        jBtnEstoqueMenu = new javax.swing.JButton();
        jPnLayout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFBuscar = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jBtnAddNovaMovimentacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPnMenu.setBackground(new java.awt.Color(7, 58, 75));

        jPnLogo.setBackground(new java.awt.Color(255, 255, 255));

        jLbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_foodstock_icon.png"))); // NOI18N
        jLbImagem.setMaximumSize(new java.awt.Dimension(40, 40));
        jLbImagem.setMinimumSize(new java.awt.Dimension(40, 40));
        jLbImagem.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPnLogoLayout = new javax.swing.GroupLayout(jPnLogo);
        jPnLogo.setLayout(jPnLogoLayout);
        jPnLogoLayout.setHorizontalGroup(
            jPnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPnLogoLayout.setVerticalGroup(
            jPnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnLogoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPnBotoesMenu.setOpaque(false);
        jPnBotoesMenu.setLayout(new java.awt.GridLayout(6, 1, 0, 10));

        jBtnHomeMenu.setBackground(new java.awt.Color(32, 80, 94));
        jBtnHomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_home.png"))); // NOI18N
        jBtnHomeMenu.setBorder(null);
        jBtnHomeMenu.setBorderPainted(false);
        jBtnHomeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHomeMenuActionPerformed(evt);
            }
        });
        jPnBotoesMenu.add(jBtnHomeMenu);

        jBtnClientesMenu.setBackground(new java.awt.Color(32, 80, 94));
        jBtnClientesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_clientes.png"))); // NOI18N
        jBtnClientesMenu.setBorder(null);
        jBtnClientesMenu.setBorderPainted(false);
        jBtnClientesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClientesMenuActionPerformed(evt);
            }
        });
        jPnBotoesMenu.add(jBtnClientesMenu);

        jBtnProdutosMenu.setBackground(new java.awt.Color(32, 80, 94));
        jBtnProdutosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_produtos.png"))); // NOI18N
        jBtnProdutosMenu.setBorder(null);
        jBtnProdutosMenu.setBorderPainted(false);
        jBtnProdutosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProdutosMenuActionPerformed(evt);
            }
        });
        jPnBotoesMenu.add(jBtnProdutosMenu);

        jBtnEstoqueMenu.setBackground(new java.awt.Color(32, 80, 94));
        jBtnEstoqueMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_mov_estoque.png"))); // NOI18N
        jBtnEstoqueMenu.setBorder(null);
        jBtnEstoqueMenu.setBorderPainted(false);
        jBtnEstoqueMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEstoqueMenuActionPerformed(evt);
            }
        });
        jPnBotoesMenu.add(jBtnEstoqueMenu);

        javax.swing.GroupLayout jPnMenuLayout = new javax.swing.GroupLayout(jPnMenu);
        jPnMenu.setLayout(jPnMenuLayout);
        jPnMenuLayout.setHorizontalGroup(
            jPnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPnBotoesMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPnMenuLayout.setVerticalGroup(
            jPnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnMenuLayout.createSequentialGroup()
                .addComponent(jPnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPnBotoesMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 181, Short.MAX_VALUE))
        );

        jPnLayout.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Estoque");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTFBuscar.setText("Buscar");
        jTFBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBuscarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setFocusable(false);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipio", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setFocusable(false);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bairro", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.setFocusable(false);

        jBtnAddNovaMovimentacao.setBackground(new java.awt.Color(255, 209, 103));
        jBtnAddNovaMovimentacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBtnAddNovaMovimentacao.setText("Nova movimentação");
        jBtnAddNovaMovimentacao.setBorder(null);
        jBtnAddNovaMovimentacao.setBorderPainted(false);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.getTableHeader().setResizingAllowed(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPnLayoutLayout = new javax.swing.GroupLayout(jPnLayout);
        jPnLayout.setLayout(jPnLayoutLayout);
        jPnLayoutLayout.setHorizontalGroup(
            jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnLayoutLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPnLayoutLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAddNovaMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPnLayoutLayout.setVerticalGroup(
            jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnLayoutLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddNovaMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPnLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPnLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBuscarActionPerformed

    private void jBtnHomeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHomeMenuActionPerformed
        HomeView hv = new HomeView();
        this.setVisible(false);
        hv.setVisible(true);
    }//GEN-LAST:event_jBtnHomeMenuActionPerformed

    private void jBtnClientesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClientesMenuActionPerformed
        ClienteView cv = new ClienteView();
        this.setVisible(false);
        cv.setVisible(true);
    }//GEN-LAST:event_jBtnClientesMenuActionPerformed

    private void jBtnProdutosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutosMenuActionPerformed
        //ProdutoView pv = new ProdutoView();
        //this.setVisible(false);
        //pv.setVisible(true);
    }//GEN-LAST:event_jBtnProdutosMenuActionPerformed

    private void jBtnEstoqueMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEstoqueMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEstoqueMenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentacaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddNovaMovimentacao;
    private javax.swing.JButton jBtnClientesMenu;
    private javax.swing.JButton jBtnEstoqueMenu;
    private javax.swing.JButton jBtnHomeMenu;
    private javax.swing.JButton jBtnProdutosMenu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbImagem;
    private javax.swing.JPanel jPnBotoesMenu;
    private javax.swing.JPanel jPnLayout;
    private javax.swing.JPanel jPnLogo;
    private javax.swing.JPanel jPnMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}