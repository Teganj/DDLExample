/*
Tegan Jennings
29/10/2020
Data Structures
Double Linked List
*/
package dllapp;

public interface LinearList {
  public boolean isEmpty();
  public int size();
  public void setCurrent(int index);
  public Object get(int index);
  public void remove(int index);
  public void add(int index, Object theElement);
  public void printList();
  public void add(Object element);
}

