package Model.Dao;

import java.util.List;

import Model.Dao.Impl.PedidoDaoMemoria;
import Model.Entities.ItemPedido;
import Model.Entities.Pedido;

public class PedidoDao {

    PedidoDaoMemoria pedidoDao = new PedidoDaoMemoria();

    public boolean salvar(Pedido pedido) {

        if (pedidoDao.salvar(pedido)) {
            System.out.println("Pedido salvo!");
            return true;
        }

        System.out.println("Pedido não foi salvo!");
        return false;
    }

    public boolean remover(Pedido pedido) {

        Pedido p = buscar(pedido.getId());

        if (p != null) {
            pedidoDao.remover(p);
            System.out.println("Pedido removido!");
            return true;
        }

        System.out.println("Pedido não existe!");
        return false;
    }

    public Pedido buscar(long id) {
        return pedidoDao.buscar(id);
    }

    public boolean atualizar(Pedido pedido) {

        Pedido p = pedidoDao.buscar(pedido.getId());

        if (p != null) {

            p.setDate(pedido.getDate());
            p.setValorTotal(pedido.getValorTotal());
            p.setItens(pedido.getItens());

            return true;
        }

        return false;
    }

    public List<Pedido> listar() {
        return pedidoDao.listar();
    }

    public Integer novoId() {
        pedidoDao.setContadorSeq();
        return pedidoDao.getContadorSeq();
    }
}
