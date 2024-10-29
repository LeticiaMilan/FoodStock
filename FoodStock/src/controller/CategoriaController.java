package controller;

import dao.CategoriaDAO;
import java.util.ArrayList;
import model.Categoria;

public class CategoriaController {
    CategoriaDAO categoriaDao = new CategoriaDAO();
    
    public ArrayList<Categoria> buscarCategorias() {
        return categoriaDao.buscarCategorias();
    }
    
    public String buscarCategoriaPorId(int id) {
        return categoriaDao.buscarCategoriaPorId(id);
    }
}
