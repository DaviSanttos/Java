
import java.util.Scanner;

public class testeScaner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Digite alguma coisa");
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }
    }
}
