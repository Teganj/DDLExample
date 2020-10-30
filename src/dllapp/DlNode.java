/*
Tegan Jennings
29/10/2020
Data Structures
Double Linked List
*/
package dllapp;

class DlNode {
    private Object element;
    private DlNode next;
    private DlNode prev;
    
    public DlNode(Object e, DlNode n, DlNode p){
        element = e;
        next = n;
        prev = p;
    }
    
    public DlNode getNext(){
        return next;
    }
    public void setNext(DlNode n){
        next = n;
    }
    public DlNode getPrev(){
        return prev;
    }
    public void setPrev(DlNode p ){
        prev = p;
    }
    public Object getElement(){
        return element;
    }
    public void setElement(Object e){
        element = e;
    }
}
