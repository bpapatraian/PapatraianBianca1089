package Seminar7.Strategy.clase;

public class PlataCardBancar implements ModalitatePlata {
    @Override
    public void plateste(float sumaDePlata) {
        System.out.println("S-a achitat prin SMS suma de: "+sumaDePlata +"lei");
    }
}
