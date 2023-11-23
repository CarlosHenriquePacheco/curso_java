package oo_heranca.Desafio;

public class Ferrari extends Carro implements Esportivo,Luxo{
    private boolean ligarTurbo;
    private boolean ligarAr;
    //Construtor
    public Ferrari(){
        this(315);
    }
    public Ferrari(double pVelocidadeMaxima){
        super(pVelocidadeMaxima);
        setDelta(15);
    }
    @Override
    public void acelerar(){
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
    @Override
    public void frear(){
        super.frear();
        super.frear();
    }
    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }
    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }
    @Override
    public void ligarAr() {
        ligarAr = true;
    }
    @Override
    public void desligarAr() {
        ligarAr = false;
    }
    @Override
    public int getDelta(){
        if (ligarTurbo && !ligarAr){
            return 35;
        } else if (ligarTurbo && ligarAr){
            return 30;
        } else if (!ligarTurbo && !ligarAr){
            return 20;
        } else{
            return 15;
        }
    }
    
}