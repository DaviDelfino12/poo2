package ads.poo;

public class App{


    public static void main(String[] args) {
        
        //interface do usuário

        Estudante d = new Estudante("Davi Delfino", "220274839", "ADS");

        System.out.println(d);

        System.out.println(d.getTotal());

        Estudante n = new Estudante("Natã", "20042024", "ADS");

        System.out.println(n);

        System.out.println(n.getTotal());
    }



}