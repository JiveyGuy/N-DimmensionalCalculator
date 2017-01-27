/*
 * Jason Ivey 1.25.17
 *
 * Lab 1 Beta Build version 1.0.1 not stable
 *
 * Storgare object for Lab 01
 *
 * Line[] is lines to store
 *
 * Point[] is  points to store
 *
 */

public class Storage {

  Line[] lines;
  Point[] points;

  //Constructor does nothing, just here so we can have different instances of storage
  public Storage() {}


  //method for storing a line into the line array
  public void store(Line line) {

    if (lines == null) {
      lines = new Line[1];
      lines[0] = line;
    }

    else {


      /*adds line to lines array if array is not null
       *
       * on a side note I posted this code on the stack exchange so if it gets flagged for plagarism
       * check the source and you will see it was posted by me. Not sure if I can be cited for stealing my own code XD
       */

      Line[] newArray = new Line[lines.length + 1];

      for (int index = 0; index < lines.length; index++) {
        newArray[index] = lines[index];
      }

      newArray[newArray.length - 1] = line;

      lines = newArray;


    }

  }

  public void store(Point point) {

    if (points == null) {
      points = new Point[1];
      points[0] = point;

    }

    else {


      /*adds point to points array if array is not null
       *
       * on a side note I posted this code on the stack exchange so if it gets flagged for plagarism
       * check the source and you will see it was posted by me. Not sure if I can be cited for stealing my own code XD
       */

      Point[] newArray = new Point[points.length + 1];

      for (int index = 0; index < points.length; index++) {
        newArray[index] = points[index];
      }

      newArray[newArray.length - 1] = point;

      points = newArray;


    }

  }


  //returns a array of points from storage
  public Point[] getPoints() {

    Point[] result = new Point[points.length];
    for ( int iterations = 0; iterations < result.length; iterations++) {
      result[iterations] = points[iterations].copy();
    }
    return result;

  }


  //Returns the array fo lines from storage
  public Line[] getLines() throws DimmensionalError{

    Line[] result = new Line[lines.length];
    for ( int iterations = 0; iterations < result.length; iterations++) {
      result[iterations] = lines[iterations].copy();
    }
    return result;

  }


}