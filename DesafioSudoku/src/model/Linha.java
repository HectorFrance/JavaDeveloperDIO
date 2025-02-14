package model;

import java.util.ArrayList;

public class Linha {

    private int posicao;
    public ArrayList<Coluna> colunas;


    public Linha(int posicao, ArrayList<Coluna> colunas){
        this.posicao = posicao;
        this.colunas = colunas;
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


    public ArrayList<Coluna> getColunas() {
        return colunas;
    }

    @Override
    public String toString() {
        return  colunas.toString()+"\n";
    }
}
