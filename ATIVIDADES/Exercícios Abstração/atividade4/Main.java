package atividade4;

public class Main {
    public static void main(String[] args) {

        Departamento departamento = new Departamento();
        departamento.nome = "TI";

        Funcionario f1 = new Funcionario();
        f1.nome = "Ana";
        f1.departamento = departamento;
        departamento.lista_funcionarios.add(f1);

        Funcionario f2 = new Funcionario();
        f2.nome = "Bruno";
        f2.departamento = departamento;
        departamento.lista_funcionarios.add(f2);

        Funcionario f3 = new Funcionario();
        f3.nome = "Carlos";
        f3.departamento = departamento;
        departamento.lista_funcionarios.add(f3);

        System.out.println("Departamento: " + departamento.nome);
        System.out.print("Funcionários: ");
        for (Funcionario f : departamento.lista_funcionarios) {
            System.out.print(f.nome + " ");
        }
    }
}
