package Seminar9.Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
   private List<MementoAutobuz>listaMemento;

    public ManagerAutobuz() {
        this.listaMemento = new ArrayList<>();
    }
    public void addMemento(MementoAutobuz memento)
    {
        this.listaMemento.add(memento);
    }
    public MementoAutobuz getMemento(int index)
    {
        return listaMemento.get(index);
    }
}
