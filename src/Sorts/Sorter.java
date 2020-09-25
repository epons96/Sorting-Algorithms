/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

/**
 *
 * @author Eduardo
 */
import EDA.ListArray;

public class Sorter<T extends Comparable<T>> {

    
    public void quickSort(ListArray<T> array) {
        T pivote = array.get(0); 
        int izq = 0;
        int der = array.getSize() - 1;
        int i = izq; 
        int j = der; 
        T aux;
        while (i < j) {           
            while (array.get(i).compareTo(pivote) <= 0 && i < j) {
                i++; 
            }
            while (array.get(j).compareTo(pivote) > 0) {
                j--;         
            }
            if (i < j) {                                     
                array.swap(i, j);         
            }
        }

        array.set(izq, array.get(j)); 
        array.set(j, pivote); 
        ListArray<T> array1 = new ListArray();
        ListArray<T> array2 = new ListArray();
        for (int k = izq; k <= j - 1; k++) {
            array1.add(array.get(k));
        }
        for (int z = j + 1; z <= der; z++) {
            array2.add(array.get(z));
        }
        if (izq < j - 1) {
            quickSort(array1); 
        }
        if (j + 1 < der) {
            quickSort(array2);
        }
        int ct = 0;
        for (int k = izq; k <= j - 1; k++) {
            array.set(k, array1.get(ct++));
        }
        ct = 0;
        for (int k = j + 1; k <= der; k++) {
            array.set(k, array2.get(ct++));
        }
    }

    public void selectionSort(ListArray<T> array) {
        for (int i = 0; i < array.getSize() - 1; i++) {
            for (int j = i + 1; j < array.getSize(); j++) {
                if (array.get(i).compareTo(array.get(j)) > 0) {
                    array.swap(i, j);
                }
            }
        }
    }

    public void insertionSort(ListArray<T> array) {

        T elemento;
        int j;
        for (int i = 1; i < array.getSize(); i++) {
            elemento = array.get(i);
            j = i;
            while (j > 0 && elemento.compareTo(array.get(j - 1)) == -1) {
                array.set(j, array.get(j - 1));
                j--;
            }
            array.set(j, elemento);
        }

    }

    public void BrickSort(ListArray<T> array) {
        T temp;
        for (int i = array.getSize() - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array.get(j).compareTo(array.get(i)) > 0) {

                    array.swap(i, j);
                }

            }
        }

    }
}
