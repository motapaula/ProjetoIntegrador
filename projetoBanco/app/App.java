package app;
import ProjetoIntegrador.*;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        //Instancia nova conta
        ContaCorrente contaCorrente = new ContaCorrente(1245, "João Rodrigues", 10000.00);

        //Instancia do Cartão de crédito
        CartaoCredito cartaoCredito = new CartaoCredito(1000.00, 10000.00, 1212);
        System.out.println("Seu cartão de crédito tem a fatura no valor de " + cartaoCredito.consultarFatura());

        //Realiza compra com Cartão
        cartaoCredito.adicionarCompra("Livros");
        System.out.println("Você comprou um " + cartaoCredito.adicionarCompra());


        //Instancia do Emprestimo
        Emprestimo emprestimo = new Emprestimo(5000.00, 12, 1.00);
        System.out.println("Você tem empréstimo no valor de " + emprestimo.consultarParcelas());

        //Instancia do Pagamento
        Pagamento pagamento = new Pagamento(500.00, 122023, "Lojas Americanas", "Conta Corrente", 10000.00);
        System.out.println("Você pagou um boleto no valor de " + pagamento.getValorBoleto());

    }
}
