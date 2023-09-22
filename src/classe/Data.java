package classe;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    //Construtor
    Data(int pdia,int pmes,int pano){
        dia = pdia;
        mes = pmes;
        ano = pano;
    }
    //Getters and Setters
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String obterDataFormatada(){
        return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
    }
}
