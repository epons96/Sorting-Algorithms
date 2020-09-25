/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDA;

/**
 *
 * @author Eduardo
 */
public interface IList<T> {
    void add(T x);
    void addAll(T[] l);    
    T get(int index);
    void set(int index, T x);
    void swap(int i, int j);
    int getSize();
    boolean isEmpty();
}
