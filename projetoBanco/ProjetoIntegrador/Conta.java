package ProjetoIntegrador;

public class Conta {
    protected int  Numeroconta;
    protected double saldo;
    protected String login;

    public Conta(int numeroConta) {
        this.Numeroconta = numeroConta;
        this.saldo = 0.0;
    }

    public Conta() {
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}