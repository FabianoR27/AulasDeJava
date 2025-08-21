package ExercicioMetodos;

public class TestaFuncionario {
    public static void main(String[] args) {

        // Criando instâncias de Funcionario e atribuindo valores
        // aos atributos 'nome' e 'salario'
        Funcionario f1 = new Funcionario(); // Criação do objeto f1
        f1.nome = "João";
        f1.salario = 3000.00;

        Funcionario f2 = new Funcionario(); // Criação do objeto f2
        f2.nome = "Maria";
        f2.salario = 4000.00;

        System.out.println("Funcionário 1: " + f1.nome + ", Salário: " + f1.salario);
        System.out.println("Funcionário 2: " + f2.nome + ", Salário: " + f2.salario);

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("Dados após o aumento de salário >>>");

        // Aumentando o salário do funcionário f1
        f1.aumentaSalario(953.50);
        f1.consultaDados();

        // Aumentando o salário do funcionário f2
        f2.aumentaSalario(444.50);
        f2.consultaDados();

    }
}