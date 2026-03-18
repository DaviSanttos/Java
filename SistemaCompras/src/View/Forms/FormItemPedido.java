package View.Forms;

import java.util.Date;
import java.util.Scanner;

import Model.Entities.ItemPedido;
import Model.Entities.Produto;
import Model.Entities.pedido;

public class FormItemPedido {
	
	ItemPedido itemPedido;
	
	Scanner leitor=new Scanner(System.in);
	
	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido=itemPedido;
	}
	
	public void show(String cabecalho) {
		System.out.println("===="+cabecalho+"=====");
	
		System.out.println("itemPedido id:"+itemPedido.getId());
		System.out.println("itemPedido nome:"+itemPedido.getNome());
		System.out.println("itemPedido preço:"+itemPedido.getPreco());
	}
	
	public ItemPedido processaInclusao(Produto produto) {
		System.out.println("=== INCLUSÃO ITEM PEDIDO ===");

		Scanner leitor = new Scanner(System.in);
		ItemPedido p = new ItemPedido();

		// gerar data para o pedido
		Date date = new Date();

		// pedir id 
		System.out.print("ID do pedido: ");
		int id = leitor.nextInt();

		// pedir quantidade
		System.out.print("Quantidade: ");
		int quantidade = leitor.nextInt();


		double precoUnitario = leitor.nextDouble();

		// setando dados no pedido
		p.setId(id);
		
		p.setQuantidade(quantidade);
		p.setPrecoUnitario(precoUnitario);

		// item pedido

		// p.setQuantidade(quantidade);   // precisa existir no Pedido

		return p;
	}
	
	public void processaAtualizacao() {
		System.out.println("===ATUALIZAÇÂO===");

		Pedido p=new pedido();
		
		
		System.out.println("pedido id:"+pedido.getId()); 
		//long id=leitor.nextLong();
		
		System.out.println("pedido nome:");
		String nome=leitor.next();
		
		System.out.println("pedido preço:");
		double preco=leitor.nextDouble();
		
		pedido.setId(pedido.getId());
		pedido.setNome(nome);
		pedido.setPreco(preco);
		
	}
	
	public long processaBusca() {
		System.out.println("===REMOÇÂO===");

		
		System.out.println("Digite a id do pedido a ser removido:");
		System.out.println("pedido id:"); 
		long id=leitor.nextLong();
		
		return id;
	}
	

}
