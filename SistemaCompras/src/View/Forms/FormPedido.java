package View.Forms;

import java.util.Date;
import java.util.Scanner;

import Model.Entities.ItemPedido;
import Model.Entities.Pedido;

public class FormPedido {
	
	Pedido pedido;
	
	Scanner leitor=new Scanner(System.in);
	
	public void setPedido(Pedido pedido) {
		this.pedido=pedido;
	}
	
	public void show(String cabecalho) {
		System.out.println("==== " + cabecalho + " ====");

		System.out.println("Pedido id: " + pedido.getId());

		for (ItemPedido item : pedido.getItens()) {

			System.out.println("Produto: " + item.getProduto().getNome());
			System.out.println("Quantidade: " + item.getQuantidade());
			System.out.println("Preço: " + item.getPrecoUnitario());
			System.out.println("Subtotal: " + item.subTotal());
			System.out.println("---------------------");
		}
	}

	public Pedido processaInclusao(Integer id) {
		System.out.println("=== INCLUSÃO PEDIDO ===");

		Pedido p = new Pedido();

		// gerar data para o pedido
		Date date = new Date();

		// setando dados no pedido
		p.setId(id);
		p.setDate(date);

		return p;
	}
	
	public void processaAtualizacao() {

		System.out.println("=== ATUALIZAÇÃO DO PEDIDO ===");

		System.out.println("Pedido id: " + pedido.getId());
		System.out.println("Data atual: " + pedido.getDate());

		System.out.print("Nova data: ");
		Date novaData = new Date(leitor.nextLong());

		pedido.setDate(novaData);
	}
	
	public long processaBusca() {
		System.out.println("=========");

		
		System.out.println("Digite a id do pedido a ser buscado:");
		System.out.println("pedido id:"); 
		long id=leitor.nextLong();
		
		return id;
	}
	

}
