package controller;

import dao.CategoriaDao;
import java.util.ArrayList;
import model.Categoria;

public class CategoriaController {
    CategoriaDao categoriaDao = new CategoriaDao();
    
    public ArrayList<Categoria> buscarCategorias() {
        return categoriaDao.buscarCategorias();
    }
    
    public String buscarCategoriaPorId(int id) {
        return categoriaDao.buscarCategoriaPorId(id);
    }
}
