package org.java.ciclabile;

public class Interi {

    private int[] numArray = new int[10];
    private int counter = 0;

    public Interi(int[] array) {
        this.numArray = array;
    }

    public boolean hasAncoraElementi() {
        return counter < numArray.length;
    }

    public void getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            System.out.print(numArray[counter] + " ");
            counter++;
        } else {
            counter = 0;
            System.out.println();
            System.out.println("Lista finita, ricominciamo dal primo elemento:");
            System.out.print(numArray[counter] + " ");
            counter++;
        }

    }

}
