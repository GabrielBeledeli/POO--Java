package atividade1;

import java.util.ArrayList;

abstract class Animal {
    String nome;

    Animal(String nome){
        this.nome = nome;
    }

    abstract void emitirSom();
}

class Cachorro extends Animal {
    Cachorro(String nome) { super(nome); }
        @Override
        void emitirSom() {
            System.out.println("Au au");
        }
}

class Gato extends Animal {
    Gato(String nome) { super(nome); }
    @Override
    void emitirSom() {
        System.out.println("Miau");
    }
}

class Main {
    public static void main(String[] args) {
    ArrayList<Animal> animais = new ArrayList<>();
    Cachorro cachorro = new Cachorro("Rex");
    Gato gato = new Gato("Garfield");
    animais.add(cachorro);
    animais.add(gato);


    for (Animal animal : animais) {
        animal.emitirSom();
        System.out.println();
    }
    }
}