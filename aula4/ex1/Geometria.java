public class Geometria {

    public static void main (String[] args){
        Geometria g = new Geometria();

        g.area(2.5);
        g.area(22, 22);
        g.area(22, true);
    }

    public void area (double lado) {
        System.out.println("Area do quadrado");
    }

    public void area (double base, double altura) {
        System.out.println("Area do retangulo");
    }

    public void area (double raio, boolean circulo) {
        if (circulo) {
            System.out.println("Area do circulo");
        }
    }
}