package Seminar9.ChainOfResponsability.program;

import Seminar9.ChainOfResponsability.clase.AutobuzHandler;
import Seminar9.ChainOfResponsability.clase.Handler;
import Seminar9.ChainOfResponsability.clase.MetrouHandler;
import Seminar9.ChainOfResponsability.clase.TramvaiHandler;

import Seminar9.ChainOfResponsability.clase.*;

public class Main {
    public static void main(String[] args) {
        Handler troleibuz=new TroleibuzHandler(3);
        Handler autobuz=new AutobuzHandler(5);
        Handler tramvai=new TramvaiHandler(10);
        Handler metrou=new MetrouHandler(10000);

        troleibuz.setNextHandler(autobuz);
        autobuz.setNextHandler(tramvai);
        tramvai.setNextHandler(metrou);

        troleibuz.afisareRecomandare(8);
        troleibuz.afisareRecomandare(14);
        troleibuz.afisareRecomandare(4);
        troleibuz.afisareRecomandare(1);


        System.out.println("Pentru Cluj");
        Handler troleibuzCluj=new TroleibuzHandler(5);
        Handler autobuzCluj=new AutobuzHandler(50000);
        Handler tramvaiCluj=new TramvaiHandler(3);
        Handler metrouCluj=new MetrouHandler(2);

        metrouCluj.setNextHandler(tramvaiCluj);
        tramvaiCluj.setNextHandler(troleibuzCluj);
        troleibuzCluj.setNextHandler(autobuzCluj);

        metrouCluj.afisareRecomandare(8);
        metrouCluj.afisareRecomandare(1);


    }
}
