# Exercício de Tratamento de Exceções - Aplicação Bancária

## Visão Geral

Este projeto Java é projetado como um exercício para praticar o tratamento de exceções no contexto de uma aplicação bancária simples. O programa permite que os usuários insiram dados da conta, incluindo número da conta, nome do titular, saldo inicial e limite de saque. Em seguida, simula uma operação de saque e trata exceções potenciais usando uma classe de exceção personalizada (`DomainExceptions`).

## Estrutura do Projeto

- **Pacote:** `program`
    - `Program.java`: Classe principal contendo o ponto de entrada da aplicação.
- **Pacote:** `models.entities`
    - `Account.java`: Classe que representa uma conta bancária com métodos para saque e uma exceção personalizada para erros específicos do domínio.
- **Pacote:** `models.exceptions`
    - `DomainExceptions.java`: Classe de exceção personalizada para lidar com erros específicos do domínio relacionados à conta.

## Como Usar

1. Execute a classe `Program`.
2. Insira os dados da conta conforme solicitado:
    - Número da conta
    - Nome do titular
    - Saldo inicial
    - Limite de saque
    - Valor para saque
3. O programa tentará realizar uma operação de saque e exibirá as informações da conta.
4. Se ocorrer algum erro específico do domínio durante o saque, o programa capturará a exceção e exibirá uma mensagem de erro informativa.

## Tratamento de Exceções

O programa utiliza a classe `DomainExceptions` para lidar com exceções relacionadas às operações da conta. O bloco `try-catch` na classe `Program` garante que qualquer exceção lançada durante a operação de saque seja capturada e uma mensagem de erro informativa seja exibida.

```java
try {
    // Código para coletar dados da conta e realizar saque
} catch (DomainExceptions e) {
    System.out.println("Erro ao sacar: " + e.getMessage());
}

## Contribuição

Sinta-se à vontade para contribuir para este projeto adicionando mais recursos, melhorando o tratamento de exceções ou sugerindo aprimoramentos. Faça um fork do repositório, faça suas alterações e envie uma solicitação de pull.
