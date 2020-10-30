/*
Tegan Jennings
29/10/2020
Data Structures
Double Linked List
*/
package dllapp;

public class DLLApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DLList dl = new DLList() ; 
        dl.add(1, "Bill");
        dl.add(2, "Alice");
        dl.add(3, "Sarah");
        dl.add(4, "Paul");
        dl.add(3, "Danny");
        dl.add(1, "AnnMarie");

        System.out.println("Size of the D list "+dl.size());
        System.out.println("List of names in Double Linked list ..  ");
        dl.printList();
        
        dl.remove(1);
        dl.remove(3);
        System.out.println("List of names in Double Linked list after removal are ..  ");
        
        dl.printList();
        }
    
}
