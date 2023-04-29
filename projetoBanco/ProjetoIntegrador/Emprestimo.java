package ProjetoIntegrador;

import java.util.ArrayList;

public class Emprestimo {
            private double valorEmprestimo;
            private int prazoPagamento;
            private double taxaJuros;
            private ArrayList<Double> historicoEmprestimos;

            public Emprestimo(double valorEmprestimo, int prazoPagamento, double taxaJuros) {
                this.valorEmprestimo = valorEmprestimo;
                this.prazoPagamento = prazoPagamento;
                this.taxaJuros = taxaJuros;
                this.historicoEmprestimos = new ArrayList<>();
            }

            public void simularEmprestimo() {
                double valorTotal = this.valorEmprestimo * (1 + this.taxaJuros);
                double valorParcela = valorTotal / this.prazoPagamento;
                System.out.println("Valor total do empréstimo: " + valorTotal);
                System.out.println("Valor da parcela: " + valorParcela);
            }

            public void solicitarEmprestimo() {
                System.out.println("Empréstimo solicitado no valor de " + this.valorEmprestimo);
                this.historicoEmprestimos.add(this.valorEmprestimo);
            }

            public void consultarParcelas() {
                double valorTotal = this.valorEmprestimo * (1 + this.taxaJuros);
                double valorParcela = valorTotal / this.prazoPagamento;
                for (int i = 1; i <= this.prazoPagamento; i++) {
                    System.out.println("Parcela " + i + ": " + valorParcela);
                }
            }

            public void pagamentoAntecipado(int parcela) {
                if (parcela > 0 && parcela <= this.prazoPagamento) {
                    double valorTotal = this.valorEmprestimo * (1 + this.taxaJuros);
                    double valorParcela = valorTotal / this.prazoPagamento;
                    double valorParcelaAntecipada = valorParcela * (1 - (parcela / (double) this.prazoPagamento));
                    double valorPago = valorParcelaAntecipada * parcela;
                    System.out.println("Valor pago: " + valorPago);
                } else {
                    System.out.println("Parcela inválida.");
                }
            }

            public ArrayList<Double> getHistoricoEmprestimos() {
                return this.historicoEmprestimos;
            }
        }