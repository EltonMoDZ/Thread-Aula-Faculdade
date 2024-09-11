

# Sistema de Semáforos em Java

Este projeto implementa um sistema de semáforos em Java onde dois sinais de trânsito operam alternadamente. O objetivo é simular dois sinais de trânsito que nunca ficam verdes ao mesmo tempo, alternando entre os estados verde, amarelo e vermelho.

## Descrição

- Exercício proposto na aula de Sistemas Operacionais do professor Paulo.
- Aluno: Elton Alcantara Costa - 202304047367.

O sistema utiliza a classe `Semaphore` da biblioteca `java.util.concurrent` para coordenar o comportamento dos dois sinais de trânsito. Cada semáforo controla um sinal e garante que apenas um sinal esteja verde de cada vez.

## Funcionamento

- O sinal 1 começa com a luz verde, enquanto o sinal 2 começa com a luz vermelha.
- Quando o sinal 1 está verde, o sinal 2 está vermelho.
- Após o ciclo de verde, amarelo e vermelho do sinal 1, ele libera o sinal 2 para começar seu ciclo.
- O sinal 2 então passa pelo ciclo de verde, amarelo e vermelho, e libera o sinal 1 para iniciar seu ciclo novamente.
- O processo se repete indefinidamente.

## Duração dos Sinais

- Verde: 10 segundos
- Amarelo: 4 segundos
- Vermelho: 13 segundos

## Estrutura do Código

- `SistemaDeSemaforos`: Classe principal que inicia os dois sinais de trânsito.
- `Semaforo`: Classe interna que implementa a lógica de funcionamento do semáforo, incluindo os ciclos de verde, amarelo e vermelho.

## Execução

Para executar o sistema, compile e execute a classe `SistemaDeSemaforos`. As threads serão iniciadas e a simulação dos sinais de trânsito será exibida no console.

### Como Compilar e Executar

1. Compile o código:

   ```bash
   javac SistemaDeSemaforos.java
   ```
2. Execute a classe principal:
   ```bash
   java SistemaDeSemaforos
   ```
## Dependências:
- Java 17 ou superior.