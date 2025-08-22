import java.util.ArrayList;
import java.util.List;

public class TesteFormas {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(10, 20));
        formas.add(new Circulo(10));
        formas.add(new Retangulo(5, 5));
        formas.add(new Circulo(2));

        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.area();
        }

        System.out.println("A area total eh: " + areaTotal);
    }
}
