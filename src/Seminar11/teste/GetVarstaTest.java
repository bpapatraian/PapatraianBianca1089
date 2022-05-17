package Seminar11.teste;

import Seminar11.clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaTest {
    private Persoana persoana;
    //Right-BICEP
    @Test
    public void getVarstaRight() {
        persoana = new Persoana("Bianca", "6000202263498");
        int varsta=persoana.getVarsta();
        assertEquals(22,varsta);
    }

    @Test
    public void getVarstaBoundary() {
        persoana = new Persoana("Bianca", "3000101263498");
        int varsta=persoana.getVarsta();
        assertEquals(222,varsta);
    }

    @Test
    public void getVarstaBoundary2() {
        persoana = new Persoana("Bianca", "2991231263498");
        int varsta=persoana.getVarsta();
        assertEquals(22,varsta);
    }
    @Test
    public void getVarstaBoundary3() {
        persoana = new Persoana("Bianca", "6220517263498");
        int varsta=persoana.getVarsta();
        assertEquals(0,varsta);
    }
    @Test
    public void getVarstaBoundary4() {
        persoana = new Persoana("Bianca", "6040518263498");
        int varsta=persoana.getVarsta();
        assertEquals(17,varsta);
    }

    //  @Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorCondition() {
        persoana = new Persoana("Bianca", "6220517263498");
        int varsta= persoana.getVarsta();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorCondition2() {
        persoana = new Persoana("Bianca", null);
        int varsta= persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana = new Persoana("Bianca", "6000101263498");
        int varsta= persoana.getVarsta();
    }

    //CORRECT
    @Test
    public void getVarstaOrder() {
        persoana = new Persoana("Bianca", "5030101263498");
        Persoana persoana2 = new Persoana("Mihaela", "5001231263498");
        assertTrue(persoana2.getVarsta()>persoana.getVarsta());
    }


}