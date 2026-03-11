package model.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.entities.Produto;

public class ProdutoDaoMemoria {
    List<Produto> lista = new ArrayList<>();
    int contador = 0;

    public void insert(Produto p) {
        this.lista.add(p);
        this.contador++;
    }

    public Optional<Produto> findOne(int id) {
        return this.lista.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Produto> listar() {
        return this.lista;
    }
}
