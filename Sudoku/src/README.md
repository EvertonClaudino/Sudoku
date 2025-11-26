# 🧩 Trabalho 1 - Sudoku (Java)

## 📘 Descrição

Este projeto consiste em implementar, em Java, um conjunto de
verificações que determinam se um número inteiro representa corretamente
uma linha válida de Sudoku.\
Na versão clássica do jogo, cada linha deve conter todos os dígitos de
**1 a 9**, sem repetições.

## 🎯 Objetivo

Criar uma classe `Sudoku` que valide inteiros com base em três condições
fundamentais:

1.  **O número é positivo e tem exatamente *d* dígitos**
2.  **O maior dígito do número é *d* e o menor é 1**
3.  **A soma dos dígitos é 1 + 2 + ... + d e o produto dos dígitos é 1 ×
    2 × ... × d**

O método deve retornar: - `0` → se todas as condições são satisfeitas
- `1`, `2` ou `3` → indicando qual condição falhou primeiro

## 🧪 Números a testar

| Número      | Erro esperado                          |
|-------------|----------------------------------------|
| 123456789   | Nenhum (válido)                        |
| 12345679    | 8 dígitos → falha condição 1           |
| 1234567893  | 10 dígitos → falha condição 1          |
| 234567892   | menor dígito ≠ 1 → falha condição 2    |
| 123456785   | maior dígito ≠ 9 → falha condição 2    |
| 123447789   | produto incorreto → falha condição 3   |


## 🖥️ Exemplo de saída esperada

    O numero 123456789 PASSOU todas as condicoes verificadas.
    O numero 12345679 NÃO verifica a condicao "positivo e tem 9 digitos".
    O numero 1234567893 NÃO verifica a condicao "positivo e tem 9 digitos".
    O numero 234567892 NÃO verifica a condicao "maior digito 9 e menor digito 1".
    O numero 123456785 NÃO verifica a condicao "maior digito 9 e menor digito 1".
    O numero 123447789 NÃO verifica a condicao "soma digitos 45 e produto digitos 362880".

## 🛠️ Estrutura Recomendada da Classe

A classe `Sudoku` pode incluir:

-   Função para validar condições
-   Função para extrair dígitos
-   Função para calcular soma e produto
-   Método `main` para interação com o utilizador

## ▶️ Como compilar e executar

``` bash
javac Sudoku.java
java Sudoku
```

## 🔍 Notas adicionais

-   Pode criar funções auxiliares para deixar o código mais organizado.
-   Teste com vários números diferentes além dos obrigatórios.
-   Lembre-se: números inteiros não podem ter zeros à esquerda.
