package atividade3;

interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo relatório...");
    }
}

class Recibo implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo recibo...");
    }
}

class Main {
    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio();
        Imprimivel recibo = new Recibo();
        relatorio.imprimir();
        recibo.imprimir();
    }

    
}
