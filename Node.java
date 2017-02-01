package Lab001;

// Jason Ivey Node Class for Que Data Structure
public class Node{
  //private double value is the numeric value of a node 
  private double value;
  // Node next allows for the data structure to be recursivly accesed 
  private Node next;
  
  //Constructor for the node object (double, Node)
  public Node(double inputVal, Node inputNode){
    //initializes object's atributtes
    this.value = inputVal;
    this.next = inputNode;
  }
  
  //overloaded constructor for incindents of null next node (double)
  public Node(double inputVal) {
    this.value = inputVal;
    //meaningless assingment operation, included only to highlight null state
    this.next = null;
  }
  
  //accessor and mutator methods ahead
  public double getVal(){
    return this.value;
  }
  
  public Node getNext(){
   return this.next; //returns the next node
  }
  
  public void setVal(double inputVal){
    this.value = inputVal; //sets a certian node's value
  }
  
  //sets next node
  public void setNext(Node inputNode){
   this.next = inputNode; 
  }
}
