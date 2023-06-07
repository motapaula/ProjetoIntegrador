package ProjetoIntegrador;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limiteCredito;
    private double saldo;
    public int dataVencimento;
    private List<String> historicoCompras;
    private String compra;

    public CartaoCredito(double limiteCredito, double saldo, int dataVencimento) {
        this.limiteCredito = limiteCredito;
        this.saldo = saldo;
        this.dataVencimento = dataVencimento;
        this.historicoCompras = new ArrayList<String>();
    }

    public CartaoCredito(double limiteCredito, double saldo, int dataVencimento, String compra) {
    }

    public static String adicionarCompra() {
        String compra = new String();
        return compra;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public List<String> getHistoricoCompras() {
        return historicoCompras;
    }

    public void setHistoricoCompras(List<String> historicoCompras) {
        this.historicoCompras = historicoCompras;
    }

    public String adicionarCompra(String compra) {
        this.historicoCompras.add(compra);
        this.saldo -= Double.parseDouble(compra);
        return compra;
    }

    public Object consultarFatura() {
        double fatura = this.limiteCredito - this.saldo;
        System.out.println("Valor da fatura atual: R$" + fatura);
        return null;
    }

    public void realizarPagamento(double valorPagamento) {
        this.saldo += valorPagamento;
        System.out.println("Seu pagamento foi realizado com sucesso. O saldo disponível é de R$" + this.saldo);
    }

    public void bloquearCartao() {
        System.out.println("Seu cartão está bloqueado. Por favor, ligar para a central de atendimento.");
    }

    public void aumentarLimite(double valorAumento) {
        this.limiteCredito += valorAumento;
        System.out.println("Conseguimos aumentar o limite para R$" + this.limiteCredito);
    }

    public void reduzirLimite(double valorReducao) {
        if (this.saldo > (this.limiteCredito - valorReducao)) {
            System.out.println("Não é possível reduzir o limite pois o saldo disponível é menor que o novo limite.");
        } else {
            this.limiteCredito -= valorReducao;
            System.out.println("Seu limite foi reduzido para R$" + this.limiteCredito);
        }
    }
}