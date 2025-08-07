package atividade3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        // Tenta consultar antes de definir valores
        System.out.println(animal.consultarNomeEspecie());


        // Define nome e espécie
        animal.setNome("Rex");
        animal.setEspecie("Cachorro");

        System.out.println(animal.consultarNomeEspecie());

        // Tenta mudar o nome para vazio
        animal.setNome("");
        System.out.println(animal.consultarNomeEspecie());

        // Tenta mudar o nome para outro válido
        animal.setNome("Bidu");
        System.out.println(animal.consultarNomeEspecie());

        animal.setEspecie("Gato");
        System.out.println(animal.consultarNomeEspecie());

        animal.setEspecie("");
        System.out.println(animal.consultarNomeEspecie());
    }
}
