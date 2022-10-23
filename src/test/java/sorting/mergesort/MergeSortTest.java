package sorting.mergesort;

import org.junit.jupiter.api.Test;
import sorting.quicksort.QuickSort;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

  @Test
  void sort() {
    List<Integer> list = Arrays.asList(3,6,2,5,9,0);
    var mergesort = new MergeSort(list);
    List<Integer> listSolved = Arrays.asList(0,2,3,5,6,9);
    assertEquals(listSolved, mergesort.sort());
  }
}