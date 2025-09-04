
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        int categoria;
        int opcionais = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a categoria (1 a 5): ");
            categoria = sc.nextInt();
            switch (categoria) {
                case 5:
                    opcionais += 50;
                case 4:
                    opcionais += 600;
                case 3:
                    opcionais += 2000;
                case 2:
                    opcionais += 100;
                case 1:
                    opcionais += 1500;
                    break;
                default:
                    System.out.println("Categoria nao encotrada");
                    sc.close();
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Seu valor é " + opcionais);
    }
}
