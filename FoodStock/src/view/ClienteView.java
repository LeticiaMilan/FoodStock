package view;

import controller.ClienteController;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Cliente;

public class ClienteView extends javax.swing.JFrame {

    ClienteController clienteController = new ClienteController();

    public ClienteView() {
        initComponents();

        //setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        Color backgroundDashboard = new Color(241, 245, 246);
        getContentPane().setBackground(backgroundDashboard);

        List<Cliente> listaClientes = clienteController.obterClientes();

        String[] colunas = {"Id", "Nome", "CPF/CNPJ", "Email", "Telefone", "CEP", "Logradouro", "Bairro", "Número", "Município", "Estado", "País"};
        DefaultTableModel dtm = new DefaultTableModel(null, colunas);
        jTable.setModel(dtm);

        TableColumn colunaId = jTable.getColumnModel().getColumn(0);
        jTable.getColumnModel().removeColumn(colunaId);

        for (Cliente cliente : listaClientes) {
            Object[] obj = {cliente.getIdCliente(), cliente.getNome(), cliente.getCpfCnpj(), cliente.getEmail(), cliente.getTelefone().getNumero(), 
                            cliente.getEndereco().getCep(), cliente.getEndereco().getLogradouro(), cliente.getEndereco().getBairro(), cliente.getEndereco().getNumero(),
                            cliente.getEndereco().getMunicipio(), cliente.getEndereco().getEstado(), cliente.getEndereco().getPais()};
            dtm.addRow(obj);
        }
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
        jCBEstado = new javax.swing.JComboBox<>();
        jCBMunicipio = new javax.swing.JComboBox<>();
        jCBCompra = new javax.swing.JComboBox<>();
        jBtnAddNovoCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBtnDeletar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBtnAlterar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBtnCliente = new javax.swing.JButton();

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
        jLabel1.setText("Clientes");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTFBuscar.setText(" Buscar");
        jTFBuscar.setToolTipText("");
        jTFBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBuscarActionPerformed(evt);
            }
        });

        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado" }));
        jCBEstado.setFocusable(false);

        jCBMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipio" }));
        jCBMunicipio.setFocusable(false);

        jCBCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compra", "Mais compraram", "Menos compraram" }));
        jCBCompra.setFocusable(false);

        jBtnAddNovoCliente.setBackground(new java.awt.Color(255, 209, 103));
        jBtnAddNovoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBtnAddNovoCliente.setText("Novo cliente");
        jBtnAddNovoCliente.setBorder(null);
        jBtnAddNovoCliente.setBorderPainted(false);
        jBtnAddNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddNovoClienteActionPerformed(evt);
            }
        });

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_icon.png"))); // NOI18N

        jBtnDeletar.setBackground(new java.awt.Color(253, 253, 253));
        jBtnDeletar.setText("Deletar cliente");
        jBtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeletarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_icon.png"))); // NOI18N

        jBtnAlterar.setBackground(new java.awt.Color(253, 253, 253));
        jBtnAlterar.setText("Alterar cliente");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_icon.png"))); // NOI18N

        jBtnCliente.setBackground(new java.awt.Color(253, 253, 253));
        jBtnCliente.setText("Ver cliente");
        jBtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnLayoutLayout = new javax.swing.GroupLayout(jPnLayout);
        jPnLayout.setLayout(jPnLayoutLayout);
        jPnLayoutLayout.setHorizontalGroup(
            jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnLayoutLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnLayoutLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnDeletar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCliente))
                    .addGroup(jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPnLayoutLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jCBMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jCBCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBtnAddNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPnLayoutLayout.setVerticalGroup(
            jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnLayoutLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnCliente)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap(22, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPnLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBuscarActionPerformed

    private void jBtnAddNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddNovoClienteActionPerformed
        CadastrarClienteView cadastrarCliente = new CadastrarClienteView();
        cadastrarCliente.setVisible(true);
    }//GEN-LAST:event_jBtnAddNovoClienteActionPerformed

    private void jBtnHomeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHomeMenuActionPerformed
        HomeView hv = new HomeView();
        this.setVisible(false);
        hv.setVisible(true);
    }//GEN-LAST:event_jBtnHomeMenuActionPerformed

    private void jBtnClientesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClientesMenuActionPerformed

    }//GEN-LAST:event_jBtnClientesMenuActionPerformed

    private void jBtnProdutosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutosMenuActionPerformed
        //ProdutoView produtoView = new ProdutoView();
        //this.setVisible(false);
        //produtoView.setVisible(true);
    }//GEN-LAST:event_jBtnProdutosMenuActionPerformed

    private void jBtnEstoqueMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEstoqueMenuActionPerformed
        MovimentacaoView movimentacaoEstoque = new MovimentacaoView();
        this.setVisible(false);
        movimentacaoEstoque.setVisible(true);
    }//GEN-LAST:event_jBtnEstoqueMenuActionPerformed

    private void jBtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeletarActionPerformed
        int linhaSelecionada = jTable.getSelectedRow();
        if (linhaSelecionada != -1) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo deletar o cliente?", "Confirmação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (resposta == JOptionPane.OK_OPTION) {
                int id = (int) jTable.getModel().getValueAt(linhaSelecionada, 0);
                clienteController.deletarClientePorId(id);

                JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso.", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                atualizarTabela();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnDeletarActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        int linhaSelecionada = jTable.getSelectedRow();
        if (linhaSelecionada != -1) {
            int id = Integer.parseInt(jTable.getModel().getValueAt(linhaSelecionada, 0).toString());
            String nome = (String) jTable.getModel().getValueAt(linhaSelecionada, 1);
            String cpfCnpj = (String) jTable.getModel().getValueAt(linhaSelecionada, 2);
            String email = (String) jTable.getModel().getValueAt(linhaSelecionada, 3);
            String telefone = (String) jTable.getModel().getValueAt(linhaSelecionada, 4);
            String cep = (String) jTable.getModel().getValueAt(linhaSelecionada, 5);
            String logradouro = (String) jTable.getModel().getValueAt(linhaSelecionada, 6);
            String bairro = (String) jTable.getModel().getValueAt(linhaSelecionada, 7);
            String numero = (String) jTable.getModel().getValueAt(linhaSelecionada, 8);
            String municipio = (String) jTable.getModel().getValueAt(linhaSelecionada, 9);
            String estado = (String) jTable.getModel().getValueAt(linhaSelecionada, 10);
            String pais = (String) jTable.getModel().getValueAt(linhaSelecionada, 11);

            AlterarClienteView alterarCliente = new AlterarClienteView(id, nome, cpfCnpj, email, telefone, cep, logradouro, bairro, numero, municipio, estado, pais);
            alterarCliente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClienteActionPerformed

    }//GEN-LAST:event_jBtnClienteActionPerformed

    void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);

        List<Cliente> listaClientes = clienteController.obterClientes();
        for (Cliente cliente : listaClientes) {
            Object[] rowData = {cliente.getIdCliente(), cliente.getNome(), cliente.getCpfCnpj(), cliente.getEmail(), cliente.getEndereco().getIdEndereco(), cliente.getTelefone().getIdTelefone()};
            model.addRow(rowData);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddNovoCliente;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCliente;
    private javax.swing.JButton jBtnClientesMenu;
    private javax.swing.JButton jBtnDeletar;
    private javax.swing.JButton jBtnEstoqueMenu;
    private javax.swing.JButton jBtnHomeMenu;
    private javax.swing.JButton jBtnProdutosMenu;
    private javax.swing.JComboBox<String> jCBCompra;
    private javax.swing.JComboBox<String> jCBEstado;
    private javax.swing.JComboBox<String> jCBMunicipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
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