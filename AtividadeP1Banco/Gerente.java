package AtividadeP1Banco;

public class Gerente extends Funcionario {
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha (String senha) {
        this.senha = senha;
    }

    //método para calcular bônus de 15% do gerente
    @Override // sobre-escreve o método da superclasse Funcionario para calcular o bônus do gerente
    public double calculaBonusSalario() {
        return this.getSalario() * 0.65 + 100;
    }

    // método para imprimir os dados do gerente
    @Override
    public void mostraDados() {
        super.mostraDados(); // chama o método da superclasse Funcionario e carrega os dados dela
        // o que está abaixo é específico desta classe e virá após carregar os dados da superclasse
        System.out.println("Usuário: " + this.getUsuario());
        System.out.println("Senha: " + this.getSenha());
    }
}
