package ExercicioHeranca;

public class Telefonista extends Funcionario {
    private int estacaoDeTrabalho;

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

    // método para imprimir os dados da telefonista
    @Override
    public void mostraDados() {
        super.mostraDados(); // chama o método da superclasse Funcionario e carrega os dados dela
        // o que está abaixo é especfico desta classe e virá após carregar os dados da superclasse
        System.out.println("Estação de Trabalho: " + this.getEstacaoDeTrabalho());
    }
}
