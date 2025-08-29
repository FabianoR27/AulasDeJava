package OOFatecSR;

public class Gerente {
    String nome;
    double salario;

    //metodo para aumentar o salario
    void aumentaSalario () {
        this.aumentaSalario(0.1);
    }

    void aumentaSalario (double taxa) {
        this.salario += this.salario * taxa;
    }
}
