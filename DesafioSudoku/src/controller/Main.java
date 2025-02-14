package controller;

import model.Quadrado;
import model.Tabuleiro;
import utils.BoardTemplate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tabuleiro t = new Tabuleiro();
        t.carregarLinhasPadrao();
        int opc,l,c,n;
        Quadrado q;
        boolean jogando= true;

        do{
            System.out.println("Qual operação deseja fazer?");
            System.out.println("1 - Adicionar um numero");
            System.out.println("2 - Remover um numero");
            System.out.println("3 - ver Status do jogo");
            System.out.println();
            System.out.println("0 - Sair");

            opc=sc.nextInt();

            System.out.println();
            switch (opc){
                case 1:
                    System.out.println("Em qual linha deseja inserir: ");
                     l = sc.nextInt();
                    System.out.println("Em qual coluna deseja inserir: ");
                     c = sc.nextInt();
                    System.out.println("Qual numero deseja inserir: ");
                     n = sc.nextInt();
                    t.adcionarNumero(new Quadrado(l,c,n,false));
                    break;

                case 2:
                    System.out.println("De qual linha deseja remover: ");
                     l = sc.nextInt();
                    System.out.println("De qual coluna deseja remover: ");
                     c = sc.nextInt();
                     t.removerNumero(new Quadrado(l,c));
                    break;

                case 3:
                    System.out.println("Obrigado Por jogar");
                    jogando=false;
                    break;
            }
        }while(jogando);

    }
}