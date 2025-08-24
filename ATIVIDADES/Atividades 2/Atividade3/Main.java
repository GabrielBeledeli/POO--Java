package Atividade3;

public class Main {
    public static void main(String[] args) {
        Departamento ti = new Departamento("TI");
        Departamento rh = new Departamento("RH");

        Funcionario f1 = new Funcionario("Ana", 5000.0, ti);
        Funcionario f2 = new Funcionario("Bruno", 4500.0, rh);
        Funcionario f3 = new Funcionario("Carlos", 6000.0, ti);

        ti.adicionarFuncionario(f1);
        ti.adicionarFuncionario(f3);
        rh.adicionarFuncionario(f2);

        ti.listarFuncionarios();
        rh.listarFuncionarios();
    }
}
