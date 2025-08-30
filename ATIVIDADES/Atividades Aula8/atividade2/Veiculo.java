package atividade2;

abstract class Veiculo {
    String marca;
    String modelo;

    Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    abstract void Acelerar();

    public void ExibirDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

    class Carro extends Veiculo{
        Carro(String marca, String modelo){
            super(marca, modelo);
        }
        @Override
        void Acelerar(){
            System.out.println("Carro acelerando");
        }
    }

    class Moto extends Veiculo{
        Moto(String marca, String modelo){
            super(marca, modelo);
        }
        @Override
        void Acelerar(){
            System.out.println("Moto acelerando");
        }
    }
    
    class Main {
        public static void main(String[] args) {
            Carro carro = new Carro("Toyota", "Corolla");
            Moto moto = new Moto("Honda", "CBR");

            carro.Acelerar();
            moto.Acelerar();

            carro.ExibirDados();
            moto.ExibirDados();
            }
        }   
