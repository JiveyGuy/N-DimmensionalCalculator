/*
 * Jason Ivey 1.25.17
 * 
 * Beta Build version 1.0.0 not stable
 * 
 * Point object is a point of n-dimmensions
 * 
 * coordinates is a que data structure of FIFO
 * 
 * int dimmension is number of dimmensions this point exists on
 * 
 */

public class Point{
  private Que coordinates;
  private int dimmension = 0;
  
  //Main Constructor accepts unkown number of doubles
  public Point(double...inputCoordinates){
    
    //input vallue iterates over inputCoordinates array
    for (double inputVal: inputCoordinates ){
      coordinates.enqueue(inputVal); 
    }
    
    //setting dimmension to number of doubles in parameters
    dimmension = inputCoordinates.length;
  }
  
 
  
}