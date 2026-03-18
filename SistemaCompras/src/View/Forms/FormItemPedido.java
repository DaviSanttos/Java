package View.Forms;

import java.util.Date;
import java.util.Scanner;

import Model.Entities.ItemPedido;
import Model.Entities.Pedido;
import Model.Entities.Produto;

public class FormItemPedido {

	ItemPedido itemPedido;

	Scanner leitor = new Scanner(System.in);

	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}

	public void show(String cabecalho) {
		System.out.println("====" + cabecalho + "=====");

		System.out.println("itemPedido id:" + itemPedido.getId());
		System.out.println("itemPedido quantidade:" + itemPedido.getQuantidade());
		System.out.println("itemPedido preço:" + itemPedido.getPrecoUnitario());
		System.out.println("itemPedido subtotal:" + itemPedido.subTotal());
		System.out.println("itemPedido produto:" + itemPedido.getProduto().getNome());
	}

	public ItemPedido processaInclusao(Produto produto) {
		System.out.println("=== INCLUSÃO ITEM PEDIDO ===");

		ItemPedido p = new ItemPedido();

		System.out.print("Quantidade: ");
		int quantidade = leitor.nextInt();

		double precoUnitario = produto.getPreco();

		p.setQuantidade(quantidade);
		p.setPrecoUnitario(precoUnitario);
		p.setProduto(produto);

		return p;
	}

	public void processaAtualizacao(ItemPedido itemPedido) {

		System.out.println("=== ATUALIZAÇÃO ITEM PEDIDO ===");

		System.out.println("Item id: " + itemPedido.getId());

		System.out.print("Nova quantidade: ");
		double quantidade = leitor.nextDouble();

		System.out.print("Novo preço unitário: ");
		double preco = leitor.nextDouble();

		itemPedido.setQuantidade(quantidade);
		itemPedido.setPrecoUnitario(preco);

		System.out.println("Item atualizado com sucesso!");
	}

	public long processaBusca() {
		System.out.println("===REMOÇÂO===");

		System.out.println("Digite a id do pedido a ser removido:");
		System.out.println("pedido id:");
		long id = leitor.nextLong();

		return id;
	}

	public ItemPedido adicionarItem(Pedido pedido, Produto produto) {

		System.out.println("=== ADICIONAR ITEM ===");

		ItemPedido item = processaInclusao(produto);

		pedido.addItem(item);

		System.out.println("Item adicionado ao pedido!");

		return item;
	}

	public void removerItem(Pedido pedido) {

		System.out.println("=== REMOVER ITEM ===");

		System.out.print("Digite o ID do item: ");
		long id = leitor.nextLong();

		ItemPedido itemRemover = null;

		for (ItemPedido item : pedido.getItens()) {

			if (item.getId() == id) {
				itemRemover = item;
				break;
			}
		}

		if (itemRemover != null) {

			pedido.getItens().remove(itemRemover);
			System.out.println("Item removido!");

		} else {

			System.out.println("Item não encontrado!");

		}
	}

	public void listarItens(Pedido pedido) {

		System.out.println("=== ITENS DO PEDIDO ===");

		for (ItemPedido item : pedido.getItens()) {

			setItemPedido(item);
			show("Item");

		}
	}

}
