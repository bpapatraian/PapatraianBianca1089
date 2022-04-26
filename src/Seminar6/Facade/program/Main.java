package Seminar6.Facade.program;

import Seminar6.Facade.clase.Autobuz;
import Seminar6.Facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        Facade.deschideUsi(autobuz);
        Facade.lasaLiberUsi(autobuz);
    }
}
