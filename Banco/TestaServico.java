package Banco;

public class TestaServico {
    public static void main(String[] args) {
        // criando um emprestimo
        Emprestimo e = new  Emprestimo();
        SeguroDeVeiculo sdv = new SeguroDeVeiculo();

        System.out.println("Empréstimo " + e.calculaTaxa());
        System.out.println("Seguro de veículo " + sdv.calculaTaxa());
    }
}
