package ads.poo;

public class Carro {

    private int velocidadeatual;
    private final int VELOCIDADE_MAXIMA = 200;
    private boolean nitro;
    private String cor;
    private int valor;
    private String categoria;


    public void acelerar(double v){
        if (v + velocidadeatual <= VELOCIDADE_MAXIMA) {
            velocidadeatual+=v;
        } else velocidadeatual = VELOCIDADE_MAXIMA;
    }

    public void frear(double f){
        if (velocidadeatual - f >= 0) {
            velocidadeatual-=f;
        } else velocidadeatual = 0;
    }
    
    public double obterVelocidade() {
        return velocidadeatual;
    }

    
}
