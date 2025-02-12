package controller;


import exception.SaldoInsuficienteException;
import exception.TipoInvalidoException;
import model.Banco;

public class Main {
    public static void main(String[] args) throws TipoInvalidoException, SaldoInsuficienteException {

        Banco banco = new Banco();

        int ch = banco.abrirConta("Heitor",100.25,"poupanca");
        int cm = banco.abrirConta("Mayara",1000.50,"corrente");

        banco.getConta(ch).depositar(100.25);
        banco.getConta(cm).sacar(250.25);

        banco.getConta(ch).listar();
        banco.getConta(cm).listar();

        banco.tranferir(cm, ch,250.25);

        banco.getConta(ch).listar();
        banco.getConta(cm).listar();
    }
}