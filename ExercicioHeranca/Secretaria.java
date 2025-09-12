package ExercicioHeranca;

public class Secretaria extends Funcionario {
    private int ramal;

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    // método para imprimir os dados da secretária
    @Override
    public void mostraDados() {
        super.mostraDados(); // chama o método da superclasse Funcionario e carrega os dados dela
        // o que está abaixo é específico desta classe e virá após carregar os dados da superclasse
        System.out.println("Ramal: " + this.getRamal());
    }
}
