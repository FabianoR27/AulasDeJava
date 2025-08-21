package ExercicioMetodos;

public class Funcionario {
    String nome;
    double salario;

    // Método para aumentar o salário
    void aumentaSalario (double aumento) {
        if (aumento > 0) {
            this.salario += aumento;
        } else {
            System.out.println("Aumenta o salário do home aí, ele merece!!");
        }
    }

    //Método para consultar os dados do funcionário
    void consultaDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }
}
