package test;

abstract class FiguraGeometrica {
    public abstract double calcularArea();
    
    public static void saudacao() {
        System.out.println("Olá, sou uma figura geométrica!");
    }
}

class Circulo extends FiguraGeometrica {
    private double raio;
    private static final double PI = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }
}

class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

public class Teste {
    public static void main(String[] args) {
        FiguraGeometrica.saudacao();

        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(4, 6);

        System.out.println("Área do círculo: " + c.calcularArea());
        System.out.println("Área do retângulo: " + r.calcularArea());
    }
}
