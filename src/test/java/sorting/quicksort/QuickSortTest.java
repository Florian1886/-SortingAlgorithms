package sorting.quicksort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

  @Test
  void sort() {
    List<Integer> list = Arrays.asList(3,6,2,5,9,0);
    var quicksort = new QuickSort(list);
    List<Integer> listSolved = Arrays.asList(0,2,3,5,6,9);
    assertEquals(listSolved, quicksort.sort());
  }
}