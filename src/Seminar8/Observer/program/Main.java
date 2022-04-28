package Seminar8.Observer.program;

import Seminar8.Observer.clase.Autobuz;
import Seminar8.Observer.clase.Calator;
import Seminar8.Observer.clase.Observer;
import Seminar8.Observer.clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect autobuz=new Autobuz(32);


        Observer calator1=new Calator("Alexandru");
        Observer calator2=new Calator("Mihai");
        Observer calator3=new Calator("George");

        autobuz.adaugaCalatori(calator1);
        autobuz.adaugaCalatori(calator2);
        autobuz.notificareCalatori();
        autobuz.adaugaCalatori(calator3);
        autobuz.stergeCalator(calator1);
        autobuz.notificareCalatori();
    }
}
