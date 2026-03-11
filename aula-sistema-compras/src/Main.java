import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.impl.ProdutoDaoMemoria;
import model.entities.Produto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de pedidos");

        System.out.println("Escolha um opcao de compra para produto: ");

        Produto p1 = new Produto();

        p1.setId(0);
        p1.setName("carro");
        p1.setData(new Date());
        p1.setValorTotal(10.000);

        new ProdutoDaoMemoria().insert(p1);
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while (opcao != 3) {
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - fechar sistema ");


            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Bora comprar um carro entao");
                System.out.println("Voce esta comprando ----> " + p1.getName());
                
            }

        }
        sc.close();
    }
}
