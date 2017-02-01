package Lab001;

/*
 * Jason Ivey 1.25.17
 * 
 * Beta Build version 1.0.1 
 * 
 * Point object is a point of n-dimmensions
 * 
 * coordinates is a que data structure of FIFO
 * 
 * int dimmension is number of dimmensions this point exists on
 * 
 */
public class Point {

    private Que coordinates;
    private int dimmension = 0;
    private final boolean DEBUG = true;
    //Main Constructor accepts unkown number of doubles

    public Point(double... inputCoordinates) {
        coordinates = new Que();
        if (DEBUG) {
            for (double inputVal : inputCoordinates) {
                System.out.println("Point called for input + " + Double.toString(inputVal));
            }
        }
        //input vallue iterates over inputCoordinates array
        for ( int iterations = 0; iterations < inputCoordinates.length; iterations++) {
            
            if (DEBUG) {
                System.out.println("Enque called for " + Double.toString(inputCoordinates[iterations]));
            }
            
            coordinates.enqueue(inputCoordinates[iterations]);
        }

        //setting dimmension to number of doubles in parameters
        dimmension = inputCoordinates.length;
    }

    // returns a copy of this point
    public Point copy() {

        //copy of coordinates so that coordinates will not be dequeued
        Que coordinateCopy = coordinates.copy();

        //array to be passed in argument for point
        double[] argumentalArray = new double[dimmension];

        for (int iterations = 0; iterations < dimmension; iterations++) {
            argumentalArray[iterations] = coordinateCopy.deque();
        }

        Point result = new Point(argumentalArray);
        return result;
    }

    /* ------------------------------------------------------------------*
   *          Getter and setter methods ahead, nothing special         *
   * ------------------------------------------------------------------*/
    public void setCoordinates(double[] input) {

        for (double inputVal : input) {
            coordinates.enqueue(inputVal);
        }

    }

    //returns coordinates in array form
    public double[] getCoordinates() {

        //copy of coordinates so that coordinates will not be dequeued
        Que coordinateCopy = coordinates.copy();

        //resulting array
        double[] result = new double[dimmension];

        for (int iterations = 0; iterations < dimmension; iterations++) {
            result[iterations] = coordinateCopy.deque();
        }

        return result;
    }

    //Returns int value of dimmensional level
    public int getDimmension() {
        return dimmension;
    }

    //To string method for formatting human readable coordinates
    public String toString() {
        Que coordinateCopy = coordinates.copy();

        String result = "( ";
        for (int iterations = 0; iterations < dimmension; iterations++) {
            result += coordinateCopy.deque() + ", ";
        }

        result = result.substring(0, result.length() - 2) + " )";

        return result;

    }

    //Comparison method
    public boolean equals(Point nonLocalPoint) {
        boolean result = true;

        double[] nonLocalCoordinates = nonLocalPoint.getCoordinates();
        double[] localCoordinates = this.getCoordinates();

        if (nonLocalCoordinates.length != localCoordinates.length) {
            return false;
        }

        for (int iterations = 0; iterations < localCoordinates.length; iterations++) {
            result = result && localCoordinates[iterations] == nonLocalCoordinates[iterations]; //main comparison loop
        }

        return result;
    }

}
