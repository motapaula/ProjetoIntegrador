package app;
import ProjetoIntegrador.*;

public class App {
    public static void main(String[] args) {
        // Instancia nova conta
        ContaCorrente contaCorrente = new ContaCorrente(1234, "Joao Silva", 1200.00, 20);

        // Instancia do Cartão de crédito e realiza compras
        CartaoCredito cartaoCredito = new CartaoCredito(1000.00, 10000.00, 1212);

        // Realiza compra com Cartão
        CartaoCredito compra = new CartaoCredito(1000.00, 10000.00, 1212);
        System.out.println(compra.adicionarCompra());

        // Instancia do Emprestimo
        Emprestimo emprestimo = new Emprestimo(5000.00, 12, 1.00);
        emprestimo.consultarParcelas();

        // Instancia do Pagamento
        Pagamento pagamento = new Pagamento(500.00, 122023, "Lojas Americanas", "Conta Corrente", 10000.00);
        System.out.println("Você pagou um boleto no valor de " + pagamento.getValorBoleto());

        ContaInvestimentos conta = new ContaInvestimentos(1000, 0.05);

        conta.aplicarValor(500);
        System.out.println("Saldo atual: " + conta.getSaldo()); // Saída: Saldo atual: 1500.0

        double resgateParcial = conta.resgatarParcial(300);
        System.out.println("Valor resgatado: " + resgateParcial); // Saída: Valor resgatado: 300.0
        System.out.println("Saldo atual: " + conta.getSaldo()); // Saída: Saldo atual: 1200.0

        double resgateTotal = conta.resgatarTotal();
        System.out.println("Valor total resgatado: " + resgateTotal); // Saída: Valor total resgatado: 1200.0
        System.out.println("Saldo atual: " + conta.getSaldo()); // Saída: Saldo atual: 0.0

        double rendimento = conta.calcularRendimento();
        System.out.println("Rendimento dos investimentos: " + rendimento); // Saída: Rendimento dos investimentos: 50.0
    }
}


