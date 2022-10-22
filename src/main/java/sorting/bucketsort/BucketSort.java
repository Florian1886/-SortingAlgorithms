package sorting.bucketsort;

import config.SortingAlgorithmsConfiguration;
import sorting.Sorting;
import sorting.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort extends Sort implements Sorting {

  private final int quantityBuckets = SortingAlgorithmsConfiguration.NUMBER_OF_BUCKETS; //zmienic

  public BucketSort(List<Integer> list) {
    super(list);
    consoleOut.consoleStartBucket();
    final long startTime = timeCounter.getTime();
    list = this.sort();
    final long endTime = timeCounter.getTime();
    final long time = timeCalculator.calculateTime(startTime, endTime);
    consoleOut.printResult(list);
    consoleOut.showTime(time);
  }

  @Override
  public List<Integer> sort() {
    List<Integer> copiedList = this.getList();
    ArrayList<Integer>[] buckets = new ArrayList[quantityBuckets];
    for (int i = 0; i < quantityBuckets; i++) {
      buckets[i] = new ArrayList<Integer>();
    }
    for (Integer integer : copiedList) {
      int bucketIndex = integer / quantityBuckets;
      buckets[bucketIndex].add(integer);
    }
    for (int i = 0; i < quantityBuckets; i++) {
      Collections.sort(buckets[i]);
    }
    List<Integer> resultSorted = new ArrayList<>();
    for (int i = 0; i < quantityBuckets; i++) {
      resultSorted.addAll(buckets[i]);
    }
    return resultSorted;
  }
}
