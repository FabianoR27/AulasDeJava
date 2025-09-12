package Banco;

// Classe que representa um seguro de veículo oferecido pelo banco (SubClasse)
public class SeguroDeVeiculo extends Servico {
    // Geral
    private String contratante;
    private String responsavel;
    private String dataDeContratacao;

    // Seguro de veículo
    private Emprestimo veiculo;
    private double valorDoSeguroDeVeiculo;
    private double franquia;
}
