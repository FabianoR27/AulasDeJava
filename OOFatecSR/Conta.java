package OOFatecSR;

public class Conta {
    // estados ou atributos
    int numero;
    double saldo;
    double limite = 500;

    // comportamentos ou métodos
    // Depositar
    void deposita(double valor) {
        this.saldo += valor;
    }

    // Sacar
    void saca (double valor) {
        this.saldo -= valor;
    }

    // imprime extrato
    void imprimeExtrato() {
        System.out.println("Saldo Atual: " + this.saldo);
    }

    // Saldo disponível
    double consultaSaldoDisponivel() {
        return this.saldo + this.limite;
    }
}
