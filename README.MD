# Projeto: Demonstração de Testes com Mockito

Este projeto tem como objetivo demonstrar o uso de Mockito para a criação de testes unitários em um sistema Java. Ele simula funcionalidades como integração com a API dos Correios e operações bancárias, utilizando o Mockito para facilitar a criação e verificação de comportamentos nos testes.

## Estrutura do Projeto

O projeto é composto por 7 classes principais e 3 classes de testes, organizadas da seguinte forma:

### Classes Principais

1. **ApiDosCorreios**
    - Simula uma integração fictícia com a API dos Correios.
    - Contém o método `buscaDadosComBaseNoCep`, que retorna dados de localização com base no CEP fornecido.

2. **CadastrarPessoa**
    - Responsável por cadastrar uma pessoa, utilizando a API dos Correios para obter informações de localização.
    - Método principal: `cadastrarPessoa`, que adiciona os dados de endereço à pessoa cadastrada.

3. **Conta**
    - Simula uma conta bancária, com funcionalidades de pagamento de boletos.
    - Métodos principais: `pagaBoleto`, `validaSaldo`, `debita`, e `enviaCreditoParaEmissor`.

4. **DadosLocalizacao**
    - Representa as informações de localização, como estado, cidade, logradouro, etc.

5. **EnviarMensagem**
    - Responsável por enviar e armazenar mensagens.
    - Método principal: `adicionarMensagem`.

6. **Mensagem**
    - Modelo que representa uma mensagem, contendo ID e o texto da mensagem.

7. **Pessoa**
    - Representa uma pessoa, contendo dados como nome, documento e endereço.
    - Método adicional: `ehMaiorDeIdade`, que verifica se a pessoa é maior de idade.

### Classes de Teste

1. **CadastrarPessoaTeste**
    - Testa o processo de cadastro de pessoa utilizando Mockito para simular a API dos Correios.
    - Verifica se os dados de cadastro estão corretos e se a API foi chamada como esperado.

2. **ContaTeste**
    - Testa a classe `Conta` utilizando Spy do Mockito.
    - Verifica a ordem de chamadas dos métodos e o número de vezes que certas operações são realizadas.

3. **EnviarMensagemTeste**
    - Testa a classe `EnviarMensagem` utilizando Spy.
    - Verifica se o método de adição de mensagens é chamado corretamente e se a mensagem é armazenada.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **JUnit 5**: Framework de testes utilizado para a criação e execução dos testes.
- **Mockito**: Biblioteca usada para mockar dependências e verificar comportamentos em testes unitários.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/projeto-mockito.git
   ```

2. Compile o projeto:
    ```bash
    mvn clean install
    ```
   
3. Execute os testes:
    ```bash
    mvn test

    ```

## Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.