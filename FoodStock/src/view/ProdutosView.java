package view;

import controller.CategoriaController;
import controller.FornecedorController;
import controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Fornecedor;
import model.Produto;
import view.components.CategoriaComboBox;
import view.components.FornecedorComboBox;

public class ProdutosView extends javax.swing.JFrame {
    ProdutoController produtoController = new ProdutoController();
    CategoriaController categoriaController = new CategoriaController();
    FornecedorController fornecedorController = new FornecedorController();
    CategoriaComboBox categoriaCB = new CategoriaComboBox();
    FornecedorComboBox fornecedorCB = new FornecedorComboBox();

    public ProdutosView() {
        initComponents();
        
        ArrayList<Produto> listaProdutos = produtoController.obterProdutos();
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        for (Produto produto: listaProdutos) {
            String nomeCategoria = categoriaController.buscarCategoriaPorId(produto.getCategoria());
            String nomeFornecedor = fornecedorController.buscarNomeFornecedorPorId(produto.getFornecedor());
            Object [] obj = {produto.getId_produto(), produto.getNome(), produto.getDescricao(), produto.getPrecoVenda(), 
                produto.getPrecoCusto(), produto.getQuantidade(), nomeCategoria, nomeFornecedor, produto.getFornecedor()};
            dtm.addRow(obj);
        }
        
        jTable1.getColumnModel().getColumn(8).setMinWidth(0);
        jTable1.getColumnModel().getColumn(8).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtInserirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBtDeletar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBtAlterar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBtFornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos");

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));

        jPanel2.setBackground(new java.awt.Color(31, 73, 90));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 73, 90));
        jLabel1.setText("PRODUTOS");

        jBtInserirProduto.setBackground(new java.awt.Color(253, 253, 253));
        jBtInserirProduto.setText("Inserir produto");
        jBtInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtInserirProdutoActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Descri��o", "Pre�o de venda", "Pre�o de custo", "Quantidade", "Categoria", "Fornecedor", "id fornecedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(194, 207, 214));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setSelectionBackground(new java.awt.Color(194, 207, 214));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete_icon.png"))); // NOI18N

        jBtDeletar.setBackground(new java.awt.Color(253, 253, 253));
        jBtDeletar.setText("Deletar produto");
        jBtDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtDeletarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit_icon.png"))); // NOI18N

        jBtAlterar.setBackground(new java.awt.Color(253, 253, 253));
        jBtAlterar.setText("Alterar produto");
        jBtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAlterarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_icon.png"))); // NOI18N

        jBtFornecedor.setBackground(new java.awt.Color(253, 253, 253));
        jBtFornecedor.setText("Ver fornecedor");
        jBtFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtInserirProduto)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtDeletar)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtAlterar)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtFornecedor)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtFornecedor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtInserirProduto)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(34, 57, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtInserirProdutoActionPerformed
        InserirProdutoView inserirProduto = new InserirProdutoView();
        inserirProduto.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jBtInserirProdutoActionPerformed

    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada != -1) {
           int id = Integer.parseInt(jTable1.getModel().getValueAt(linhaSelecionada, 0).toString()); 
           String nome = (String) jTable1.getModel().getValueAt(linhaSelecionada, 1);
           String descricao = (String) jTable1.getModel().getValueAt(linhaSelecionada, 2);
           double precoVenda = Double.parseDouble(jTable1.getModel().getValueAt(linhaSelecionada, 3).toString());
           double precoCusto = Double.parseDouble(jTable1.getModel().getValueAt(linhaSelecionada, 4).toString());
           int quantidade = Integer.parseInt(jTable1.getModel().getValueAt(linhaSelecionada, 5).toString());
           String categoria = (String) jTable1.getModel().getValueAt(linhaSelecionada, 6);
           String fornecedor = (String) jTable1.getModel().getValueAt(linhaSelecionada, 7);
           
           AlterarProdutoView alterarProduto = new AlterarProdutoView(id, nome, descricao, precoVenda, precoCusto, quantidade, categoria, fornecedor);
           alterarProduto.setVisible(true);
           this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jBtDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtDeletarActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada != -1) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo deletar o produto?", "Confirma��o", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if (resposta == JOptionPane.OK_OPTION) {
                int id = (int) jTable1.getModel().getValueAt(linhaSelecionada, 0);
                produtoController.deletarProdutoPorId(id);
                
                JOptionPane.showMessageDialog(null, "Produto deletado com sucesso.", "Confirma��o", JOptionPane.INFORMATION_MESSAGE);
                atualizarTabela();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtDeletarActionPerformed

    private void jBtFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtFornecedorActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada != -1) {
            
            int idFornecedor = (int) jTable1.getModel().getValueAt(linhaSelecionada, 8);
            Fornecedor fornecedor = fornecedorController.buscarFornecedorPorId(idFornecedor);
            
            VerFornecedorView verFornecedor = new VerFornecedorView(fornecedor.getId_fornecedor(),  fornecedor.getNome(), fornecedor.getCnpj(), fornecedor.getEmail(), fornecedor.getEndereco(), fornecedor.getTelefone());
            verFornecedor.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtFornecedorActionPerformed

    private void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        ArrayList<Produto> listaProdutos = produtoController.obterProdutos();
        for (Produto produto : listaProdutos) {
            Object[] rowData = { produto.getId_produto(), produto.getNome(), produto.getDescricao(), produto.getPrecoVenda(), 
                                 produto.getPrecoCusto(), produto.getQuantidade(), produto.getCategoria(), produto.getFornecedor() };
            model.addRow(rowData);
        }
    }

    
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
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtDeletar;
    private javax.swing.JButton jBtFornecedor;
    private javax.swing.JButton jBtInserirProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
