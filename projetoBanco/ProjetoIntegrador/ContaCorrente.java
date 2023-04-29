package ProjetoIntegrador;

import java.util.ArrayList;
public class ContaCorrente {
    public int numeroConta;
    private String nomeTitular;
    double saldo;
    ArrayList<String> extrato;
    private double limiteTransacoes;

    public ContaCorrente() {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.limiteTransacoes = limiteTransacoes;
        this.extrato= new ArrayList<>();
    }


    public void deposito(double valor) {
        this.saldo += valor;
        this.extrato.add("Depósito no valor de " + valor + " realizado na conta " + this.numeroConta);
    }

    public void saque(double valor) {
        if (valor > (this.saldo + this.limiteTransacoes)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        this.extrato.add("Saque no valor de " + valor + " realizado na conta " + this.numeroConta);
    }

    public void transferencia(double valor, ContaCorrente contaDestino) {
        if (valor > (this.saldo + this.limiteTransacoes)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        contaDestino.saldo += valor;
        this.extrato.add("Transferência no valor de " + valor + " realizada da conta " + this.numeroConta + " para a conta " + contaDestino.numeroConta);
        contaDestino.extrato.add("Transferência no valor de " + valor + " recebida da conta " + this.numeroConta);
    }

    public void consultaSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void extrato() {
        System.out.println("Histórico de transações:");
        for (String transacao : this.extrato) {
            System.out.println(transacao);
        }
    }
}
