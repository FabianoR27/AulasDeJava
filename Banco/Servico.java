package Banco;

// Classe base para os serviços oferecidos pelo banco (SuperClasse)
public class Servico {
    private String contratante;
    private String responsavel;
    private String dataDeContratacao;

    // Métodos
    public double calculaTaxa() {
        return 10;
    }
}
