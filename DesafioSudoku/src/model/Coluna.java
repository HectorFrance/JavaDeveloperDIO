package model;

import java.util.ArrayList;

public class Coluna {

    private int posicao;
    private Quadrado numero;

    public Coluna(int posicao, Quadrado numero){
        this.posicao = posicao;
        this.numero= numero;
    }

    public boolean adcionarNumero(Quadrado q){

        return false;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getPosicao() {
        return posicao;
    }

    public Quadrado getNumero() {
        return numero;
    }

    public void setNumero(Quadrado numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero.toString();
    }
}
