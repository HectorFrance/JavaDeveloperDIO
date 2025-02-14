package model;

import utils.BoardTemplate;

import java.util.ArrayList;

public class Tabuleiro {

    public int contador =0;
    public ArrayList<Linha> linhas;

    public void adcionarNumero(Quadrado q){

        for(Linha linha: linhas){
            if(q.getLinha() == linha.getPosicao()) {
                for (Coluna coluna : linha.colunas) {
                    if(q.getConluna() == coluna.getPosicao()){
                        if(coluna.getNumero().getLinha() == q.getLinha()&&coluna.getNumero().getConluna() == q.getConluna()&&coluna.getNumero().getValor()==0){
                            if (q.getValor()<10&&q.getValor()>0) {
                            coluna.setNumero(q);
                            System.out.println("Numero Adicionado");
                            }else {
                                System.out.println("Numero Invalido");
                            }
                        }
                    } else if (q.getConluna() > 9 ||q.getConluna() < 1) {
                        System.out.println("Coluna Invalido");
                    }
                }
            }else if (q.getLinha() > 9 ||q.getLinha() < 1) {
                System.out.println("Linha Invalido");
            }
        }
        imprimirTabuleiro();

    }

    public void removerNumero(Quadrado q){

        for(Linha linha: linhas){
            if(q.getLinha() == linha.getPosicao()) {
                for (Coluna coluna : linha.colunas) {
                    if(q.getConluna() == coluna.getPosicao()){
                        if(coluna.getNumero().getLinha() == q.getLinha()&&coluna.getNumero().getConluna() == q.getConluna()){
                            if (coluna.getNumero().getValor()!=0 && !coluna.getNumero().isFixo()){
                                coluna.getNumero().setValor(0);
                                System.out.println("Numero Removido");
                            }else {
                                System.out.println("Posição invalida para remoção");
                            }
                        }
                    } else if (q.getConluna() > 9 ||q.getConluna() < 1) {
                        System.out.println("Posição invalida para remoção");
                    }
                }
            }else if (q.getLinha() > 9 ||q.getLinha() < 1) {
                System.out.println("Posição invalida para remoção");
            }
        }
        imprimirTabuleiro();

    }

    public void imprimirTabuleiro(){

        String[] valores = new String[81];
        int index=0;

        for(Linha linha: linhas){
            for(Coluna coluna: linha.colunas){
                valores[index++] = coluna.getNumero().toString();
            }
        }
        String tabuleiroFormatado = String.format(BoardTemplate.BOARD_TEMPLATE, valores);
        System.out.println(tabuleiroFormatado);
    }

    public void carregarLinhasPadrao(){

        ArrayList<Linha> linhas = new ArrayList<Linha>();

        ArrayList<Coluna> numeros1 = new ArrayList<Coluna>();
        numeros1.add(new Coluna (1,new Quadrado(1,1,9)));
        numeros1.add(new Coluna (2,new Quadrado(1,2,5)));
        numeros1.add(new Coluna (3,new Quadrado(1,3,8)));
        numeros1.add(new Coluna (4,new Quadrado(1,4,0)));
        numeros1.add(new Coluna (5,new Quadrado(1,5,0)));
        numeros1.add(new Coluna (6,new Quadrado(1,6,0)));
        numeros1.add(new Coluna (7,new Quadrado(1,7,0)));
        numeros1.add(new Coluna (8,new Quadrado(1,8,2)));
        numeros1.add(new Coluna (9,new Quadrado(1,9,0)));

        linhas.add(new Linha(1, numeros1));


        ArrayList<Coluna> numeros2 = new ArrayList<Coluna>();
        numeros2.add(new Coluna (1,new Quadrado(2,1,0)));
        numeros2.add(new Coluna (2,new Quadrado(2,2,0)));
        numeros2.add(new Coluna (3,new Quadrado(2,3,0)));
        numeros2.add(new Coluna (4,new Quadrado(2,4,2)));
        numeros2.add(new Coluna (5,new Quadrado(2,5,5)));
        numeros2.add(new Coluna (6,new Quadrado(2,6,6)));
        numeros2.add(new Coluna (7,new Quadrado(2,7,0)));
        numeros2.add(new Coluna (8,new Quadrado(2,8,4)));
        numeros2.add(new Coluna (9,new Quadrado(2,9,0)));

        linhas.add(new Linha(2, numeros2));

        ArrayList<Coluna> numeros3 = new ArrayList<Coluna>();
        numeros3.add(new Coluna (1,new Quadrado(3,1,0)));
        numeros3.add(new Coluna (2,new Quadrado(3,2,0)));
        numeros3.add(new Coluna (3,new Quadrado(3,3,6)));
        numeros3.add(new Coluna (4,new Quadrado(3,4,0)));
        numeros3.add(new Coluna (5,new Quadrado(3,5,0)));
        numeros3.add(new Coluna (6,new Quadrado(3,6,0)));
        numeros3.add(new Coluna (7,new Quadrado(3,7,5)));
        numeros3.add(new Coluna (8,new Quadrado(3,8,1)));
        numeros3.add(new Coluna (9,new Quadrado(3,9,7)));

        linhas.add(new Linha(3, numeros3));

        ArrayList<Coluna> numeros4 = new ArrayList<Coluna>();
        numeros4.add(new Coluna (1,new Quadrado(4,1,6)));
        numeros4.add(new Coluna (2,new Quadrado(4,2,0)));
        numeros4.add(new Coluna (3,new Quadrado(4,3,0)));
        numeros4.add(new Coluna (4,new Quadrado(4,4,3)));
        numeros4.add(new Coluna (5,new Quadrado(4,5,7)));
        numeros4.add(new Coluna (6,new Quadrado(4,6,8)));
        numeros4.add(new Coluna (7,new Quadrado(4,7,0)));
        numeros4.add(new Coluna (8,new Quadrado(4,8,0)));
        numeros4.add(new Coluna (9,new Quadrado(4,9,0)));

        linhas.add(new Linha(4, numeros4));

        ArrayList<Coluna> numeros5 = new ArrayList<Coluna>();
        numeros5.add(new Coluna (1,new Quadrado(5,1,7)));
        numeros5.add(new Coluna (2,new Quadrado(5,2,8)));
        numeros5.add(new Coluna (3,new Quadrado(5,3,4)));
        numeros5.add(new Coluna (4,new Quadrado(5,4,0)));
        numeros5.add(new Coluna (5,new Quadrado(5,5,0)));
        numeros5.add(new Coluna (6,new Quadrado(5,6,0)));
        numeros5.add(new Coluna (7,new Quadrado(5,7,9)));
        numeros5.add(new Coluna (8,new Quadrado(5,8,3)));
        numeros5.add(new Coluna (9,new Quadrado(5,9,2)));

        linhas.add(new Linha(5, numeros5));

        ArrayList<Coluna> numeros6 = new ArrayList<Coluna>();
        numeros6.add(new Coluna (1,new Quadrado(6,1,0)));
        numeros6.add(new Coluna (2,new Quadrado(6,2,0)));
        numeros6.add(new Coluna (3,new Quadrado(6,3,0)));
        numeros6.add(new Coluna (4,new Quadrado(6,4,4)));
        numeros6.add(new Coluna (5,new Quadrado(6,5,2)));
        numeros6.add(new Coluna (6,new Quadrado(6,6,9)));
        numeros6.add(new Coluna (7,new Quadrado(6,7,0)));
        numeros6.add(new Coluna (8,new Quadrado(6,8,0)));
        numeros6.add(new Coluna (9,new Quadrado(6,9,8)));

        linhas.add(new Linha(6, numeros6));

        ArrayList<Coluna> numeros7 = new ArrayList<Coluna>();
        numeros7.add(new Coluna (1,new Quadrado(7,1,4)));
        numeros7.add(new Coluna (2,new Quadrado(7,2,9)));
        numeros7.add(new Coluna (3,new Quadrado(7,3,2)));
        numeros7.add(new Coluna (4,new Quadrado(7,4,0)));
        numeros7.add(new Coluna (5,new Quadrado(7,5,0)));
        numeros7.add(new Coluna (6,new Quadrado(7,6,0)));
        numeros7.add(new Coluna (7,new Quadrado(7,7,1)));
        numeros7.add(new Coluna (8,new Quadrado(7,8,0)));
        numeros7.add(new Coluna (9,new Quadrado(7,9,0)));

        linhas.add(new Linha(7, numeros7));

        ArrayList<Coluna> numeros8 = new ArrayList<Coluna>();
        numeros8.add(new Coluna (1,new Quadrado(8,1,0)));
        numeros8.add(new Coluna (2,new Quadrado(8,2,6)));
        numeros8.add(new Coluna (3,new Quadrado(8,3,0)));
        numeros8.add(new Coluna (4,new Quadrado(8,4,5)));
        numeros8.add(new Coluna (5,new Quadrado(8,5,8)));
        numeros8.add(new Coluna (6,new Quadrado(8,6,1)));
        numeros8.add(new Coluna (7,new Quadrado(8,7,0)));
        numeros8.add(new Coluna (8,new Quadrado(8,8,0)));
        numeros8.add(new Coluna (9,new Quadrado(8,9,0)));

        linhas.add(new Linha(8, numeros8));

        ArrayList<Coluna> numeros9 = new ArrayList<Coluna>();
        numeros9.add(new Coluna (1,new Quadrado(9,1,0)));
        numeros9.add(new Coluna (2,new Quadrado(9,2,1)));
        numeros9.add(new Coluna (3,new Quadrado(9,3,0)));
        numeros9.add(new Coluna (4,new Quadrado(9,4,0)));
        numeros9.add(new Coluna (5,new Quadrado(9,5,0)));
        numeros9.add(new Coluna (6,new Quadrado(9,6,0)));
        numeros9.add(new Coluna (7,new Quadrado(9,7,7)));
        numeros9.add(new Coluna (8,new Quadrado(9,8,6)));
        numeros9.add(new Coluna (9,new Quadrado(9,9,3)));

        linhas.add(new Linha(9, numeros9));


        this.linhas=linhas;

        imprimirTabuleiro();
    }
}

