
import java.util.Scanner;

public class imparOuPar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um numero para saber se e impar ou par");
            int n = sc.nextInt();
            
            if (n % 2 == 0) System.out.println("Numero " + n + " E Par");
            if (n % 2 != 0) System.out.println("Numero " + n + " E Impar");
        }
    }
}
