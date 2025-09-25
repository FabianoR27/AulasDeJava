package AtividadeP1Banco;

public class TestaBanco {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();

        //SuperClasses
        c1.setNome("Fabiano");
        c1.setCpf("234.654.544-00");
        c1.setSaldo(150888.87);
        c2.setNome("Luana");
        c2.setCpf("122.555.998-99");
        c2.setSaldo(75980.80);

        // SuperClasse Funcionario
        g.setNome("Fulano de Tal");
        g.setSalario(7673);

        // SubClasse Funcionario
        g.setUsuario("fulaninho69");
        g.setSenha("luladrao171");



        // imprime dados dos clientes do banco
        System.out.println("Clientes do banco P1");
        System.out.println(c1);
        System.out.println(c2);

        // Imprimir os dados do Gerente
        System.out.println("===========================");
        System.out.println("GERENTE DO CASAL:");
        // usando o método da superClasse para mostrar os dados do gerente
        g.mostraDados();
        System.out.println("Total da receita do gerente: ");
        System.out.println(g.getSalario() + g.calculaBonusSalario());
    }
}
