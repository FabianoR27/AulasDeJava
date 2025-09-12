package ExercicioHeranca;

public class TestaFuncionarios {
    public static void main(String args[]) {
        Gerente g = new Gerente();
        Telefonista t = new Telefonista();
        Secretaria s = new Secretaria();

        // SuperClasse Funcionario
        g.setNome("Fabiano");
        g.setSalario(5000.22);

        // SubClasse Funcionario
        g.setUsuario("fabiano777");
        g.setSenha("luladrao171");

        //SuperClasse Telefonista
        t.setNome("Maria");
        t.setSalario(7223.21);

        //SubClasse Telefonista
        t.setEstacaoDeTrabalho(12);

        //SuperClasse Secretaria
        s.setNome("Barbara");
        s.setSalario(4335.99);

        //SubClasse Secretaria
        s.setRamal(1234);

        // Imprimir os dados do Gerente
        System.out.println("===========================");
        System.out.println("GERENTE:");
        // usando o método da superClasse para mostrar os dados do gerente
        g.mostraDados();


        // Imprimir os dados do Telefonista
        System.out.println("===========================");
        System.out.println("TELEFONISTA:");
        // usando o método da superClasse para mostrar os dados do telefonista
        t.mostraDados();

        // Imprimir os dados da Secretária
        System.out.println("===========================");
        System.out.println("SECRETÁRIA:");
        // usando o método da superClasse para mostrar os dados da secretária
        s.mostraDados();
    }
}

