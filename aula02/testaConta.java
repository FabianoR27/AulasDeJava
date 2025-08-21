package aula02;

public class testaConta {
    public static void main(String[] args) {
        // instancia em memória
        conta controle = new conta();
        conta controle2 = new conta();

        //objeto 1: controle
        controle.limite = 1230;
        controle.saldo = 2560;

        //objeto 2: controle2
        controle2.limite = 200;
        controle2.numero = 321;
        controle2.saldo = -980;

        System.out.println(controle.saldo);
        System.out.println(controle2.saldo);
        System.out.println(controle.saldo - controle2.limite);
        System.out.println(controle.agencia);


    }
}
