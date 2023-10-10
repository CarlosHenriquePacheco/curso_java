package oo_composicao;

public class Motor {
    private boolean ligado = false;
    private double fatorInjecao = 1;

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getFatorInjecao() {
        return fatorInjecao;
    }

    public void setFatorInjecao(double fatorInjecao) {
        this.fatorInjecao = fatorInjecao;
    }

    int giros(){
        if (!ligado) {
            return 0;
            } else{
                return (int) Math.round(fatorInjecao*3000);
            }
    }
}
