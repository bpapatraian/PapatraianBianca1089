package Seminar10.Command.program;

import Seminar10v2.Command.clase.Autobuz;
import Seminar10v2.Command.clase.ComandaPlecareTraseu;
import Seminar10v2.Command.clase.Operator;

public class Main2 {
    public static void main(String[] args) {
        Operator operator=new Operator();
        Autobuz autobuz1=new Autobuz("bmw");
        Autobuz autobuz2=new Autobuz("audi");

        ComandaPlecareTraseu comandaPlecareTraseu= new ComandaPlecareTraseu(1, autobuz1);
        operator.invocareComanda(comandaPlecareTraseu);

        operator.invocareComanda(new ComandaPlecareTraseu(2,autobuz2));
        operator.invocareComanda(new ComandaPlecareTraseu(3,autobuz1));
        operator.invocareComanda(new ComandaPlecareTraseu(3, autobuz2));


        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
