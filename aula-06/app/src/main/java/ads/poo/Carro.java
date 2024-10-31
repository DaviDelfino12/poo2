package ads.poo;

public class Carro {

    private int velocidadeatual;
    private final int VELOCIDADE_MAXIMA;
    private boolean nitro;
    private String cor;
    private int valor;
    private String categoria;


    public Carro(int velocidadeatual, int VELOCIDADE_MAXIMA, boolean nitro, String cor, int valor, String categoria) {
        this.velocidadeatual = 0;
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
        this.acelerar(velocidadeatual);        
        this.nitro = nitro;
        this.cor = cor;
        this.valor = valor;
        this.categoria = categoria;
    }

    public void acelerar(int v){
        this.velocidadeatual =Math.max(Math.min(velocidadeatual+v, VELOCIDADE_MAXIMA), 0);
    }

    public void frear(double f){
        if (velocidadeatual - f >= 0) {
            velocidadeatual-=f;
        } else velocidadeatual = 0;
    }
    
    public double obterVelocidade() {
        return velocidadeatual;
    }


    public String informacoesCarro() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append("velocidadeatual = ").append(velocidadeatual);
        sb.append(", VELOCIDADE_MAXIMA = ").append(VELOCIDADE_MAXIMA);
        sb.append(", nitro = ").append(nitro);
        sb.append(", cor = ").append(cor);
        sb.append(", valor = ").append(valor);
        sb.append(", categoria = ").append(categoria);
        sb.append(')');
        return sb.toString();
    }



    
}
