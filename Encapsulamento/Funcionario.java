package Encapsulamento;

public class Funcionario {
    private String nome;
    private double salario;

    // GET e SET
    // no SET eu atribuo/altero o valor do atributo
    // no GET eu apenas leio/consulto o valor do atributo

    // métodos de acesso
    // GET - consultar os valores dos atributos
    public String getNome() {
        return this.nome;
    }
    public double getSalario() {
        return this.salario;
    }

    // SET - atribuir valores aos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
