/*
 * Jason Ivey 1.25.17
 * 
 * Lab 1 Beta Build version 1.0.1 not stable
 * 
 * Line object for Lab 1
 * 
 * pointOne is a point of n-dimmensions
 * 
 * pointTwo is also a point of n-dimmensions
 * 
 * 
 */

import java.lang.Math;

public class Line{
  
  private Point point[] = new Point[2];
  
  //Constructor method accepting 2 points
  public Line(Point one, Point two) throws DimmensionalError{
    
    if(one.getDimmension() != two.getDimmension() )
      throw new DimmensionalError("Line Construction failed due to points being in different dimmensions!");
    
    //Seting object var's to parameters
    point[0] = one.copy();
    
    point[1] = two.copy();
    
  }
  
  //default toString method for printing lines
  public String toString(){
    
    return "Point One: " + point[1].toString() + "\nPoint Two: " + point[1].toString();
    
  }
  
  //returns a copy fo this line in a different memory location
  public Line copy() throws DimmensionalError{
    
    Point pointOneCopy = point[0].copy();
    
    Point pointTwoCopy = point[1].copy();
    
    Line result = new Line(pointOneCopy, pointTwoCopy);
    
    return result;
    
  }
  
  
  //Checks if lines are equal to eachother
  public boolean equals( Line nonLocalLine){
    
    boolean result = true;
    
    Point nonLocalPoint[] = nonLocalLine.getPoints();
    
    for ( int iterations = 0; iterations < 3; iterations++){
      
      result = result && nonLocalPoint[iterations].equals(point[iterations]);
      
    }
    
    return result;
    
  }
  
  //returns an array of points
  public Point[] getPoints(){
    Point [] result = new Point[2];
    
    result[0] = point[0].copy();
    result[1] = point[1].copy();
    
    return result;
    
  }
  
  public double getLineLength() //calculation for line length
  {
    double addition = 0, result;
    
    double[] start = point[0].getCoordinates(), end = point[1].getCoordinates();
    
    for(int x = 0; x < point[0].getDimmension(); x++)
    {
      addition += Math.pow(( start[x] - end[x] ), 2);     
    }
    
    result = Math.sqrt(addition);
    
    return result;
    
  }
  
}

//Exception specific to the Line object
class DimmensionalError extends Exception{
  public  DimmensionalError(String message){
    super(message); 
  }
}