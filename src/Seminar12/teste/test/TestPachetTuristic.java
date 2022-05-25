package Seminar12.teste.test;

import Seminar12.clase.PachetTuristic;
import Seminar12.clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import Seminar12.teste.categorii.CategorieBoundery;
import Seminar12.teste.categorii.CategorieUtilizareFake;
import Seminar12.teste.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class TestPachetTuristic {

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testPoateRezervaVarstaEligibila(){
        PersoanaFake persoanaFake=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Barcelona",300.0);
        persoanaFake.setVarsta(22);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testPoateRezervaVarstaMaiMica(){
        PersoanaFake persoanaFake=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Barcelona",300.0);
        persoanaFake.setVarsta(16);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testAplicaDiscountVarsta(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(67);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Barcelona",300.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(270.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category({CategorieBoundery.class,CategorieUtilizareFake.class})
    public void testBoundaryAplicaDiscountVarsta(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Barcelona",300.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(270.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testNuAplicaDiscount(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(30);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Barcelona",300.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(300.0,pachetTuristic.getPret(),0.01);
    }



}
