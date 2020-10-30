/*
Tegan Jennings
29/10/2020
Data Structures
Double Linked List
*/
package dllapp;

public class DLList {
    private DlNode head;
    private DlNode last;
    private DlNode curr;
    private int size;
    
    DLList(){
        head = null;
        last = null;
        size =0;
        curr = head;
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }
    public int size(){
        return size;    
    }
    public void setCurrent(int index){
        curr = head;
        for (int k = 1; k < index; k++){
            curr = curr.getNext();
        }
    }
    public Object get(int index){
        setCurrent(index);
        return curr;
    }
    public void add(int index, Object theElement){
        if (size ==0){
            DlNode newNode = new DlNode (theElement, null, null);
            curr = newNode;
            head = curr;
            last = curr;
            size++;
        }
        else{
            if(index ==1){
                setCurrent(index);
                DlNode newNode = new DlNode(theElement, curr, null);
                curr.setPrev(newNode);
                head = newNode;
                size++;
            }
            else if(index == (size +1)){
               setCurrent(size);
               DlNode newNode = new DlNode(theElement, null, curr);
               curr.setNext(newNode);
               last = newNode;
               size++;
            }
            else{ //index = 3
                setCurrent(index);
                DlNode newNode = new DlNode(theElement, curr, curr.getPrev());
                curr.getPrev().setNext(newNode); //setting pie value
                curr.setPrev(newNode);
                size++;
            }
        } 
    }
    
    public void remove(int index){
        if(size > 0 ){
            setCurrent(index);
            
            if(curr == head){
                head = curr.getNext();
                head.setPrev(null);
            }
            else if (curr == last){
                last = curr.getPrev();
                last.setNext(null);
            }
            else{
            DlNode prev = curr.getPrev();
            DlNode next = curr.getNext();
        
            
            prev.setNext(next);
            next.setPrev(prev);
        }
            curr = null;
            size--;
        }
    }
 public void printList(){
     for(DlNode aNode = head; aNode != null; aNode = aNode.getNext())
         System.out.println(aNode.getElement());
     
 }
    
}
