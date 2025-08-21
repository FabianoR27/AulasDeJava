package OOFatecSR;

public class TestaCartaoDeCredito {
    public static void main(String[] args) {
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        cdc1.numero = 9876;
        cdc1.dataDeValidade = "10/02/2030";

        CartaoDeCredito cdc2 = new CartaoDeCredito();
        cdc2.numero = 6543;
        cdc2.dataDeValidade = "21/04/2030";

        System.out.println(cdc1.numero);
        System.out.println(cdc1.dataDeValidade);
        System.out.println(cdc2.numero);
        System.out.println(cdc1.dataDeValidade);
    }
}
