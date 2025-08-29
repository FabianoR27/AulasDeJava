package OOFatecSR;

public class Conta {
    // estados ou atributos
    int numero;
    double saldo;
    double limite = 500;

    // comportamentos ou métodos
    // Depositar
    public void deposita(double valor) {
        this.saldo += valor;
        this.descontaTarifa();
    }

    // Sacar
    public void saca (double valor) {
        this.saldo -= valor;
    }

    // descontar tarifa
    private void descontaTarifa() {
        this.saldo -= 0.1;
    }

    // imprime extrato
    public void imprimeExtrato() {
        System.out.println("Saldo Atual: " + this.saldo);
    }

    // Saldo disponível
    public double consultaSaldoDisponivel() {
        return this.saldo + this.limite;
    }
}
