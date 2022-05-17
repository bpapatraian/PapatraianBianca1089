package Seminar10.State.program;

import Seminar10v2.State.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(120);
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.ieseDinService();
        autobuz.intraInService();
        autobuz.ieseDinService();
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatDeLinie();
        System.out.println("");
        autobuz.ieseDinService();
    }
}
