package Seminar7.Proxy.clase;

public class ProxyAutobuzDeNoapte implements MijlocTransport {

    Autobuz autobuz;

    public ProxyAutobuzDeNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrCalatori()>0)
        {
            autobuz.opresteInStatie();
        }
        else System.out.println("Nu opreste in statie");
    }
}
