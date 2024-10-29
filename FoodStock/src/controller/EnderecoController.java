package controller;

import dao.EnderecoDAO;
import model.Endereco;

public class EnderecoController {
    private EnderecoDAO enderecoDao = new EnderecoDAO();
    
    public int inserirEndereco(String logradouro, String bairro, String numero, String cep, String municipio, String estado, String pais) {
        return enderecoDao.inserirEndereco(logradouro, bairro, numero, cep, municipio, estado, pais);
    }
    
    public Endereco buscarEnderecoPorId(int id) {
        return enderecoDao.buscarEnderecoPorId(id);
    }
}
