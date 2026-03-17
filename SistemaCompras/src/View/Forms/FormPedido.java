package View.Forms;

import java.util.Scanner;

import Model.Entities.pedido;

public class FormPedido {
	
	Pedido pedido;
	
	Scanner leitor=new Scanner(System.in);
	
	public void setPedido(Pedido pedido) {
		this.pedido=pedido;
	}
	
	public void show(String cabecalho) {
		System.out.println("===="+cabecalho+"=====");
	
		System.out.println("pedido id:"+pedido.getId());
		System.out.println("pedido nome:"+pedido.getNome());
		System.out.println("pedido preço:"+pedido.getPreco());
	}
	
import java.util.Date;
import java.util.Scanner;

	public Pedido processaInclusao() {
		System.out.println("=== INCLUSÃO ===");

		Scanner leitor = new Scanner(System.in);
		Pedido p = new Pedido();

		// gerar id
		System.out.print("Pedido id: ");
		long id = leitor.nextLong();
		leitor.nextLine(); // limpar buffer

		// gerar data para o pedido
		Date date = new Date();

		// pedir quantidade
		System.out.print("Quantidade: ");
		int quantidade = leitor.nextInt();

		// setando dados no pedido
		p.setId(id);
		p.setDate(date);
		p.setQuantidade(quantidade);   // precisa existir no Pedido

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
