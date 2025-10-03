class FiguraGeometrica {
    public double PI = 3.14159;

    public static void saudacao(){
        System.out.println("Iai meu jovem");
    }

    public double calcularArea(double paramUnico){
        return 0.0;
    }

    public double calcularArea(double base, double altura){
        return 0.0;
    }
}


class Circulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double raio) {
        return this.PI*(raio*2);
    }
}

class Retangulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double largura, double altura) {
        return this.PI*(raio*2);
    }
}

class Retangulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double base, double altura) {
        return (base*altura)/2;
    }
}



public class Teste {
    
}