package Seminar12.teste.dubluri;

import Seminar12.clase.IPachetTuristic;
import Seminar12.clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private String sex;
    private int varsta;
    private boolean isCnp;

    public PersoanaFake() {
    }



    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return isCnp;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCnp(boolean cnp) {
        isCnp = cnp;
    }
}