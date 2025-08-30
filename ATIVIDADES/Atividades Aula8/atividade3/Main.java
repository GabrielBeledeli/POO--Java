import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Ana", 5000));
        funcionarios.add(new Vendedor("Carlos", 3000));
        funcionarios.add(new Gerente("Beatriz", 7000));
        funcionarios.add(new Vendedor("João", 2500));

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - Bônus: R$ " + f.calcularBonus());
        }
    }
}
