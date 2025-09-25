package AtividadeP1Banco;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // método para calcular bônus de 10% do funcionário
    public double calculaBonusSalario() {
        return this.salario * 0.1;
    }

    // método para imprimir os dados dos funcionários
    public void mostraDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Bônus: " + this.calculaBonusSalario());

    }
}
