package org.java.ciclabile;

public class Main {
    public static void main(String[] args) {

        final int[] numArray = { 1, 2, 3, 4, 5 };

        // Costruttore con array di int atteso

        System.out.println("Costruttore con array di interi atteso");

        Interi obj = new Interi(numArray);
        obj.getElementoSuccessivo();
        obj.getElementoSuccessivo();
        obj.getElementoSuccessivo();
        obj.getElementoSuccessivo();
        obj.getElementoSuccessivo();
        obj.getElementoSuccessivo();
        obj.getElementoSuccessivo();
        obj.getElementoSuccessivo();


        System.out.println();
        System.out.println();
        
        System.out.println("Costruttore senza parametri attesi");

        
        // Costruttore senza parametri attesi

        Interi obj2 = new Interi();
        obj2.addElemento(1);
        obj2.addElemento(2);
        obj2.addElemento(3);
        obj2.addElemento(4);
        obj2.addElemento(5);
        obj2.addElemento(6);
        obj2.addElemento(7);


        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();

        // in questo caso se prima di aggiungere i nuovi elementi cerco quello successivo all'ultimo presente, non lo trovo e ricomincia dacapo.
        // se invece aggiungo altri elementi l'array si allunga. Commentare e decomentare il codice sotto per testarlo:

        // obj2.getElementoSuccessivo();

        obj2.addElemento(8);
        obj2.addElemento(9);
        obj2.addElemento(10);
        obj2.addElemento(11);
        obj2.addElemento(12);
        obj2.addElemento(13);
        obj2.addElemento(14);

        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
        obj2.getElementoSuccessivo();
    }
}
