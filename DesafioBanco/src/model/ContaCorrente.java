package model;

public class ContaCorrente extends Conta{


    public ContaCorrente(String nomeTitular, double saldo,int numero) {
        super(nomeTitular, TipoConta.CORRENTE, saldo, numero);
    }

    public ContaCorrente(String nomeTitular,int numero) {
        super(nomeTitular, TipoConta.CORRENTE, numero);
    }

    public void rendimento(){
        System.out.println("Não há rendimentos em conta corrente");

    }
}
