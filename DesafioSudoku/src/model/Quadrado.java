package model;

public class Quadrado {

    private int linha;
    private int conluna;
    private int valor;
    private boolean fixo;

    public Quadrado(int linha, int conluna, int valor) {
        this.linha = linha;
        this.conluna = conluna;
        this.valor = valor;
        this.fixo = true;
    }

    public Quadrado(int linha, int conluna, int valor, boolean fixo) {
        this.linha = linha;
        this.conluna = conluna;
        this.valor = valor;
        this.fixo = fixo;
    }

    public Quadrado(int linha, int conluna) {
        this.linha = linha;
        this.conluna = conluna;
    }


    public boolean isFixo() {
        return fixo;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getConluna() {
        return conluna;
    }

    public void setConluna(int conluna) {
        this.conluna = conluna;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {

//        if (valor == 0) {
//            return "";
//        }
//        return String.format(String.valueOf(this.valor));

        return this.valor == 0 ? "  " : String.format("%2d", this.valor);
    }
}
