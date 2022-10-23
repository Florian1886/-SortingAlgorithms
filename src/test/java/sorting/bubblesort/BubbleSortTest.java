package sorting.bubblesort;

import org.junit.jupiter.api.Test;
import sorting.bucketsort.BucketSort;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

  @Test
  void sort() {
    List<Integer> list = Arrays.asList(3,6,2,5,9,0);
    var bubbleSort = new BubbleSort(list);
    List<Integer> listSolved = Arrays.asList(0,2,3,5,6,9);
    assertEquals(listSolved, bubbleSort.sort());
  }
}