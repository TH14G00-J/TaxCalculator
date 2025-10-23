# Tax Calculator

## Descrição

Projeto simples em Java que calcula impostos para contribuintes, podendo ser pessoas físicas (Individual) ou jurídicas (Company). O programa lê dados de N contribuintes fornecidos pelo usuário e calcula o imposto de cada um, além do total arrecadado.

As regras de cálculo são:

**Pessoa física (Individual):**

* Renda abaixo de 20.000: 15% de imposto.
* Renda igual ou acima de 20.000: 25% de imposto.
* Gastos com saúde podem abater 50% do imposto.

**Pessoa jurídica (Company):**

* Imposto de 16% sobre a renda.
* Se tiver mais de 10 funcionários, o imposto é 14%.

## Estrutura do projeto

* **model.TaxPayer**: classe abstrata que define atributos e método abstrato `tax()`.
* **model.Individual**: subclass de TaxPayer que representa pessoa física e implementa cálculo de imposto.
* **model.Company**: subclass de TaxPayer que representa pessoa jurídica e implementa cálculo de imposto.
* **Main**: classe principal que realiza a entrada de dados, cálculo e exibição de impostos.

## Funcionalidades

* Cadastro de múltiplos contribuintes (pessoas físicas ou jurídicas).
* Cálculo de imposto individual com base nas regras específicas.
* Exibição do total de impostos arrecadados.
* Uso de polimorfismo e herança para reutilização de código.

## Como executar

1. Compile o projeto com:

   ```
   javac model/*.java Main.java
   ```
2. Execute a aplicação:

   ```
   java Main
   ```
3. Siga as instruções no terminal para informar o número de contribuintes e seus dados.

## Exemplo de uso

```
Enter the number of tax payers: 2
Tax payer #1 data:
Individual or company (i/c)? i
Name: John Doe
Annual income: 50000
Health expenditures: 2000
Tax payer #2 data:
Individual or company (i/c)? c
Name: ACME Corp
Annual income: 400000
Number of employees: 25

TAXES PAID
John Doe: $ 11500.00
ACME Corp: $ 56000.00

TOTAL TAXES: 67500.00
```

## Tecnologias utilizadas

* Java SE
* Conceitos de POO: herança, polimorfismo, encapsulamento
