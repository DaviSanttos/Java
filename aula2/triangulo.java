
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tres valores separados por espaco");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isValid = (((a + b) > c) && ((a + c) > b)) && ((b + c) > a);

        if (!isValid) {
            sc.close();
            throw new Error("Categoria inválida! Deve ser de 1 a 5.");
        }

        boolean isEquilatero = (a == b) && b == c;
        boolean isIsosceles = (a == b) || (a == c) || (b == c);
        boolean isEscaleno = (a != b) && b != c;

        if (isEquilatero) System.out.println("E Equilatero");
        if (isIsosceles) System.out.println("E Isosceles");
        if (isEscaleno) System.out.println("E Escaleno");

        sc.close();   
    }
}
