package model;

import exception.SaldoInsuficienteException;
import exception.TipoInvalidoException;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Banco {
    String nome;
    Random random = new Random();
    Map<Integer, Conta> contas = new HashMap<>();




    public int abrirConta(String nomeTitular, double saldo, String tipo) throws TipoInvalidoException {
        Conta conta;
        if(tipo.equalsIgnoreCase("Corrente")){
          conta = new ContaCorrente(nomeTitular, saldo, gerarNumeroConta());
          contas.put(conta.getNumero(),conta);

        } else if (tipo.equalsIgnoreCase("Poupanca")){
            conta = new ContaPoupanca(nomeTitular, saldo, gerarNumeroConta());
            contas.put(conta.getNumero(),conta);
        }else {
            throw new TipoInvalidoException();
        }
        return  conta.getNumero();
    }

    public int abrirContaSemsaldo(String nomeTitular,String tipo) throws TipoInvalidoException {
        Conta conta;
        if(tipo.equalsIgnoreCase("Corrente")){
            conta = new ContaCorrente(nomeTitular,  gerarNumeroConta());
            contas.put(conta.getNumero(),conta);

        } else if (tipo.equalsIgnoreCase("Poupanca")){
            conta = new ContaPoupanca(nomeTitular, gerarNumeroConta());
            contas.put(conta.getNumero(),conta);
        }else {
            throw new TipoInvalidoException();
        }
        return  conta.getNumero();
    }

    public void tranferir(int contaSaida, int contaDestino, double valor) throws SaldoInsuficienteException {
        contas.get(contaSaida).transferir(valor, contaDestino);
        contas.get(contaDestino).receberTranferencia(valor, contaSaida);
    }

    public int gerarNumeroConta(){
       int numero=10000 + random.nextInt(90000);
        return numero;
    }

    public Conta getConta(int numero){
        return contas.get(numero);
    }

}


