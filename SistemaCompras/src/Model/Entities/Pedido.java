package Model.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private long id;
	private Date date;
	private double valorTotal=0;
	
	//=======PEDIDO ITENS
	private List<ItemPedido> itens=new ArrayList<>();
	
	public void addItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double calcularTotal() {
		double soma=0;
		for(ItemPedido item:itens) {
			soma+=item.subTotal();
		}
		valorTotal=soma;
		return valorTotal;
	}
    //======
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ItemPedido> getItens() {
    	return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public void removerItem(long id) {
		itens.removeIf(item -> item.getId() == id);
	}

}
