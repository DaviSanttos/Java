package model.dao;

import java.util.List;
import java.util.Optional;

import model.dao.impl.ProdutoDaoMemoria;
import model.entities.Produto;

public class ProdutoDAO {
    public void salvar(Produto p) {
        new ProdutoDaoMemoria().insert(p);
    }

    public Optional<Produto> buscar(int id) {
        return new ProdutoDaoMemoria().findOne(id);
    }

    public List<Produto> listar() {
        return new ProdutoDaoMemoria().listar();
    }
}
