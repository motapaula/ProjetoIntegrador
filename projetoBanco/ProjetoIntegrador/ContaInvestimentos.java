package ProjetoIntegrador;

public class ContaInvestimentos {
    private double valorAplicado;
    private double taxa;
    private double saldo;

    // Construtor
    public ContaInvestimentos(double valorAplicado, double taxa) {
        this.valorAplicado = valorAplicado;
        this.taxa = taxa;
        this.saldo = valorAplicado;
    }

    // Método para aplicar um valor no fundo de investimentos
    public void aplicarValor(double valor) {
        this.saldo += valor;
    }

    // Método para resgatar o valor total aplicado
    public double resgatarTotal() {
        double valorResgate = saldo;
        saldo = 0;
        return valorResgate;
    }

    // Método para resgatar um valor parcialmente
    public double resgatarParcial(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Valor de resgate excede o saldo disponível.");
            return 0;
        }
    }

    // Método para calcular o rendimento dos investimentos
    public double calcularRendimento() {
        double rendimento = valorAplicado * taxa;
        return rendimento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

