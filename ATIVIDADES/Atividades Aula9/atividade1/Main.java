interface FormaGeometrica {
    double calcularArea();
}

class Circulo implements FormaGeometrica {
    double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo implements FormaGeometrica {
    double altura;
    double largura;
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica retangulo = new Retangulo(3, 4);
        System.out.println("Área do retangulo: " + retangulo.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}


