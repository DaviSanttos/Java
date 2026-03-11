package model.dao;

import java.util.List;

import model.dao.impl.PedidoDaoMemoria;
import model.entities.Pedido;

public class PedidoDAO {
    public void salvar(Pedido p) {
        new PedidoDaoMemoria().insert(p);
    }
    public List<Pedido> listar() {
        return new PedidoDaoMemoria().listar();
    }
}
