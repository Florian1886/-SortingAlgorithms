import random.RandomListGenerator;
import sorting.bubblesort.BubbleSort;
import sorting.countingsort.CountingSort;
import sorting.quicksort.QuickSort;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    RandomListGenerator randomListGenerator = new RandomListGenerator();
    List<Integer> listRandom = randomListGenerator.generateNumbers();
    List<Integer> listBubble = new ArrayList<>(listRandom);
    List<Integer> listQuick = new ArrayList<>(listRandom);
    List<Integer> listCounting = new ArrayList<>(listRandom);

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
    //Quick

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
    //Counting

    System.out.println();
    System.out.println("Counting sort");
    System.out.println("Złożonośc obliczeniowa : O(n+k)");
    System.out.println("Złożonośc pamięciowa : O(k)");

    CountingSort countingSort = new CountingSort(listCounting);

    long startCounting = System.nanoTime();
    List<Integer> resultCounting  = countingSort.sort();
    long endCounting = System.nanoTime();

    for(int s : resultCounting){
      System.out.print(s + " ");
    }

    System.out.println();
    System.out.println("Time = " + (endCounting - startCounting)/1000 + "ms");

  }
}
