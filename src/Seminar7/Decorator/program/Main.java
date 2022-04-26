package Seminar7.Decorator.program;

import Seminar7.Decorator.clase.DecoratorAbstract;
import Seminar7.Decorator.clase.DecoratorConcret;
import Seminar7.Decorator.clase.Printer;
import Seminar7.Decorator.clase.PrinterBilet;

public class Main {

    public static void main(String[] args) {
        Printer printer=new PrinterBilet();
        printer.print();


        DecoratorAbstract decoratorAbstract=new DecoratorConcret(printer, "La multi ani CTS!");
        decoratorAbstract.print();
        decoratorAbstract.printeazaMesaj();
    }
}

