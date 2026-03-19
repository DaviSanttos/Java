package View;

import Model.Dao.PedidoDao;
import Model.Dao.ProdutoDao;
import Model.Dao.VendaDAO;
import Model.Entities.*;

public class ApresentacaoSistema {

    public static void executar() {

        ProdutoDao produtoDao = new ProdutoDao();
        PedidoDao pedidoDao = new PedidoDao();
        VendaDAO vendaDAO = new VendaDAO();

        System.out.println("\n====================================");
        System.out.println("     DEMONSTRAÇÃO DO SISTEMA");
        System.out.println("====================================");

        // =========================
        // PRODUTOS
        // =========================
        System.out.println("\n--- PRODUTOS CADASTRADOS ---");

        Produto p1 = new Produto();
        p1.setNome("Notebook Dell");
        p1.setPreco(3500.00);
        p1.setId(1);

        Produto p2 = new Produto();
        p2.setNome("Mouse Gamer");
        p2.setPreco(150.00);
        p2.setId(2);

        Produto p3 = new Produto();
        p3.setNome("Teclado Mecânico");
        p3.setPreco(400.00);
        p3.setId(3);

        produtoDao.salvar(p1);
        produtoDao.salvar(p2);
        produtoDao.salvar(p3);

        System.out.println("\nRemovendo um produto...");
        produtoDao.excluir(p2);

        System.out.println("\nLista de produtos:");
        for (Produto p : produtoDao.listar()) {
            System.out.println("ID: " + p.getId() +
                    " | Nome: " + p.getNome() +
                    " | Preço: R$ " + p.getPreco());
        }

        // =========================
        // PEDIDOS
        // =========================
        System.out.println("\n--- PEDIDOS ---");

        Pedido ped1 = new Pedido();

        ItemPedido item1 = new ItemPedido();
        item1.setProduto(p1);
        item1.setQuantidade(1);

        ItemPedido item2 = new ItemPedido();
        item2.setProduto(p3);
        item2.setQuantidade(2);

        ped1.addItem(item1);
        ped1.addItem(item2);
        ped1.calcularTotal();

        Pedido ped2 = new Pedido();

        ItemPedido item3 = new ItemPedido();
        item3.setProduto(p3);
        item3.setQuantidade(1);

        ped2.addItem(item3);
        ped2.calcularTotal();

        pedidoDao.salvar(ped1);
        pedidoDao.salvar(ped2);

        System.out.println("\nRemovendo um pedido...");
        pedidoDao.remover(ped2);

        System.out.println("\nLista de pedidos:");
        for (Pedido p : pedidoDao.listar()) {
            System.out.println("\nPedido ID: " + p.getId());
            System.out.println("Itens:");

            for (ItemPedido item : p.getItens()) {
                System.out.println(" - " + item.getProduto().getNome() +
                        " | Qtd: " + item.getQuantidade() +
                        " | Subtotal: R$ " + item.subTotal());
            }

            System.out.println("Total do Pedido: R$ " + p.getValorTotal());
        }

        // =========================
        // VENDAS
        // =========================
        System.out.println("\n--- VENDAS ---");

        Venda v1 = new Venda(ped1);
        vendaDAO.salvar(v1);

        Venda v2 = new Venda(ped1);
        vendaDAO.salvar(v2);

        System.out.println("\nRemovendo uma venda...");
        vendaDAO.remover(v2);

        System.out.println("\nLista de vendas:");
        for (Venda v : vendaDAO.listar()) {
            System.out.println("Venda ID: " + v.getId() +
                    " | Valor: R$ " + v.getValorTotal() +
                    " | Data: " + v.getData());
        }

        System.out.println("\n====================================");
        System.out.println("     FIM DA DEMONSTRAÇÃO");
        System.out.println("====================================\n");
    }
}