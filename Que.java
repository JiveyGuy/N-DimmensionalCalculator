package Lab001;

/*
 * Jason Ivey 1.25.17
 * 
 * Lab 1 Beta Build version 1.0.1 
 * 
 * Que data structure of FIFO type
 * 
 */

public class Que{
  //makes use of this nested private exception
  
  //private node first will be que holder for first node
  private Node first; 
  
  //priavet node last will hold last node in que
  private Node last;
  
  //constructor for the que, is basically useless
  public Que(){
    this.first = null;
    this.last = null;
  }
  
  //retunrs whether the que is empty or not
  public boolean isEmpty(){
    return first == null; 
  }
  
  
  
  public void enqueue(double input) {
    Node newNode = new Node(input);
    if (isEmpty()){
      first = newNode;
    } else { 
      last.setNext(newNode); 
    }
    last = newNode;
  }
  
  //This will take a peek at the value at the first position in our que
  public double peek(){
    return first.getVal();
  }
  
  //This will return the first value and move the first to its next node
  public double deque(){
    try {
      if(isEmpty() )
        throw new EmptyQueException();
      
      double returnVal = first.getVal();
      this.first = first.getNext();
      //Checking if first and last point to the same position in memory.
      if (this.first == this.last){ 
        
        //Tries to update last pointer
        try {
          this.last = this.first.getNext(); 
        } catch (Exception e) {
          this.last = null;  
        }
      }
      return returnVal;
      
      //Error if pointing to null. 
    } catch (EmptyQueException empty) {
      System.out.println("Error at deque() EmptyQueException"); 
    }
    //Error value to return if error. 
    return 666.0;
  }
  
  public Que copy(){ //diferents signature for a copy method
    double[] intermediateVal = copy(first);
    Que result = new Que();
    for ( double value : intermediateVal ) {
      result.enqueue(value); 
    }
    return result;
  }
  
  //returns a copy of a que in doubles
  private double[] copy(Node iterator){
    int length = this.length();
    double[] result = new double[length];
    
    for (int iterations = 0; iterations < length(); iterations++){
      result[iterations] = iterator.getVal();
      iterator = iterator.getNext();
    }
    
    return result;
  }
  
  //helper method for length that is recursive
  public int length(){
    return length(first); 
  }
  
  //Returns length of que
  private int length(Node iterator){
    if(iterator == null )
      return 0;
    else return 1 + length(iterator.getNext());
  }
}

//exception specific to this Que data type
class EmptyQueException extends Exception{
  public EmptyQueException(){
    super("The que is empty."); 
  }
}
