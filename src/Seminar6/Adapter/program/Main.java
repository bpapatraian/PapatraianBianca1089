package Seminar6.Adapter.program;

import Seminar6.Adapter.clase.autobuz.AdapterValidatorMetrou;
import Seminar6.Adapter.clase.autobuz.AdapterValidatorObiecte;
import Seminar6.Adapter.clase.autobuz.Autobuz;
import Seminar6.Adapter.clase.metrou.ValidatorMetrou;

public class Main {
    public static void main (String[] args)
    {
        Autobuz autobuz=new Autobuz();
        ValidatorMetrou metrou=new ValidatorMetrou();

        AdapterValidatorObiecte adaptorObiecte =new AdapterValidatorObiecte(metrou);
        adaptorObiecte.validareBilet();
        adaptorObiecte.validareAbonament();


        AdapterValidatorMetrou validator=new AdapterValidatorMetrou();
        validator.validareBilet();
        validator.validareAbonament();
    }
}
