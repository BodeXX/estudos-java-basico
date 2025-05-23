package variaveis;

public class TiposVariaveis {

    public static void main(String[] args) {
        
        // Declara simples de variavéis
        int idade;
        idade = 27;

        int anoFabricacao = 2021;
        double salarioMinimo = 2500.00;

        // Tipos primitivos e suas peculiaridades
        byte idadeByte = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario = 1275.33;

        // Exemplo de tipagem forte
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;


         // Saída no terminal
        System.out.println("Idade: " + idade);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Salário mínimo: " + salarioMinimo);
        System.out.println("Idade (byte): " + idadeByte);
        System.out.println("Ano (short): " + ano);
        System.out.println("CEP (int): " + cep);
        System.out.println("CPF (long): " + cpf);
        System.out.println("PI (float): " + pi);
        System.out.println("Salário (double): " + salario);
        System.out.println("Número curto 2 (com cast): " + numeroCurto2);

        // Constantes
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 3.15; // Esta linha dá erro se descomentada
        
    }
}