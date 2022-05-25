package Seminar12.teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import Seminar12.teste.categorii.CategorieBoundery;
import Seminar12.teste.categorii.CategorieUtilizareFake;
import Seminar12.teste.test.TestAgentieCuDubluri;
import Seminar12.teste.test.TestPachetTuristic;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestAgentieCuDubluri.class, TestPachetTuristic.class})
@Categories.IncludeCategory(CategorieUtilizareFake.class)
@Categories.ExcludeCategory(CategorieBoundery.class)
public class SuitaTesteCuFakeuri {

}

