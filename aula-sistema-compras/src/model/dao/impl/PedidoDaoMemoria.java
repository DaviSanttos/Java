package model.dao.impl;

import java.util.List;

import model.entities.Pedido;

public class PedidoDaoMemoria {
    List<Pedido> lista;
    Long contador;

    public void insert(Pedido p){
        this.lista.add(p);
        this.contador++;
    }

    public List<Pedido> listar() {
        return this.lista;
    }
}
