package Seminar7.Strategy.program;

import Seminar7.Strategy.clase.PlataCardBancar;
import Seminar7.Strategy.clase.PlataCardSTB;
import Seminar7.Strategy.clase.PlataSMS;
import Seminar7.Strategy.clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator=new Validator(new PlataCardBancar(), 3);
        PlataCardSTB plataCardSTB = new PlataCardSTB();
        PlataSMS plataSMS = new PlataSMS();

    }
}
