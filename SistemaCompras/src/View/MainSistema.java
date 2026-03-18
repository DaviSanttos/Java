package View;

import Model.Dao.PedidoDao;
import Model.Dao.ProdutoDao;
import View.auxiliar.LerOpcao;

public class MainSistema {

    public static void main(String[] args) {

        LerOpcao lerOpcao = new LerOpcao();

        ProdutoDao produtoDao = new ProdutoDao();
        PedidoDao pedidoDao = new PedidoDao();

        ViewProduto viewProduto = new ViewProduto(produtoDao);
        ViewPedido viewPedido = new ViewPedido(produtoDao, pedidoDao);

        int opcao = 0;

        while (opcao != 3) {

            opcao = lerOpcao.mostrarMenu(
                    "=== MENU PRINCIPAL ===\n" +
                    "1 - Produtos\n" +
                    "2 - Pedidos\n" +
                    "3 - Sair"
            );

            switch (opcao) {

                case 1:
                    viewProduto.executar();
                    break;

                case 2:
                    viewPedido.executar();
                    break;

                case 3:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}