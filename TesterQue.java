public class TesterQue{
  public static void main(String args[]){
    Que myQ = new Que();
    for (double x = 0.0; x <= 100; x++){
      myQ.enqueue(x);
    }
    Que copy = myQ.copy();
    System.out.print(" Dequeing copy : " + copy.deque());
    for (double x = 1.0; x <= 100; x++){
     System.out.print(copy.deque());
    }
    System.out.print(" Dequeing myQ : " + myQ.deque());
    for (double x = 1.0; x <= 100; x++){
     System.out.print(myQ.deque());
    }
  }
}