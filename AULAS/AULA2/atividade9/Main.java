package atividade9;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.nome = "Rex";
        animal1.especie = "Cachorro";
        animal1.idade = 5;
        animal1.fazerBarulho();

        Animal animal2 = new Animal();
        animal2.nome = "Luna";
        animal2.especie = "Gato";
        animal2.idade = 3;
        animal2.fazerBarulho();
    }
}
