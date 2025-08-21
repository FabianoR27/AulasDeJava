package OOFatecSR;

public class TestaTudo {
    public static void main(String[] args) { // método principal (método de entrada do programa)
        Agencia a1 = new Agencia();
        Cliente c1 = new Cliente();
        Conta co1 = new Conta();
        CartaoDeCredito cdc1 = new CartaoDeCredito();

        c1.codigo = 1;
        c1.nome = "Fabiano Ramos";
        a1.numero = 123232;

        co1.numero = 1231;
        co1.saldo = 10000;
        co1.limite = 500;

        cdc1.numero = 11111;
        cdc1.dataDeValidade = "01/02/2030";

        System.out.println("Agência: " + a1.numero);
        System.out.println("Conta Corrente: " + co1.numero);
        System.out.println("Código do Cliente: " + c1.codigo);
        System.out.println("Nome: " + c1.nome);
        System.out.println("Saldo: " + co1.saldo);
        System.out.println("Limite: " + co1.limite);
        System.out.println("N. do Cartão: " + cdc1.numero);
        System.out.println("Validade: " + cdc1.dataDeValidade);

    }
}
