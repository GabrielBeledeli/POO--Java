package Atividade1;
/*
======================================================
Pergunta 1: Onde há baixa coesão?
======================================================

Resposta:
A baixa coesão na classe `Cliente` original ocorre porque ela acumula responsabilidades de domínios diferentes:

1.  `cadastrar()`:               Responsabilidade de GERENCIAMENTO DE DADOS.
                                 Refere-se à persistência e ao ciclo de vida do objeto Cliente.

2.  `calcularDesconto()`:        Responsabilidade de LÓGICA DE NEGÓCIO (VENDAS).
                                 É uma regra de negócio que se aplica a um cliente, mas não é uma
                                 característica inerente a ele.

3.  `enviarEmailPromocional()`:  Responsabilidade de LÓGICA DE COMUNICAÇÃO (MARKETING).
                                 Trata do envio de notificações, uma responsabilidade de
                                 infraestrutura ou de um serviço externo.

Uma classe coesa deve ter um propósito único. A mistura acima faz com que a classe `Cliente`
seja frágil a mudanças em qualquer um desses três domínios (Princípio da Responsabilidade Única - SRP).


======================================================
Pergunta 2: Como dividir a classe?
======================================================

Resposta:
Para aumentar a coesão, dividimos as responsabilidades em classes distintas.
A estrutura de código (não funcional) abaixo demonstra a divisão ideal, onde cada classe
agora possui alta coesão.

*/

// Estrutura da solução com alta coesão:

/**
 * 1. Classe focada apenas nos dados e identidade do cliente (Alta Coesão).
 * Sua única responsabilidade é representar um cliente.
 */
class Cliente_Refatorado {
    // Atributos como id, nome, email, etc.

    public void cadastrar() {
        // ... aqui entraria apenas a lógica para salvar a entidade Cliente ...
    }
}

/**
 * 2. Classe para a lógica de negócio de vendas (Alta Coesão).
 * Sua única responsabilidade é lidar com regras de vendas.
 */
class ServicoDeVendas_Refatorado {
    public void calcularDesconto(Cliente_Refatorado cliente) {
        // ... aqui entraria a lógica para calcular o desconto para um determinado cliente ...
    }
}

/**
 * 3. Classe para a lógica de comunicação (Alta Coesão).
 * Sua única responsabilidade é gerenciar o envio de e-mails.
 */
class ServicoDeEmail_Refatorado {
    public void enviarEmailPromocional(Cliente_Refatorado cliente) {
        // ... aqui entraria a lógica para enviar um email para o cliente ...
    }
}
