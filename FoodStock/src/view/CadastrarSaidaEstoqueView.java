package view;

import controller.ClienteController;
import controller.MovimentacaoController;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Produto;
import model.TipoMovimentacaoEnum;
import model.Usuario;
import view.components.ClienteComboBox;
import view.components.FornecedorComboBox;
import view.components.ProdutoComboBox;

public class CadastrarSaidaEstoqueView extends javax.swing.JFrame {

    MovimentacaoController movimentacaoController = new MovimentacaoController();
    ClienteController clienteController = new ClienteController();

    ClienteComboBox clienteComboBox = new ClienteComboBox();
    ProdutoComboBox produtoComboBox = new ProdutoComboBox();

    Usuario usuarioSessao;

    public CadastrarSaidaEstoqueView() {
        initComponents();

        //setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        Color backgroundDashboard = new Color(255, 255, 255);
        getContentPane().setBackground(backgroundDashboard);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        produtoComboBox.carregarProdutos(jCBProduto);
        clienteComboBox.carregarClientesEstoque(jCBCliente);
    }

    public CadastrarSaidaEstoqueView(Usuario usuarioSessao) {
        initComponents();
        this.usuarioSessao = usuarioSessao;

        //setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        Color backgroundDashboard = new Color(255, 255, 255);
        getContentPane().setBackground(backgroundDashboard);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        produtoComboBox.carregarProdutos(jCBProduto);
        clienteComboBox.carregarClientesEstoque(jCBCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCBProduto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCBCliente = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 73, 90));
        jLabel1.setText("CADASTRAR SAÍDA DE ESTOQUE");

        jBtnConfirmar.setBackground(new java.awt.Color(31, 73, 90));
        jBtnConfirmar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnConfirmar.setForeground(new java.awt.Color(253, 253, 253));
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnVoltar.setBackground(new java.awt.Color(253, 253, 253));
        jBtnVoltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBtnVoltar.setForeground(new java.awt.Color(51, 51, 51));
        jBtnVoltar.setText("Voltar");
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(31, 73, 90));
        jLabel2.setText("Produto");

        jCBProduto.setBackground(new java.awt.Color(194, 207, 214));
        jCBProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProdutoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(31, 73, 90));
        jLabel9.setText("Cliente");

        jCBCliente.setBackground(new java.awt.Color(194, 207, 214));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(31, 73, 90));
        jLabel10.setText("Quantidade");

        jTFQuantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jBtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCBProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel2)
                        .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(54, 54, 54)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(90, 90, 90))
                        .addComponent(jTFQuantidade))
                    .addGap(58, 58, 58)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(344, 344, 344)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel10))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(173, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnVoltarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        try {
            int quantidade = Integer.parseInt(jTFQuantidade.getText());

            int produto = produtoComboBox.getProdutoId(jCBProduto);
            int cliente = clienteComboBox.getClienteIdEstoque(jCBCliente);

            if (cliente == -1) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione um cliente.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            System.out.println("Produto selecionado ID: " + produto);
            System.out.println("Cliente selecionado ID: " + cliente);
            System.out.println("Quantidade: " + quantidade);

            TipoMovimentacaoEnum tipoMovimentacao = TipoMovimentacaoEnum.ENTRADA;
            LocalDate dataAtual = LocalDate.now();

            boolean inserido = movimentacaoController.adicionarSaidaEstoque(tipoMovimentacao, dataAtual, quantidade, produto, cliente, this.usuarioSessao);

            if (inserido) {
                JOptionPane.showMessageDialog(null, "Saída de estoque inserida com sucesso.", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir saída de estoque.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            limparCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma quantidade válida.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jCBProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBProdutoActionPerformed

    private void limparCampos() {
        jTFQuantidade.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarSaidaEstoqueView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JComboBox<Cliente> jCBCliente;
    private javax.swing.JComboBox<Produto> jCBProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFQuantidade;
    // End of variables declaration//GEN-END:variables
}
