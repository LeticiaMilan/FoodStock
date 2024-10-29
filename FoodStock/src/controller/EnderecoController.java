package controller;

import dao.EnderecoDao;

public class EnderecoController {
    private EnderecoDao enderecoDao = new EnderecoDao();
    
    public void inserirEndereco(String logradouro, String bairro, String numero, String cep, String municipio, String estado, String pais) {
        enderecoDao.inserirEndereco(logradouro, bairro, numero, cep, municipio, estado, pais);
    }
}
