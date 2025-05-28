package escopoEstudo;

public class Conta {
    // Variável de escopo de classe (visivel em todos os métodos da classe)
    double saldo = 10.0;

    /**
     * Método que realiza um saque e calcula o novo saldo.
     * A variável novoSaldo só é visivel dentro deste métodos.
     */
    public void sacar(Double valor) {
        // Variável local de método: só existe dentro do método sacar
        double novoSaldo = saldo - valor;
        System.out.println("Novo saldo (dentro do método sacar): " + novoSaldo);
    }
    /**
     * Método que imprime o saldo
     */
    public void imprimirSaldo() {
        // saldo é uma variável de classe: acessivel aqui
        System.out.println("Saldo atual: " + saldo);

        // ERRO: a variável novoSaldo não existe neste escopo
        // System.out.println(novoSaldo);  <= Isso causaria erro de compilação
    }

    /**
     * Método que calcula um valor acumulado com base em parcelas.
     */
    public double calcularDividaExponencial(){
        // Variáveis locais ao método
        double valorParcela = 50.0;
        double valorMontante = 0.0;

        for (int x = 1; x <= 5; x++) {
            // valorCalculado só existe dentro do for: escopo de bloco
            double valorCalculado = valorParcela * x;
            valorMontante += valorCalculado;
        }

        // ERRO: valorCalculado e x não são visiveis aqui
        // System.out.println(valorCalculado); <= ERRO
        // System.out.println(X);  <= ERRO

        return valorMontante;
    }
}
