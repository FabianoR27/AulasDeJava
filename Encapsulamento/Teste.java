package Encapsulamento;

public class Teste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        // observação: sem encapsulamento, os atributos seriam acessados diretamente
        // GET e SET
        // no SET eu atribuo/altero o valor do atributo
        // no GET eu apenas leio/consulto o valor do atributo

        // f.nome = "Francisco"; // sem encapsulamento
        // f.salario = 1250; // sem encapsulamento

        // atribuindo valores aos atriburtos
        f.setNome("Francisco"); // com encapsulamento
        f.setSalario(1250);

        // System.out.println(f.nome); // sem encapsulamento
        // System.out.println(f.salario); // sem encapsulamento

        // consultando os valores dos atributos
        System.out.println(f.getNome()); // com encapsulamento
        System.out.println(f.getSalario());
    }
}
