package ads.poo;

public class App{


    public static void main(String[] args) {
        
        //interface do usuário

        Carro c = new Carro();

        System.out.println(c.obterVelocidade());

       
        c.acelerar(100);
        c.acelerar(50);
        c.acelerar(150);

        System.out.println(c.obterVelocidade());

        c.frear(100);
        c.frear(150);

        System.out.println(c.obterVelocidade());


        Pessoa d = new Pessoa("Davi", "133.006.639-11");
        Pessoa v = new Pessoa("Vitoria", "143.556.789-11");

       
        System.out.println(d.imprimePessoa());
        System.out.println(v.imprimePessoa());

    }



}