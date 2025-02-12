package model;

import exception.SaldoInsuficienteException;

public interface ContaInterface {

     void depositar(double valor)throws SaldoInsuficienteException;
     void sacar(double valor) throws SaldoInsuficienteException;
    double transferir(double valor, int numero) throws SaldoInsuficienteException;
}
