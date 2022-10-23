package sorting.bucketsort;

import org.junit.jupiter.api.Test;
import sorting.countingsort.CountingSort;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BucketSortTest {

  @Test
  void sort() {
    List<Integer> list = Arrays.asList(3,6,2,5,9,0);
    var bucketSort = new BucketSort(list);
    List<Integer> listSolved = Arrays.asList(0,2,3,5,6,9);
    assertEquals(listSolved, bucketSort.sort());
  }
}