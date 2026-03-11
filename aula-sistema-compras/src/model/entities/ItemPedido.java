package model.entities;

public class ItemPedido {
    Integer quantidade;
    Double precoUnitario;
    Long idPedido;
    Long IdProduto;

    public Double sum() {
        return quantidade * precoUnitario;
    }
}
