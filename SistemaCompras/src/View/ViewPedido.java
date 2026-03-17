package View;

public class ViewPedido {
	public static void main(String[] args) {

		PedidoDao pedidoDao = new PedidoDao();

		LerOpcao lerOpcao = new LerOpcao();
		
		FormPedido formPedido = new FormPedido();

		int valorLido = 0;
		while ((valorLido = lerOpcao.mostrarMenueLer("Pedido")) != 6) {

			switch (valorLido) {
			case 1: // inclusao - novo pedido
				
				Pedido pedidoInclusao = formPedido.processaInclusao();
				pedidoDao.salvar(pedidoInclusao);
				break;
				
			case 2: // cancelar pedido - remoção
				
				long id1 = formPedido.processaBusca();
				Pedido pedidoRemocao=pedidoDao.buscar(id1);
				pedidoDao.excluir(pedidoRemocao);
				break;
				
			case 3: // busca
				
				long id2 = formPedido.processaBusca();
				Pedido pedidoBuscado=pedidoDao.buscar(id2);
				formPedido.setProduto(pedidoBuscado);
				formPedido.show("Busca");
				break;
				
			case 4: // atualização
				
				long id3 = formPedido.processaBusca();
				Pedido pedidoAtualizacao=pedidoDao.buscar(id3);
				formPedido.setProduto(pedidoAtualizacao);
				formPedido.processaAtualizacao();
				pedidoDao.atualizar(pedidoAtualizacao);
				break;
				
			case 5: //listar pedidos

				for (Pedido p2 : pedidoDao.listar()) {
					formPedido.setProduto(p2);
					formPedido.show("-----");
				}
				break;
			}

		}

	}

}
