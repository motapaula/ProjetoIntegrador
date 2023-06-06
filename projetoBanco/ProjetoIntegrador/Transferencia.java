package ProjetoIntegrador;

import java.util.Date;


public class Transferencia extends ContaCorrente {
    private int numeroConta;
    private int contaDestino;
    private double valor;
    private String tipoTransferencia; // TED, DOC, entre outras
    private Date dataTransferencia;
    private int limiteTransacoes;

    public Transferencia(ContaCorrente contaOrigem, int numeroConta, int contaDestino, double valor, String tipoTransferencia) {
        super();
        this.numeroConta = numeroConta;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.tipoTransferencia = tipoTransferencia;
        this.dataTransferencia = new Date(); // data atual
    }

    public void realizarTransferencia() {
        if (this.getSaldo() < valor) {
            System.out.println("Saldo insuficiente para realizar a transferência!");

        }

        /*numeroConta.debitar(valor);
        contaDestino.creditar(valor);
        System.out.println("Transferência realizada com sucesso!");
        System.out.println("Valor transferido: " + valor);
        System.out.println("Conta de origem: " + numeroConta.getNumeroConta());
        System.out.println("Conta de destino: " + contaDestino.getNumeroConta());
        System.out.println("Data da transferência: " + dataTransferencia);
        System.out.println("Tipo de transferência: " + tipoTransferencia);*/
    }

    public void transferencia(double valor, ContaCorrente contaDestino) {
        if (valor > (this.getSaldo() + this.limiteTransacoes)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.setSaldo(this.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        this.getExtrato().add("Transferência no valor de " + valor + " realizada da conta " + this.getNumeroConta() + " para a conta " + contaDestino.getNumeroConta());
        contaDestino.getExtrato().add("Transferência no valor de " + valor + " recebida da conta " + this.getNumeroConta());

    }
    // getters e setters

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public Date getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(Date dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }
}