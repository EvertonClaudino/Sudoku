import java.util.Scanner;

public class Sudoku {

    // ================================
    // Função que verifica um único número num
    // ================================
    // Retorna:
    // 0 → tudo OK
    // 1 → condição 1 falhou (positivo e tem d dígitos)
    // 2 → condição 2 falhou (maior dígito = d e menor = 1)
    // 3 → condição 3 falhou (soma digitos = ..., produto digitos = ...)
    // ================================


    public static int sudoku (String num, int d ){

        // ---------- CONDIÇÃO 1 ----------

        // "num é positivo e tem d dígitos"
        if (num.length() != d ){
            return 1;
        }
        // Verifica se é número positivo (só dígitos e não começa com '-')

        // Evita erro de parseInt em números grandes
        for (char c : num.toCharArray()){
            if (!Character.isDigit(c)){
                return 1;
            }
        }

        // ---------- CONDIÇÃO 2 ----------

        // "maior dígito de num = d" e "menor dígito de num = 1"
        int min = 9;
        int max = 0;

        for (char c : num.toCharArray()){
            int dig = c - '0';
            if ( dig < min ) min = dig;
            if ( dig > max ) max = dig;
        }

        if (min != 1 || max != d){
            return 2;
        }

        // ---------- CONDIÇÃO 3 ----------

        // "soma dos dígitos = 1+2+...+d" (fórmula da soma)
        int somaEsperada = d*(d+1)/2 ;
        int produtoEsperado = 1 ;


        for (int i = 1; i <= d ; i++) {
            produtoEsperado *=i;
        }

        int somaReal = 0;
        int produtoReal = 1;

        // Convertendo os caracteres de num para digitos
        for (char c : num.toCharArray()){
            int dig = c - '0';
            somaReal += dig;
            produtoReal *= dig;
        }
        // Fazendo a verificação se somaReal é diferente de somaEsperada e se produtoReal é diferente de produtoEsperado
        if (somaReal != somaEsperada || produtoReal != produtoEsperado){
            return 3;
        }

        return 0;
    }

    public static void main(String[] args){
        String[] numeros = {"123456789", "12345679", "1234567893", "234567892", "123456785", "123447789"};
        int d = 9; // tamanho do sudoku

        for (String num : numeros){
            int resultado = sudoku(num, d);

            switch (resultado){
                case 0:
                    System.out.println("O numero " + num + " passou todas as condicoes verificadas.");
                    break;
                case 1:
                    System.out.println("O numero " + num + " nao verifica a condicao \"positivo e tem 9 digitos\".");
                    break;

                case 2:
                    System.out.println("O numero " + num + " nao verifica a condicao \"maior digito 9 e menor digito 1\".");
                    break;

                case 3:
                    System.out.println("O numero " + num + " nao verifica a condicao \"soma digitos 45 e produto digitos 362880\".");
                    break;
            }
        }
    }

}