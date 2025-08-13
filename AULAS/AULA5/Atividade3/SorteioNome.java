import java.util.ArrayList;
import java.util.Random;

public class SorteioNome {
    public static void main(String[] args) {
        // Cria um ArrayList com 5 nomes
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Mariana");
        nomes.add("João");
        nomes.add("Sofia");

        // Usa Random para sortear um nome da lista
        Random random = new Random();
        int indiceSorteado = random.nextInt(nomes.size());
        String nomeSorteado = nomes.get(indiceSorteado);

        // Exibe o nome sorteado
        System.out.println("O nome sorteado foi: " + nomeSorteado);
    }
}
