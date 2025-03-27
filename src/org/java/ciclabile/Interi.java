package org.java.ciclabile;

public class Interi {

    private int[] numArray = new int[10];
    private int counter = 0;

    public Interi(int[] array) {
        this.numArray = array;
    }

    public Interi() {
        this.numArray = new int[0];
    }

    public void addElemento(int num) {
        
        int[] newArray = new int[numArray.length + 1];

        for(int i = 0; i < numArray.length; i++) {
            newArray[i] = numArray[i];
        }

        newArray[newArray.length - 1] = num;

        numArray = newArray;
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
