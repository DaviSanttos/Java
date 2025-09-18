public class Calculadora {

    public static void main(String[] args){
        Calculadora c = new Calculadora();

        c.multiplica(3, 4);  // Multiplicação de inteiros

        // Teste da multiplicação com dois doubles
        c.multiplica(2.5, 4.0);  // Multiplicação de doubles

        // Teste da multiplicação com múltiplos valores
        c.multiplica(1, 2, 3, 4, 5);  // Multiplicação de vários inteiros

    }

    public void multiplica(int a, int b){
        int result = a * b;
        System.out.println("Multiplicaçao" + result);
    }

    public void multiplica(double a, double b){
        double result = a * b;
        System.out.println("Multiplicaçao double" + result);
    }

    public void multiplica(int... valores){
        int result = 1;
        for (int valor : valores) {
            result *= valor;
        }
        System.out.println("Multiplicação de múltiplos inteiros: " + result);
    }
}