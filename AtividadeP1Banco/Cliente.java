package AtividadeP1Banco;

public class Cliente {
    private String nome;
    private String cpf;
    private double saldoEmConta;

    // métodos de acesso
    // consulta os valores dos atributos (GET)
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public Double getSaldo() {
        return saldoEmConta;
    }

    // Atribuir valores aos atributos (SET)
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSaldo(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }


    @Override
    public String toString() {
        return "Cliente: " + nome + " | CPF: " + cpf + " | Saldo disponível: " + saldoEmConta;
    }
}
