package ProjetoIntegrador;

import java.util.ArrayList;
public class ContaCorrente {
    private int NumeroConta;
    private String nomeTitular;
    private double saldo;
    private ArrayList<String> extrato;
    private double limiteTransacoes;

    public ContaCorrente() {

    }


    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }



    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList<String> extrato) {
        this.extrato = extrato;
    }

    public double getLimiteTransacoes() {
        return limiteTransacoes;
    }

    public void setLimiteTransacoes(double limiteTransacoes) {
        this.limiteTransacoes = limiteTransacoes;
    }

    public ContaCorrente(int numeroConta, String nomeTitular, double saldo, double limiteTransacoes) {
        this.NumeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.limiteTransacoes = limiteTransacoes;
        this.extrato= new ArrayList<>();
    }

    public void deposito(double valor) {
        this.saldo += valor;
        this.extrato.add("Depósito no valor de " + valor + " realizado na conta " + this.NumeroConta);
    }

    public void saque(double valor) {
        if (valor > (this.saldo + this.limiteTransacoes)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        this.extrato.add("Saque no valor de " + valor + " realizado na conta " + this.NumeroConta);
    }

    public void transferencia(double valor, ContaCorrente contaDestino) {
        if (valor > (this.saldo + this.limiteTransacoes)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        contaDestino.saldo += valor;
        this.extrato.add("Transferência no valor de " + valor + " realizada da conta " + this.NumeroConta + " para a conta " + contaDestino.NumeroConta);
        contaDestino.extrato.add("Transferência no valor de " + valor + " recebida da conta " + this.NumeroConta);
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

