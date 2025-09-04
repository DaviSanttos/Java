
public class breakRotulado {

    public static void main(String[] args) {
        int i = 0;
        externo:
        for (; true;) { // laço infinito
            interno:
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 2) {
                    prt("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++;
                    break;
                }
                if (i == 7) {
                    System.out.println("continue externo");
                    i++;
                    continue externo;
                }
                if (i == 8) {
                    System.out.println("break externo");
                    break externo;

                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue interno");
                        continue interno;
                    }
                }
            }
        }
        // não é possível usar break ou continue
        // para os rótulos neste ponto do programa
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
