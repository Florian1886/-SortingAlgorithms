package consoleout;

import java.util.List;

public class ConsoleOut {



  public void consoleStartBubble(){
    System.out.println();
    System.out.println("Bubble sort");
    System.out.println("Złożonośc obliczeniowa : O(n^2)");
    System.out.println("Złożonośc pamięciowa : O(1)");
  }
  public void showTime(long time){
    System.out.println();
    System.out.println("Time = " + time/1000 + "ms");
  }
  public void consoleStartQuick(){
    System.out.println();
    System.out.println("Quick sort");
    System.out.println("Złożonośc obliczeniowa : O(n*log n)");
    System.out.println("Złożonośc pamięciowa : O(log n)");
  }
  public void consoleStartCounting(){
    System.out.println();
    System.out.println("Counting sort");
    System.out.println("Złożonośc obliczeniowa : O(n+k)");
    System.out.println("Złożonośc pamięciowa : O(k)");
  }
  public void printResult(List<Integer> list){
    for(Integer number : list){
      System.out.print(number + " ");
    }
  }
}
