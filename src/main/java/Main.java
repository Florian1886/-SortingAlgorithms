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

    //Bubble
     new BubbleSort(listBubble);
    //Quick
    new QuickSort(listQuick);
    //Counting
    new CountingSort(listCounting);


  }
}
