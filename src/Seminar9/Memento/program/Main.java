package Seminar9.Memento.program;

import Seminar9.Memento.clase.Autobuz;
import Seminar9.Memento.clase.ManagerAutobuz;

public class Main {
    public static void main(String[] args){

        Autobuz autobuz=new Autobuz("John", 11.7, 21, "Audi", 2010);
        System.out.println(autobuz.toString());

        ManagerAutobuz manager=new ManagerAutobuz();
        manager.addMemento(autobuz.creeazaMemento());
        autobuz.setNumeSofer("Jade");
        autobuz.setConsumMediu(15.3);
        manager.addMemento(autobuz.creeazaMemento());

        System.out.println(autobuz.toString());
        autobuz.restaurareMemento(manager.getMemento(0));
        System.out.println(autobuz.toString());


    }
}
