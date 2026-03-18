package View;

import java.text.Normalizer.Form;
import java.util.List;

import Model.Dao.PedidoDao;
import Model.Dao.ProdutoDao;
import Model.Entities.ItemPedido;
import Model.Entities.Pedido;
import Model.Entities.Produto;
import View.Forms.FormItemPedido;
import View.Forms.FormPedido;
import View.Forms.FormProduto;
import View.auxiliar.LerOpcao;

public class ViewPedido {
	private ProdutoDao produtoDao;
	private PedidoDao pedidoDao;

	public ViewPedido(ProdutoDao produtoDao, PedidoDao pedidoDao) {
		this.produtoDao = produtoDao;
		this.pedidoDao = pedidoDao;
	}

	public void executar() {
		LerOpcao lerOpcao = new LerOpcao();

		FormPedido formPedido = new FormPedido();
		FormItemPedido formItemPedido = new FormItemPedido();
		FormProduto formProduto = new FormProduto(produtoDao);

		int valorLido = 0;
		while ((valorLido = lerOpcao.mostrarMenueLer("Pedido")) != 6) {

			switch (valorLido) {
				case 1:
					// inclusao - novo pedido
					// form item pedido
					Integer novoId = pedidoDao.novoId();
					Pedido pedidoInclusao = formPedido.processaInclusao(novoId);

					int opcaoItem = 0;

					while (opcaoItem != 2) {

						opcaoItem = lerOpcao.mostrarMenu("Adicionar item ao pedido?\n1 - Sim\n2 - Não");

						if (opcaoItem == 1) {

							// aqui você precisaria escolher um produto
							// exemplo simplificado
							Produto produto = formProduto.selecionarProduto();

							if (produto != null) {

								ItemPedido item = formItemPedido.processaInclusao(produto);
								pedidoInclusao.addItem(item);

							} else {

								System.out.println("Produto inválido!");

							}
						}
					}
					pedidoDao.salvar(pedidoInclusao);
					break;

				case 2: // cancelar pedido - remoção

					long id1 = formPedido.processaBusca();

					Pedido pedidoRemocao = pedidoDao.buscar(id1);

					if (pedidoRemocao != null) {
						pedidoDao.remover(pedidoRemocao);
					} else {
						System.out.println("Pedido não encontrado!");
					}
					break;

				case 3: // busca

					long id2 = formPedido.processaBusca();

					Pedido pedidoBuscado = pedidoDao.buscar(id2);

					if (pedidoBuscado != null) {

						formPedido.setPedido(pedidoBuscado);
						formPedido.show("Busca do Pedido");

					} else {

						System.out.println("Pedido não encontrado!");

					}
					break;
				case 4: // atualização
					long id3 = formPedido.processaBusca();

					Pedido pedidoAtualizacao = pedidoDao.buscar(id3);

					if (pedidoAtualizacao != null) {

						int opcao = 0;

						while (opcao != 4) {
							opcaoItem = lerOpcao.mostrarMenu(
									"=== ITENS ===\n" +
											"1 - Adicionar item\n" +
											"2 - Remover item\n" +
											"3 - Listar itens\n" +
											"4 - Voltar");

							switch (opcaoItem) {

								case 1:

									Produto produto = formProduto.selecionarProduto();
									formItemPedido.adicionarItem(pedidoAtualizacao, produto);

									break;

								case 2:

									formItemPedido.removerItem(pedidoAtualizacao);

									break;

								case 3:

									formItemPedido.listarItens(pedidoAtualizacao);

									break;
							}
						}

						pedidoDao.atualizar(pedidoAtualizacao);

					} else {

						System.out.println("Pedido não encontrado!");
					}
					break;

				case 5: // listar pedidos

					List<Pedido> pedidos = pedidoDao.listar();

					if (pedidos.isEmpty()) {
						System.out.println("Nenhum pedido cadastrado.");
					} else {

						for (Pedido p2 : pedidos) {
							formPedido.setPedido(p2);
							formPedido.show("Pedido");
						}

					}

					break;
			}

		}

	}

}
