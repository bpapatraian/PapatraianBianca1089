package Seminar7.Proxy.program;

import Seminar7.Proxy.clase.Autobuz;
import Seminar7.Proxy.clase.ProxyAutobuzDeNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Andrei", 40, 65);
        autobuz.opresteInStatie();
        Autobuz autobuz1=new Autobuz("Andrei", 40, 9);
        autobuz.opresteInStatie();
        ProxyAutobuzDeNoapte autobuzDeNoapte1=new ProxyAutobuzDeNoapte(autobuz1);
        autobuzDeNoapte1.opresteInStatie();
    }
}
