package model;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String nomeTitular, double saldo,int numero) {
        super(nomeTitular, TipoConta.POUPANCA, saldo, numero);
    }

    public ContaPoupanca(String nomeTitular, int numero) {
        super(nomeTitular, TipoConta.POUPANCA, numero);
    }

    public void rendimento(){
        double redimento = this.getSaldo() + (this.getSaldo()*0.05);
        System.out.println("O redimento de mês foi de R$: "+(this.getSaldo() + (this.getSaldo()*0.05)));
        this.setSaldo(redimento);
    }
}
