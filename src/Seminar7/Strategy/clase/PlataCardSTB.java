package Seminar7.Strategy.clase;

public class PlataCardSTB implements ModalitatePlata{
    @Override
    public void plateste(float sumaDePlata) {
        System.out.println("S-a achitat cu cardul STB suma de: "+sumaDePlata +"lei");
    }
}
