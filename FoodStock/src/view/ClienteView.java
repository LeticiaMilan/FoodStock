package view;

public class ClienteView extends javax.swing.JFrame {

    public ClienteView() {
        initComponents();
        
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnMenu = new javax.swing.JPanel();
        jPnLogo = new javax.swing.JPanel();
        jLbImagem = new javax.swing.JLabel();
        jPnLayout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPnMenu.setBackground(new java.awt.Color(7, 58, 75));

        jPnLogo.setBackground(new java.awt.Color(255, 255, 255));

        jLbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_foodstock_icon.png"))); // NOI18N
        jLbImagem.setText("jLabel1");
        jLbImagem.setMaximumSize(new java.awt.Dimension(40, 40));
        jLbImagem.setMinimumSize(new java.awt.Dimension(40, 40));
        jLbImagem.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPnLogoLayout = new javax.swing.GroupLayout(jPnLogo);
        jPnLogo.setLayout(jPnLogoLayout);
        jPnLogoLayout.setHorizontalGroup(
            jPnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnLogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPnLogoLayout.setVerticalGroup(
            jPnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnLogoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPnMenuLayout = new javax.swing.GroupLayout(jPnMenu);
        jPnMenu.setLayout(jPnMenuLayout);
        jPnMenuLayout.setHorizontalGroup(
            jPnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPnMenuLayout.setVerticalGroup(
            jPnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnMenuLayout.createSequentialGroup()
                .addComponent(jPnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1924, Short.MAX_VALUE))
        );

        jPnLayout.setBackground(new java.awt.Color(241, 245, 246));

        javax.swing.GroupLayout jPnLayoutLayout = new javax.swing.GroupLayout(jPnLayout);
        jPnLayout.setLayout(jPnLayoutLayout);
        jPnLayoutLayout.setHorizontalGroup(
            jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2775, Short.MAX_VALUE)
        );
        jPnLayoutLayout.setVerticalGroup(
            jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPnLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPnLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLbImagem;
    private javax.swing.JPanel jPnLayout;
    private javax.swing.JPanel jPnLogo;
    private javax.swing.JPanel jPnMenu;
    // End of variables declaration//GEN-END:variables
}
