package Seminar12.teste.test;

import Seminar12.clase.AgentieTurism;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import Seminar12.teste.categorii.CategorieBoundery;
import Seminar12.teste.categorii.CategorieUtilizareDummy;
import Seminar12.teste.categorii.CategorieUtilizareFake;
import Seminar12.teste.dubluri.PachetDummy;
import Seminar12.teste.dubluri.PachetFake;

import static org.junit.Assert.assertEquals;

public class TestAgentieCuDubluri {
    //dummy
    @Test
    @Category(CategorieUtilizareDummy.class)
    public void testAdaugaPachet() {
        PachetDummy pachetDummy1 = new PachetDummy();
        AgentieTurism agentieTurism = new AgentieTurism();
        //agentieTurism.adaugaPachet(pachetDummy1);
    }
    //fake
    @Test
    @Category(CategorieUtilizareFake.class)
    public void testCalculeazaPretTotal() {
        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();
        pachetFake1.setValoareGetPret(1000);
        pachetFake2.setValoareGetPret(1500);
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);
        assertEquals(2500,agentieTurism.calculareSumaTotalaPachete(),0.001);

    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testInverseCalculeazaPretTotal(){
        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();
        pachetFake1.setValoareGetPret(1000);
        pachetFake2.setValoareGetPret(1500);
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        double total=agentieTurism.calculareSumaTotalaPachete();
        assertEquals(pachetFake1.getPret(),total-pachetFake2.getPret(),0.01);
    }

    @Test
    @Category({CategorieBoundery.class,CategorieUtilizareFake.class})
    public void testBoundaryCalculeazaPretTotal(){
        AgentieTurism agentieTurism=new AgentieTurism();
        double suma=agentieTurism.calculareSumaTotalaPachete();
        assertEquals(0,suma,0.01);
    }

    @Test(timeout = 100)
    @Category(CategorieUtilizareFake.class)
    public void testPerformanceCalculeazaPretTotal(){
        AgentieTurism agentieTurism=new AgentieTurism();
        for(int i=0;i<100;i++){
            PachetFake pachetFake=new PachetFake();
            pachetFake.setValoareGetPret(10);
            agentieTurism.adaugaPachet(pachetFake);
        }
        double total=agentieTurism.calculareSumaTotalaPachete();

    }
}