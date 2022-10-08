import bubblesort.BubbleSort;
import quicksort.QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    List<Integer> listBubble = new ArrayList<>();
    int helper;
    for(int i = 0; i < 50; i++){
      helper = rand.nextInt(0,100);
      listBubble.add(helper);
      System.out.print(helper + " ");
    }
    List<Integer> listQuick = listBubble;

    System.out.println();
    System.out.println("Bubble sort");
    System.out.println("Złożonośc obliczeniowa : O(n^2)");
    System.out.println("Złożonośc pamięciowa : O(1)");

    BubbleSort bubbleSort = new BubbleSort(listBubble);

    long startBubble = System.nanoTime();
    List<Integer> resultBubble  = bubbleSort.sort();
    long endBubble = System.nanoTime();

    for(int s : resultBubble){
      System.out.print(s + " ");
    }

    System.out.println();
    System.out.println("Time = " + (endBubble - startBubble)/1000 + "ms");
    //next

    System.out.println();
    System.out.println("Quick sort");
    System.out.println("Złożonośc obliczeniowa : O(n*log n)");
    System.out.println("Złożonośc pamięciowa : O(log n)");

    QuickSort quickSort = new QuickSort(listQuick);

    long startQuick = System.nanoTime();
    List<Integer> resultQuick  = quickSort.sort();
    long endQuick = System.nanoTime();

    for(int s : resultQuick){
      System.out.print(s + " ");
    }

    System.out.println();
    System.out.println("Time = " + (endQuick - startQuick)/1000 + "ms");
  }
}
