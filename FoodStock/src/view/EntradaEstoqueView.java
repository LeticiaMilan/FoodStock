package view;

import java.awt.Color;

public class EntradaEstoqueView extends javax.swing.JFrame {

    public EntradaEstoqueView() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPnLayout.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPnLayoutLayout = new javax.swing.GroupLayout(jPnLayout);
        jPnLayout.setLayout(jPnLayoutLayout);
        jPnLayoutLayout.setHorizontalGroup(
            jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPnLayoutLayout.setVerticalGroup(
            jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPnLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPnLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnHomeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHomeMenuActionPerformed
        HomeView hv = new HomeView();
        this.setVisible(false);
        hv.setVisible(true);
    }//GEN-LAST:event_jBtnHomeMenuActionPerformed

    private void jBtnClientesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClientesMenuActionPerformed

    }//GEN-LAST:event_jBtnClientesMenuActionPerformed

    private void jBtnProdutosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutosMenuActionPerformed
        //ProdutoView pv = new ProdutoView();
        //this.setVisible(false);
        //pv.setVisible(true);
    }//GEN-LAST:event_jBtnProdutosMenuActionPerformed

    private void jBtnEstoqueMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEstoqueMenuActionPerformed
        MovimentacaoView mv = new MovimentacaoView();
        this.setVisible(false);
        mv.setVisible(true);
    }//GEN-LAST:event_jBtnEstoqueMenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaEstoqueView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnClientesMenu;
    private javax.swing.JButton jBtnEstoqueMenu;
    private javax.swing.JButton jBtnHomeMenu;
    private javax.swing.JButton jBtnProdutosMenu;
    private javax.swing.JLabel jLbImagem;
    private javax.swing.JPanel jPnBotoesMenu;
    private javax.swing.JPanel jPnLayout;
    private javax.swing.JPanel jPnLogo;
    private javax.swing.JPanel jPnMenu;
    // End of variables declaration//GEN-END:variables
}
