package operadores;

public class Operadores {
    public static void main(String[] args) {
        // Atribuição
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Doador de órgãos? " + doadorOrgao);

        // Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        System.out.println("Resultado da expressão: " + resultado);

        // Concatenação com +
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("Concatenação simples: " + nomeCompleto);

        String concatenacao;
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("1+1+1+\"1\" = " + concatenacao); // 31

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("1+\"1\"+1+1 = " + concatenacao); // 1111

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println("1+\"1\"+1+\"1\" = " + concatenacao); // 1111

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println("\"1\"+1+1+1 = " + concatenacao); // 1111

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println("\"1\"+(1+1+1) = " + concatenacao); // 13

        // Operadores unários
        int numero = 5;
        System.out.println("Número negativo: " + (-numero));
        numero++;
        System.out.println("Número incrementado: " + numero); // 6
        System.out.println("Número pós-incremento: " + (numero++)); // 6
        System.out.println("Número agora: " + numero); // 7
        System.out.println("Número pré-incremento: " + (++numero)); // 8

        boolean verdadeiro = true;
        System.out.println("Negação lógica: " + !verdadeiro); // false

        // Operador ternário
        int a = 5, b = 6;
        String resultado1 = (a == b) ? "verdadeiro" : "falso";
        System.out.println("Operador ternário (a == b): " + resultado1);

        // Operadores relacionais
        int numero1 = 1;
        int numero2 = 2;
        System.out.println("numero1 > numero2? " + (numero1 > numero2));
        System.out.println("numero1 < numero2? " + (numero1 < numero2));
        System.out.println("numero1 >= numero2? " + (numero1 >= numero2));
        System.out.println("numero1 <= numero2? " + (numero1 <= numero2));
        System.out.println("numero1 != numero2? " + (numero1 != numero2));

        // Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("Ambas as condições são verdadeiras");
        } else {
            System.out.println("Nem todas as condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma condição é verdadeira");
        }

        // Comparações avançadas
        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println("nome1 == nome2: " + (nome1 == nome2)); // true, mesmo objeto literal

        String nome3 = new String("JAVA");

        System.out.println("nome1 == nome3: " + (nome1 == nome3)); // false, objetos diferentes

        String nome4 = nome3;

        System.out.println("nome3 == nome4: " + (nome3 == nome4)); // true, mesma referência

        System.out.println("nome1.equals(nome2): " + nome1.equals(nome2)); // true, conteúdo igual
        System.out.println("nome2.equals(nome3): " + nome2.equals(nome3)); // true, conteúdo igual
        System.out.println("nome3.equals(nome4): " + nome3.equals(nome4)); // true, mesmo conteúdo

        // Exemplo com Integer
        int n1 = 130;
        int n2 = 130;
        System.out.println("n1 == n2 (primitivos): " + (n1 == n2)); // true

        Integer nObj1 = 130;
        Integer nObj2 = 130;
        System.out.println("nObj1 == nObj2 (objetos): " + (nObj1 == nObj2)); // false, objetos diferentes
        System.out.println("nObj1.equals(nObj2): " + nObj1.equals(nObj2)); // true, valores iguais

        // Operador abreviado vs normal
        int num1 = 1;
        int num2 = 1;

        if (num1 == 2 & num2++ == 2) {
            System.out.println("Condições com & são verdadeiras");
        }
        System.out.println("num2 após & : " + num2); // incrementado porque sempre avalia as duas

        num2 = 1; // reset
        if (num1 == 2 && num2++ == 2) {
            System.out.println("Condições com && são verdadeiras");
        }
        System.out.println("num2 após && : " + num2); // não incrementa porque short-circuit
        
    }
}
