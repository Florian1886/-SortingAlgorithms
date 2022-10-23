package sorting.countingsort;

import org.junit.jupiter.api.Test;
import sorting.mergesort.MergeSort;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

  @Test
  void sort() {
    List<Integer> list = Arrays.asList(3,6,2,5,9,0);
    var countingSort = new CountingSort(list);
    List<Integer> listSolved = Arrays.asList(0,2,3,5,6,9);
    assertEquals(listSolved, countingSort.sort());
  }
}