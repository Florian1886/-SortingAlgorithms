package sorting.countingsort;

import sorting.Sorting;
import sorting.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort extends Sort implements Sorting {

  public CountingSort(List<Integer> list) {
    super(list);
  }

  @Override
  public void sort() {
    consoleOut.consoleStartCounting();
    final long startTime = timeCounter.getTime();
    List<Integer> copiedList = this.getList();
    int max = 0;
    for (Integer integer : copiedList) {
      if (integer > max) {
        max = integer;
      }
    }
    int[] count = new int[max + 1];
    Arrays.fill(count, 0);

    for (Integer integer : copiedList) {
      count[integer]++;
    }
    List<Integer> resultSorted = new ArrayList<>();
    for (int i = 0; i < max + 1; i++) {
      while (count[i] > 0) {
        resultSorted.add(i);
        count[i]--;
      }
    }
    final long endTime = timeCounter.getTime();
    final long time = timeCalculator.calculateTime(startTime, endTime);
    consoleOut.printResult(resultSorted);
    consoleOut.showTime(time);
  }
}
