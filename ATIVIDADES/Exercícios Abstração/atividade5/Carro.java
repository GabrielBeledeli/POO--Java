package atividade5;

public class Carro {
    String modelo;
    String fabricante;
    String cor;
    
    // Mantido, mas o ideal é que seja um tipo numérico (int ou double) para cálculos de manutenção e preço.
    String kmRodados; 

    /*
     * REMOVIDO: cpfUltimoCliente
     * JUSTIFICATIVA: Esta informação não é uma característica do carro, mas sim de um
     * evento de aluguel. Manter o CPF aqui é uma falha de modelagem de dados e um
     * risco à privacidade do cliente. O correto é ter uma classe separada (ex: Aluguel)
     * que relaciona um Cliente a um Carro durante um período específico.
     */
    // String cpfUltimoCliente;

    /*
     * REMOVIDO: corCintoDeSeguranca
     * JUSTIFICATIVA: Este é um detalhe muito específico e irrelevante para a gestão
     * e a operação de uma locadora de veículos. Os clientes não alugam um carro
     * com base na cor do cinto. Devemos manter a classe focada nos atributos
     * que são importantes para o negócio.
     */
    // String corCintoDeSeguranca;
}
