public class TesterQue{
  public static void main(String args[]){
    Que myQ = new Que();
    for (double x = 0.0; x <= 100; x++){
      myQ.enqueue(x);
    }
     for (double x = 0.0; x <= 100; x++){
      System.out.print(myQ.deque() + " ");
    }
  }
}