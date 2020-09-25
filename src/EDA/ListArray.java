/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDA;

/**
 *
 * @author Eduardo
 */
public class ListArray<T> implements IList<T> {
    private int capacity;
    private int size;
    private T[] elements;
    
    public ListArray() {
        elements = (T[]) new Object[50];
        size = 0;
        capacity = 50;        
    }
    
    public ListArray(ListArray<T> l) {
        elements = (T[]) new Object[l.capacity];
        size = 0;
        capacity = l.capacity;
        for (int i = 0; i < l.getSize(); i++)
            this.add(l.get(i));
    }
    
    @Override
    public void add(T x) {
        if (size == capacity) {
            capacity += 50;
            T[] temp = (T[]) new Object[capacity];            
            for (int i = 0; i < size; i++)
                temp[i] = elements[i];
            elements = temp;
        }
        elements[size++] = x;
    }
    
    @Override
    public void addAll(T[] l) {        
        for (int i = 0; i < l.length; i++) {
            add(l[i]);
        }
    }
    
    @Override
    public T get(int index){
        return elements[index];
    }
    
    @Override
    public void set(int index, T x){
        elements[index] = x;
    }
    
    @Override
    public void swap(int i, int j){
        T temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;       
    }
    
    @Override
    public int getSize() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
   
    
}
