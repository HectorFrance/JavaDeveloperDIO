package model;

import exception.SaldoInsuficienteException;

import java.util.Random;

public class Conta implements ContaInterface{

    private String titular;
    private int numero;
    private TipoConta tipo;
    private double saldo;


    Conta(String nomeTitular, TipoConta tipo, double saldo,int numero){
        this.titular=nomeTitular;
        this.tipo=tipo;
        this.saldo=saldo;
        this.numero= numero;

        System.out.println();
        System.out.println("______________________________");
        System.out.println("       Conta Criada");
        System.out.println("______________________________");
        System.out.println("Titular: "+ this.titular);
        System.out.println("Numero: "+ this.numero);
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("______________________________");
        System.out.println();
    }

    Conta(String nomeTitular, TipoConta tipo,int numero){
        this.titular=nomeTitular;
        this.tipo=tipo;
        this.saldo=0.0;
        this.numero= numero;

        System.out.println();
        System.out.println("______________________________");
        System.out.println("        Conta Criada");
        System.out.println("______________________________");
        System.out.println("Titular: "+ this.titular);
        System.out.println("Numero: "+ this.numero);
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("______________________________");
        System.out.println();
    }

    public void depositar(double valor){
        this.saldo = this.saldo+valor;
        System.out.println("Saldo atual é: R$"+this.getSaldo());
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo){
            throw new SaldoInsuficienteException();
        }else {
            this.saldo = this.saldo - valor;
            System.out.println("Saldo restante: R$" + this.getSaldo());
        }
    }

    public double transferir(double valor, int conta) throws SaldoInsuficienteException {
        if (valor > this.saldo){
            throw new SaldoInsuficienteException();
        }else {
            this.saldo = this.saldo-valor;
            System.out.println("Foram tranferidos R$"+this.saldo+" para a conta "+conta);
            return valor;
        }

    }

    public void receberTranferencia(double valor, int conta){
        this.saldo = this.saldo+valor;
        System.out.println("Transferencia de R$"+this.getSaldo()+" recebida da conta: "+conta);
    }

    public void rendimento(){
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void listar(){
        System.out.println();
        System.out.println("______________________________");
        System.out.println("           Conta ");
        System.out.println("______________________________");
        System.out.println("Titular: "+ this.titular);
        System.out.println("Numero: "+ this.numero);
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("______________________________");
        System.out.println();
    }
}
