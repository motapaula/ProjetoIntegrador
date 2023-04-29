package ProjetoIntegrador;

import java.util.Calendar;

public class Pagamento {
    // Atributos
    private double valorBoleto;
    private int vencimentoBoleto;
    private String nomeBeneficiario;
    private String tipoContaBarncaria;
    private double saldo;

    // Construtores
    public Pagamento(double valorBoleto, int vencimentoBoleto, String nomeBeneficiario, String tipoContaBarncaria, double saldo) {
        this.valorBoleto = valorBoleto;
        this.vencimentoBoleto = vencimentoBoleto;
        this.nomeBeneficiario = nomeBeneficiario;
        this.tipoContaBarncaria = tipoContaBarncaria;
        this.saldo = saldo;
    }

    //Get and Set
    public double getValorBoleto() {

        return valorBoleto;
    }

    public void setValorBoleto(double valorBoleto) {

        this.valorBoleto = valorBoleto;
    }

    public int getVencimentoBoleto() {

        return vencimentoBoleto;
    }

    public void setVencimentoBoleto(int vencimentoBoleto) {

        this.vencimentoBoleto = vencimentoBoleto;
    }

    public String getNomeBeneficiario() {

        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {

        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getTipoContaBarncaria() {

        return tipoContaBarncaria;
    }

    public void setTipoContaBarncaria(String tipoContaBarncaria) {

        this.tipoContaBarncaria = tipoContaBarncaria;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    // Pagamento de contas
    public void efetuarPagamento(double valorBoleto) {
        if (valorBoleto <= getSaldo()) {
            setSaldo(getSaldo() - valorBoleto);
            System.out.println("Pagamento do boleto no valor de R$ " + valorBoleto + " efetuado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o pagamento. Valor do boleto excede o saldo disponível em conta.");
        }
    }
    // Cancelando pagamentos
    public void cancelarPagamento() {
        if (getSaldo() < getValorBoleto()) {
            this.saldo = valorBoleto;
            System.out.println("Pagamento do boleto cancelado com sucesso!");
        } else {
            System.out.println("Não há pagamentos para cancelar. Operação finalizada.");
        }
    }
    // Função de agendamento
    public void agendarPagamento(Calendar dataPagamento, double valorBoleto) {
        if (valorBoleto <= getSaldo()) {
            setSaldo(getSaldo() - valorBoleto);
            System.out.println("Pagamento agendado para " + dataPagamento);
        } else {
            System.out.println("Não foi possível realizar o agendamento. Valor do pagamento excede o saldo disponível em conta.");
        }
    }

    // Informações de pagamento
    public void exibirInformacoes() {
        System.out.println("Valor da conta: " + valorBoleto);
        System.out.println("Vencimento: " + vencimentoBoleto);
        System.out.println("Nome do beneficiário: " + nomeBeneficiario);
        System.out.println("Tipo de conta: " + tipoContaBarncaria);
        System.out.println("Saldo restante: " + saldo);
    }
}
