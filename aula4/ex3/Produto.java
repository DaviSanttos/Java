public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public static void main (String[] args){
        Produto p1 = new Produto();
        Produto p2 = new Produto("Celta", 15000.00);
        Produto p3 = new Produto("Voyagem", 30000.00, 10);

        p1.mostrarDetalhes();
        p2.mostrarDetalhes();
        p3.mostrarDetalhes();
    }

    public Produto () {
        this.nome = "Corsa";
        this.preco = 18500.00;
        this.quantidade = 1;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrarDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("------------------------------------");
    }
}